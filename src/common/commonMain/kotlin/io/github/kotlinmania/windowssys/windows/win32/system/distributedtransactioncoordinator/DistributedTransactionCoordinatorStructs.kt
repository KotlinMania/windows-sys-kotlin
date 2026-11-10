@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime

public data class Boid(public var rgb: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Boid) return false
        if (!this.rgb.contentEquals(other.rgb)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.rgb.contentHashCode()
    }
}

public data class OleTmConfigParamsV1(public var dwVersion: UInt = 0u, public var dwcConcurrencyHint: UInt = 0u)

public data class OleTmConfigParamsV2(
    public var dwVersion: UInt = 0u,
    public var dwcConcurrencyHint: UInt = 0u,
    public var applicationType: Applicationtype = 0,
    public var clusterResourceId: Guid = Guid(),
)

public data class ProxyConfigParams(public var wcThreadsMax: UShort = 0u)

public data class Xactopt(public var ulTimeout: UInt = 0u, public var szDescription: UByteArray = UByteArray(40)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Xactopt) return false
        if (this.ulTimeout != other.ulTimeout) return false
        if (!this.szDescription.contentEquals(other.szDescription)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ulTimeout.hashCode()
        result = 31 * result + this.szDescription.contentHashCode()
        return result
    }
}

public data class Xactstats(
    public var cOpen: UInt = 0u,
    public var cCommitting: UInt = 0u,
    public var cCommitted: UInt = 0u,
    public var cAborting: UInt = 0u,
    public var cAborted: UInt = 0u,
    public var cInDoubt: UInt = 0u,
    public var cHeuristicDecision: UInt = 0u,
    public var timeTransactionsUp: Filetime = Filetime(),
)

public data class Xacttransinfo(
    public var uow: Boid = Boid(),
    public var isoLevel: Int = 0,
    public var isoFlags: UInt = 0u,
    public var grfTCSupported: UInt = 0u,
    public var grfRMSupported: UInt = 0u,
    public var grfTCSupportedRetaining: UInt = 0u,
    public var grfRMSupportedRetaining: UInt = 0u,
)

public data class Xid(
    public var formatID: Int = 0,
    public var gtridLength: Int = 0,
    public var bqualLength: Int = 0,
    public var data: ByteArray = ByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Xid) return false
        if (this.formatID != other.formatID) return false
        if (this.gtridLength != other.gtridLength) return false
        if (this.bqualLength != other.bqualLength) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatID.hashCode()
        result = 31 * result + this.gtridLength.hashCode()
        result = 31 * result + this.bqualLength.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class XaSwitchT(
    public var name: ByteArray = ByteArray(32),
    public var flags: Int = 0,
    public var version: Int = 0,
    public var xaOpenEntry: Int = 0,
    public var xaCloseEntry: Int = 0,
    public var xaStartEntry: Int = 0,
    public var xaEndEntry: Int = 0,
    public var xaRollbackEntry: Int = 0,
    public var xaPrepareEntry: Int = 0,
    public var xaCommitEntry: Int = 0,
    public var xaRecoverEntry: Int = 0,
    public var xaForgetEntry: Int = 0,
    public var xaCompleteEntry: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XaSwitchT) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.flags != other.flags) return false
        if (this.version != other.version) return false
        if (this.xaOpenEntry != other.xaOpenEntry) return false
        if (this.xaCloseEntry != other.xaCloseEntry) return false
        if (this.xaStartEntry != other.xaStartEntry) return false
        if (this.xaEndEntry != other.xaEndEntry) return false
        if (this.xaRollbackEntry != other.xaRollbackEntry) return false
        if (this.xaPrepareEntry != other.xaPrepareEntry) return false
        if (this.xaCommitEntry != other.xaCommitEntry) return false
        if (this.xaRecoverEntry != other.xaRecoverEntry) return false
        if (this.xaForgetEntry != other.xaForgetEntry) return false
        if (this.xaCompleteEntry != other.xaCompleteEntry) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.xaOpenEntry.hashCode()
        result = 31 * result + this.xaCloseEntry.hashCode()
        result = 31 * result + this.xaStartEntry.hashCode()
        result = 31 * result + this.xaEndEntry.hashCode()
        result = 31 * result + this.xaRollbackEntry.hashCode()
        result = 31 * result + this.xaPrepareEntry.hashCode()
        result = 31 * result + this.xaCommitEntry.hashCode()
        result = 31 * result + this.xaRecoverEntry.hashCode()
        result = 31 * result + this.xaForgetEntry.hashCode()
        result = 31 * result + this.xaCompleteEntry.hashCode()
        return result
    }
}
