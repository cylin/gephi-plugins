/*
Copyright 2008-2010 Gephi
Authors : Jeremy Subtil <jeremy.subtil@gephi.org>
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.gephi.preview.api;

import java.awt.Font;

/**
 * Interface of a preview node label.
 *
 * @author Jérémy Subtil <jeremy.subtil@gephi.org>
 */
public interface NodeLabel {

    /**
     * Returns the node label's current color.
     *
     * @return the node label's current color
     */
    public Color getColor();

    /**
     * Returns the node label's current value.
     *
     * @return the node label's current value
     */
    public String getValue();

    /**
     * Returns the node label's position.
     *
     * @return the node label's position
     */
    public Point getPosition();

    /**
     * Returns the node label's font.
     * @return the node label's font
     */
    public Font getFont();

    /**
     * Returns the node label's parent node's id.
     * @return node label's parent node's id
     */
    public String getParentId();
}
