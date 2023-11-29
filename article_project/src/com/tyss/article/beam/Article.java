package com.tyss.article.beam;

import java.io.Serializable;

public class Article implements Serializable{
private String title;
private String author;
//private String writtenDate;
private String typeOfArticle;
private int numberOfLinesInPage;
private int numOfPages;
private String reviewAboutArticle;
private String conclusion;

@Override
public String toString() {
	return title + "," + author + ","+ typeOfArticle+ ","+  numberOfLinesInPage + "," + numOfPages + ","
+ reviewAboutArticle + ","  + conclusion + "\n";
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getTypeOfArticle() {
	return typeOfArticle;
}
public void setTypeOfArticle(String typeOfArticle) {
	this.typeOfArticle = typeOfArticle;
}
public int getNumberOfLinesInPage() {
	return numberOfLinesInPage;
}
public void setNumberOfLinesInPage(int numberOfLinesInPage) {
	this.numberOfLinesInPage = numberOfLinesInPage;
}
public int getNumOfPages() {
	return numOfPages;
}
public void setNumOfPages(int numOfPages) {
	this.numOfPages = numOfPages;
}
public String getReviewAboutArticle() {
	return reviewAboutArticle;
}
public void setReviewAboutArticle(String reviewAboutArticle) {
	this.reviewAboutArticle = reviewAboutArticle;
}
public String getConclusion() {
	return conclusion;
}
public void setConclusion(String conclusion) {
	this.conclusion = conclusion;
}

}
