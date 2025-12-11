package com.example.newsapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/news-app")  // URL to access this servlet
public class NewsServlet extends HttpServlet {

    // Simulate fetching headlines from a service
    private List<String> getHeadlinesFromService() {
        // TODO: Replace this with real data fetching (DB, API, etc.)
        List<String> headlines = new ArrayList<>();
        headlines.add("Breaking News: AI Revolutionizes Tech Industry");
        headlines.add("Sports Update: Local Team Wins Championship");
        headlines.add("Economy: Stock Market Hits Record Highs");
        return headlines;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Fetch headlines
        List<String> headlinesList = getHeadlinesFromService();

        // Avoid null pointer
        if (headlinesList == null) {
