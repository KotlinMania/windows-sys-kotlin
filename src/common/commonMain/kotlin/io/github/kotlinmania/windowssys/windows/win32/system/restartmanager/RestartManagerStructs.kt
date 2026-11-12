@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime

public data class RmFilterInfo(
    public var filterAction: RmFilterAction = 0,
    public var filterTrigger: RmFilterTrigger = 0,
    public var cbNextOffset: UInt = 0u,
    public var anonymous: RmFilterInfo0 = RmFilterInfo0(),
)

public class RmFilterInfo0 internal constructor(
    strFilenameCtorArg: Pwstr,
    public var process: RmUniqueProcess,
    strServiceShortNameCtorArg: Pwstr,
) {
    public var strFilename: Pwstr = strFilenameCtorArg
        internal set

    public var strServiceShortName: Pwstr = strServiceShortNameCtorArg
        internal set

    public constructor() : this(
        strFilenameCtorArg = MutPtr(0L),
        process = RmUniqueProcess(),
        strServiceShortNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.strFilename

    public operator fun component2(): RmUniqueProcess = this.process

    public operator fun component3(): Pwstr = this.strServiceShortName

    public fun copy(strFilename: Pwstr = this.strFilename, process: RmUniqueProcess = this.process, strServiceShortName: Pwstr = this.strServiceShortName): RmFilterInfo0 = RmFilterInfo0(strFilenameCtorArg = strFilename, process = process, strServiceShortNameCtorArg = strServiceShortName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RmFilterInfo0) return false
        if (this.strFilename != other.strFilename) return false
        if (this.process != other.process) return false
        if (this.strServiceShortName != other.strServiceShortName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.strFilename.hashCode()
        result = 31 * result + this.process.hashCode()
        result = 31 * result + this.strServiceShortName.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            strFilename: Pwstr = MutPtr(0L),
            process: RmUniqueProcess = RmUniqueProcess(),
            strServiceShortName: Pwstr = MutPtr(0L),
        ): RmFilterInfo0 =
            RmFilterInfo0(
                strFilenameCtorArg = strFilename,
                process = process,
                strServiceShortNameCtorArg = strServiceShortName,
            )
    }
}

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

public data class RmUniqueProcess(
    public var dwProcessId: UInt = 0u,
    public var processStartTime: Filetime = Filetime(),
)
