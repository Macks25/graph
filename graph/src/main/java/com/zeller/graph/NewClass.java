/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zeller.graph;

/**
 *
 * @author zelle
 */
public class NewClass {
    
    public static void main(String[] args) {
        Graph greundesGraph = new Graph();
        
        Vertex tom = new Vertex("Tom");
        greundesGraph.addVertex(tom);
        Vertex otto = new Vertex("otto");
        greundesGraph.addVertex(otto);
        Vertex franz = new Vertex("franz");
        greundesGraph.addVertex(franz);
        Vertex paul = new Vertex("paul");
        greundesGraph.addVertex(paul);
        Vertex peter = new Vertex("peter");
        greundesGraph.addVertex(peter);
        
        Edge e1 = new Edge(paul, otto, 1);
        Edge e2 = new Edge(tom, franz, 1);
        Edge e3 = new Edge(franz, paul, 1);
        Edge e4 = new Edge(paul, tom, 1);
        
        greundesGraph.addEdge(e1);
        greundesGraph.addEdge(e2);
        greundesGraph.addEdge(e3);
        greundesGraph.addEdge(e4);
        
        System.out.println("Paul: "+ greundesGraph.getGrad(paul));
        
        System.out.println("kleinster Grad: "+ greundesGraph.minimalgrad());
        
        List<Vertex> res = new List<Vertex>();
        List<List<Vertex>> resli = new List<List<Vertex>>();
        greundesGraph.fastestrout(otto, tom, res, resli);
     
        resli.toFirst();
        
        while(resli.hasAccess()){
            System.out.println("----");
            List<Vertex> l1 = resli.getContent();
            
            l1.toFirst();
            while(l1.hasAccess()){
                System.out.println(l1.getContent().getID());
                l1.next();
            }
            resli.next();
        }
    }
}
