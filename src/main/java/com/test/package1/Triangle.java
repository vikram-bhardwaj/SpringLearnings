package com.test.package1;

public class Triangle
{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA()
	{
		return pointA;
	}

	public void setPointA(Point pointA)
	{
		this.pointA = pointA;
	}

	public Point getPointB()
	{
		return pointB;
	}

	public void setPointB(Point pointB)
	{
		this.pointB = pointB;
	}

	public Point getPointC()
	{
		return pointC;
	}

	public void setPointC(Point pointC)
	{
		this.pointC = pointC;
	}

	
	public void draw()
	{
		System.out.println("Point A object, value of X = " + getPointA().getX() + "| Point A object, value of Y = " + getPointA().getY());
		System.out.println("Point B object, value of X = " + getPointB().getX() + "| Point B object, value of Y = " + getPointB().getY());
		System.out.println("Point C object, value of X = " + getPointC().getX() + "| Point C object, value of Y = " + getPointC().getY());
	}
}
