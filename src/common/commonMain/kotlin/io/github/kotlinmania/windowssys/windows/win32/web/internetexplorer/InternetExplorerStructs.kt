package io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer

import io.github.kotlinmania.windowssys.core.PWSTR

public data class IELAUNCHURLINFO(
    public var cbSize: UInt = 0u,
    public var dwCreationFlags: UInt = 0u,
    public var dwLaunchOptionFlags: UInt = 0u,
)

public data class NAVIGATEDATA(
    public var ulTarget: UInt = 0u,
    public var ulURL: UInt = 0u,
    public var ulRefURL: UInt = 0u,
    public var ulPostData: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class STATURL(
    public var cbSize: UInt = 0u,
    public var pwcsUrl: PWSTR = 0L,
    public var pwcsTitle: PWSTR = 0L,
    public var ftLastVisited: Foundation.FILETIME = Foundation.FILETIME(),
    public var ftLastUpdated: Foundation.FILETIME = Foundation.FILETIME(),
    public var ftExpires: Foundation.FILETIME = Foundation.FILETIME(),
    public var dwFlags: UInt = 0u,
)
