package com.tyss.article.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.tyss.article.beam.Article;

public class ArticleController {
	private String filePath = "C:\\Users\\sande\\OneDrive\\Desktop\\Desktop\\basic-jdbc\\article_project\\src\\aticle.csv";

	public void saveArticle(Article a) {
		try {
			FileOutputStream fo = new FileOutputStream(filePath, true);
			byte[] b = a.toString().getBytes();
			fo.write(b);
			fo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> fetchAllArticle() {
		ArrayList<String> al = new ArrayList<String>();
		try {
			FileInputStream fi = new FileInputStream(filePath);
			InputStreamReader ir = new InputStreamReader(fi);
			BufferedReader reader = new BufferedReader(ir);
			String line = reader.readLine();
			while (line != null) {
				al.add(line);
				line = reader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return al;
	}

}
