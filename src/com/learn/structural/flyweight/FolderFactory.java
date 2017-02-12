package com.learn.structural.flyweight;

import java.awt.Color;

/***
 * Suppose we want to draw a small folder icon with a name under it for
each person in a an organization. If this is a large organization, there could be
a large number of such icons, but they are actually all the same graphical
image. Even if we have two icons, one for “is Selected” and one for “not
Selected” the number of different icons is small. In such a system, having an
icon object for each person, with its own coordinates, name and selected state
is a waste of resources.
Instead, we’ll create a FolderFactory that returns either the selected or
the unselected folder drawing class, but does not create additional instances
once one of each has been created. Since this is such a simple case, we just
create them both at the outset and then return one or the other:
 * 
 * @author dnegi
 *
 */

class FolderFactory
{
Folder unSelected, Selected;
public FolderFactory()
{
Color brown = new Color(0x5f5f1c);
	Selected = new Folder(brown);
	unSelected = new Folder(Color.yellow);
}
//-------------------------------
public Folder getFolder(boolean isSelected)
{
if (isSelected)
	return Selected;
else
	return unSelected;
}
}