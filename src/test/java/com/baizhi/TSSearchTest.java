package com.baizhi;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.FSDirectory;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.IOException;
import java.nio.file.Paths;

public class TSSearchTest {

    @Test
    public void testSearch() throws IOException, ParseException {
        FSDirectory fsDirectory = FSDirectory.open(Paths.get("F:\\index\\03"));
        IndexReader indexReader = DirectoryReader.open(fsDirectory);
        IndexSearcher indexSearcher = new IndexSearcher(indexReader);

        //查询解析器对象   作用  解析查询表达式  域名：条件
        //参数一：域名(默认域)
        QueryParser queryParser = new QueryParser("content", new IKAnalyzer());

        Query query = null;

        query  = queryParser.parse("鹅鹅鹅");

        TopDocs topDocs = indexSearcher.search(query,10);

        ScoreDoc[] scoreDocs = topDocs.scoreDocs;
        for (ScoreDoc scoreDoc : scoreDocs) {
            int doc = scoreDoc.doc;
            Document document = indexReader.document(doc);

            System.out.println(
                    scoreDoc.score+"|"+
                    document.get("id") + "|" +
                            document.get("title") + "|" +
                            document.get("content") + "|" +
                            document.get("author")
                );
            }
            indexReader.close();
        }
    }
