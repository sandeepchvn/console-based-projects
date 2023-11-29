package com.tyss.article.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.tyss.article.beam.Article;
import com.tyss.article.controller.ArticleController;

public class ArticleView {
	static Scanner sc = new Scanner(System.in);
	static ArticleController ac = new ArticleController();

	public static void main(String[] args) {
		while (true) {
			System.out.println("enter 1 to save Article");
			System.out.println("enter 2 to find all article");
			switch (sc.nextInt()) {
			case 1: {
				Article a = new Article();
				System.out.println("enter the title Of article");
				sc.nextLine();
				a.setTitle(sc.nextLine());
				System.out.println("enter Author Of article");
				a.setAuthor(sc.nextLine());
				System.out.println("enter type  Of article");
				a.setTypeOfArticle(sc.nextLine());
				System.out.println("enter number of lines in page ");
				a.setNumberOfLinesInPage(sc.nextInt());
				System.out.println("enter number of pages");
				a.setNumOfPages(sc.nextInt());
				System.out.println("enter review for article");
				sc.nextLine();
				a.setReviewAboutArticle(sc.nextLine());
				System.out.println("enter conclusion of article");
				a.setConclusion(sc.nextLine());
				ac.saveArticle(a);
				System.out.println("saved--!");
				break;
			}
			case 2: {
				findAll();
				break;
			}
			}
		}
	}

	public static void findAll() {
		Comparator<Article> com = (a1, a2) -> a1.getNumOfPages() > a2.getNumOfPages() ? 1 : -1;
		ArrayList<String> al = ac.fetchAllArticle();
		ArrayList<Article> sortingArt = new ArrayList<Article>();
		for (String line : al) {
			Article a = new Article();
			a.setTitle(line.split(",")[0]);
			a.setAuthor(line.split(",")[1]);
			a.setTypeOfArticle(line.split(",")[2]);
			a.setNumberOfLinesInPage(Integer.parseInt(line.split(",")[3]));
			a.setNumOfPages(Integer.parseInt(line.split(",")[4]));
			a.setReviewAboutArticle(line.split(",")[5]);
			a.setConclusion(line.split(",")[6]);
			sortingArt.add(a);
			Collections.sort(sortingArt, com);
//			System.out.println("----------------------------------");
//			System.out.println("title Of article----" + a.getTitle());
//			System.out.println("Author Of article----" + a.getAuthor());
//			System.out.println("type  Of article----" + a.getTypeOfArticle());
//			System.out.println("number of lines in page----" + a.getNumberOfLinesInPage());
//			System.out.println("number of pages----" + a.getNumOfPages());
//			System.out.println("review for article----" + a.getReviewAboutArticle());
//			System.out.println("conclusion of article----" + a.getConclusion());
//			System.out.println();
//			System.out.println();
//			System.out.println();
//			System.out.println();
			System.out.println();
			System.out.println();

		}
		System.out.println("All Articles...");
		for (Article a1 : sortingArt)
			System.out.print(a1);
	}
}
