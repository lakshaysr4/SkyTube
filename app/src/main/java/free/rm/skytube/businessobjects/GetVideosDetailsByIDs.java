/*
 * SkyTube
 * Copyright (C) 2015  Ramon Mifsud
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation (version 3 of the License).
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package free.rm.skytube.businessobjects;

import android.content.Context;

import java.io.IOException;

/**
 * A class that is able to query YouTube and returns information regarding the supplied videos IDs.
 */
public class GetVideosDetailsByIDs extends GetFeaturedVideos {

	public void init(Context context, String videoIds) throws IOException {
		super.init(context);
		super.videosList.setId(videoIds);
		super.videosList.setChart(null);
	}

}
