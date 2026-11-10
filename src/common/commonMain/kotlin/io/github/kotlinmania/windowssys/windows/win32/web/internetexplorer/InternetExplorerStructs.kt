package io.github.kotlinmania.windowssys.windows.win32.web.internetexplorer

import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime

public data class Ielaunchurlinfo(
    public var cbSize: UInt = 0u,
    public var dwCreationFlags: UInt = 0u,
    public var dwLaunchOptionFlags: UInt = 0u,
)

public data class Navigatedata(
    public var ulTarget: UInt = 0u,
    public var ulURL: UInt = 0u,
    public var ulRefURL: UInt = 0u,
    public var ulPostData: UInt = 0u,
    public var dwFlags: UInt = 0u,
)

public data class Staturl(
    public var cbSize: UInt = 0u,
    public var pwcsUrl: Pwstr = null,
    public var pwcsTitle: Pwstr = null,
    public var ftLastVisited: Filetime = Filetime(),
    public var ftLastUpdated: Filetime = Filetime(),
    public var ftExpires: Filetime = Filetime(),
    public var dwFlags: UInt = 0u,
)
