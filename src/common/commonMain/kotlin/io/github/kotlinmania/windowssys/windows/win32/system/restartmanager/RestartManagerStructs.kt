@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME

public data class RM_FILTER_INFO(
    public var FilterAction: RM_FILTER_ACTION = 0,
    public var FilterTrigger: RM_FILTER_TRIGGER = 0,
    public var cbNextOffset: UInt = 0u,
    public var Anonymous: RM_FILTER_INFO_0 = RM_FILTER_INFO_0(),
)

public data class RM_FILTER_INFO_0(
    public var strFilename: PWSTR = 0L,
    public var Process: RM_UNIQUE_PROCESS = RM_UNIQUE_PROCESS(),
    public var strServiceShortName: PWSTR = 0L,
)

public data class RM_PROCESS_INFO(
    public var Process: RM_UNIQUE_PROCESS = RM_UNIQUE_PROCESS(),
    public var strAppName: UShortArray = UShortArray(256),
    public var strServiceShortName: UShortArray = UShortArray(64),
    public var ApplicationType: RM_APP_TYPE = 0,
    public var AppStatus: UInt = 0u,
    public var TSSessionId: UInt = 0u,
    public var bRestartable: BOOL = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RM_PROCESS_INFO) return false
        if (this.Process != other.Process) return false
        if (!this.strAppName.contentEquals(other.strAppName)) return false
        if (!this.strServiceShortName.contentEquals(other.strServiceShortName)) return false
        if (this.ApplicationType != other.ApplicationType) return false
        if (this.AppStatus != other.AppStatus) return false
        if (this.TSSessionId != other.TSSessionId) return false
        if (this.bRestartable != other.bRestartable) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.Process.hashCode()
        result = 31 * result + this.strAppName.contentHashCode()
        result = 31 * result + this.strServiceShortName.contentHashCode()
        result = 31 * result + this.ApplicationType.hashCode()
        result = 31 * result + this.AppStatus.hashCode()
        result = 31 * result + this.TSSessionId.hashCode()
        result = 31 * result + this.bRestartable.hashCode()
        return result
    }
}

public data class RM_UNIQUE_PROCESS(public var dwProcessId: UInt = 0u, public var ProcessStartTime: FILETIME = FILETIME())
