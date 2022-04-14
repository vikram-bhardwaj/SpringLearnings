package com.test.package1;

import java.util.List;

public class Triangle
{
	private List<Point> points;
	
	public List<Point> getPoints()
	{
		return points;
	}

	public void setPoints(List<Point> points)
	{
		this.points = points;
	}

	public void draw()
	{
		for(Point point: points)
		{
			System.out.println("Point A object, value of X = " + point.getX() + "| Point A object, value of Y = " + point.getY());
		}
	}
}
