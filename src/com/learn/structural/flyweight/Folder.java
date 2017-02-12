package com.learn.structural.flyweight;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

class Folder extends JPanel
{
private Color color;
final int W = 50, H = 30;
public Folder(Color c)
{
color = c;
}
//-------------------------------
public void Draw(Graphics g, int tx, int ty, String name)
{
g.setColor(Color.black); //outline
g.drawRect(tx, ty, W, H);
g.drawString(name, tx, ty + H+15); //title
g.setColor(color); //fill rectangle
g.fillRect(tx+1, ty+1, W-1, H-1);
g.setColor(Color.lightGray); //bend line
g.drawLine(tx+1, ty+H-5, tx+W-1, ty+H-5);
g.setColor(Color.black); //shadow lines
g.drawLine(tx, ty+H+1, tx+W-1, ty+H+1);
g.drawLine(tx+W+1, ty, tx+W+1, ty+H);
g.setColor(Color.white); //highlight lines
g.drawLine(tx+1, ty+1, tx+W-1, ty+1);
g.drawLine(tx+1, ty+1, tx+1, ty+H-1);
}
}