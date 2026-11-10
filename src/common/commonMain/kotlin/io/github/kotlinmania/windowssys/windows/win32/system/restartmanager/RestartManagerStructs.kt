@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime

public data class RmFilterInfo(
    public var filterAction: RmFilterAction = 0,
    public var filterTrigger: RmFilterTrigger = 0,
    public var cbNextOffset: UInt = 0u,
    public var anonymous: RmFilterInfo0 = RmFilterInfo0(),
)

public data class RmFilterInfo0(
    public var strFilename: Pwstr = null,
    public var process: RmUniqueProcess = RmUniqueProcess(),
    public var strServiceShortName: Pwstr = null,
)

public data class RmProcessInfo(
    public var process: RmUniqueProcess = RmUniqueProcess(),
    public var strAppName: UShortArray = UShortArray(256),
    public var strServiceShortName: UShortArray = UShortArray(64),
    public var applicationType: RmAppType = 0,
    public var appStatus: UInt = 0u,
    public var tSSessionId: UInt = 0u,
    public var bRestartable: Bool = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RmProcessInfo) return false
        if (this.process != other.process) return false
        if (!this.strAppName.contentEquals(other.strAppName)) return false
        if (!this.strServiceShortName.contentEquals(other.strServiceShortName)) return false
        if (this.applicationType != other.applicationType) return false
        if (this.appStatus != other.appStatus) return false
        if (this.tSSessionId != other.tSSessionId) return false
        if (this.bRestartable != other.bRestartable) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.process.hashCode()
        result = 31 * result + this.strAppName.contentHashCode()
        result = 31 * result + this.strServiceShortName.contentHashCode()
        result = 31 * result + this.applicationType.hashCode()
        result = 31 * result + this.appStatus.hashCode()
        result = 31 * result + this.tSSessionId.hashCode()
        result = 31 * result + this.bRestartable.hashCode()
        return result
    }
}

public data class RmUniqueProcess(public var dwProcessId: UInt = 0u, public var processStartTime: Filetime = Filetime())
