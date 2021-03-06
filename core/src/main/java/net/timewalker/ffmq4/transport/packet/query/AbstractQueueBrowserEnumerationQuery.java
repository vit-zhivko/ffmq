/*
 * This file is part of FFMQ.
 *
 * FFMQ is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * FFMQ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with FFMQ; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package net.timewalker.ffmq4.transport.packet.query;

import net.timewalker.ffmq4.utils.RawDataBuffer;

/**
 * AbstractBrowserEnumerationQuery
 */
public abstract class AbstractQueueBrowserEnumerationQuery extends AbstractQueueBrowserQuery
{
	private String enumId;
    
    /* (non-Javadoc)
     * @see net.timewalker.ffmq4.network.packet.AbstractPacket#serializeTo(net.timewalker.ffmq4.utils.RawDataOutputStream)
     */
    @Override
	protected void serializeTo(RawDataBuffer out)
    {
    	super.serializeTo(out);
        out.writeUTF(enumId);
    }

    /* (non-Javadoc)
     * @see net.timewalker.ffmq4.network.packet.AbstractPacket#unserializeFrom(net.timewalker.ffmq4.utils.RawDataInputStream)
     */
    @Override
	protected void unserializeFrom(RawDataBuffer in)
    {
    	super.unserializeFrom(in);
    	enumId = in.readUTF();   
    }

	/**
	 * @return the enumId
	 */
	public String getEnumId()
	{
		return enumId;
	}

	/**
	 * @param enumId the enumId to set
	 */
	public void setEnumId(String enumId)
	{
		this.enumId = enumId;
	}

	/*
     *  (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
	public String toString()
    {
    	StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append(" enumId=");
        sb.append(enumId);
        
        return sb.toString();
    }
}
