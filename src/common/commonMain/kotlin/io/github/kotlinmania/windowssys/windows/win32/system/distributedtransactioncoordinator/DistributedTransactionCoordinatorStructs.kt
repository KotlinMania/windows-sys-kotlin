@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.system.distributedtransactioncoordinator

import io.github.kotlinmania.windowssys.core.GUID

public data class BOID(public var rgb: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BOID) return false
        if (!this.rgb.contentEquals(other.rgb)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.rgb.contentHashCode()
    }
}

public data class OLE_TM_CONFIG_PARAMS_V1(public var dwVersion: UInt = 0u, public var dwcConcurrencyHint: UInt = 0u)

public data class OLE_TM_CONFIG_PARAMS_V2(
    public var dwVersion: UInt = 0u,
    public var dwcConcurrencyHint: UInt = 0u,
    public var applicationType: APPLICATIONTYPE = 0,
    public var clusterResourceId: GUID = GUID(),
)

public data class PROXY_CONFIG_PARAMS(public var wcThreadsMax: UShort = 0u)

public data class XACTOPT(public var ulTimeout: UInt = 0u, public var szDescription: UByteArray = UByteArray(40)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XACTOPT) return false
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

public data class XACTSTATS(
    public var cOpen: UInt = 0u,
    public var cCommitting: UInt = 0u,
    public var cCommitted: UInt = 0u,
    public var cAborting: UInt = 0u,
    public var cAborted: UInt = 0u,
    public var cInDoubt: UInt = 0u,
    public var cHeuristicDecision: UInt = 0u,
    public var timeTransactionsUp: Foundation.FILETIME = Foundation.FILETIME(),
)

public data class XACTTRANSINFO(
    public var uow: BOID = BOID(),
    public var isoLevel: Int = 0,
    public var isoFlags: UInt = 0u,
    public var grfTCSupported: UInt = 0u,
    public var grfRMSupported: UInt = 0u,
    public var grfTCSupportedRetaining: UInt = 0u,
    public var grfRMSupportedRetaining: UInt = 0u,
)

public data class XID(
    public var formatID: Int = 0,
    public var gtrid_length: Int = 0,
    public var bqual_length: Int = 0,
    public var data: ByteArray = ByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XID) return false
        if (this.formatID != other.formatID) return false
        if (this.gtrid_length != other.gtrid_length) return false
        if (this.bqual_length != other.bqual_length) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.formatID.hashCode()
        result = 31 * result + this.gtrid_length.hashCode()
        result = 31 * result + this.bqual_length.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class xa_switch_t(
    public var name: ByteArray = ByteArray(32),
    public var flags: Int = 0,
    public var version: Int = 0,
    public var xa_open_entry: Long = 0L,
    public var xa_close_entry: Long = 0L,
    public var xa_start_entry: Long = 0L,
    public var xa_end_entry: Long = 0L,
    public var xa_rollback_entry: Long = 0L,
    public var xa_prepare_entry: Long = 0L,
    public var xa_commit_entry: Long = 0L,
    public var xa_recover_entry: Long = 0L,
    public var xa_forget_entry: Long = 0L,
    public var xa_complete_entry: Long = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is xa_switch_t) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.flags != other.flags) return false
        if (this.version != other.version) return false
        if (this.xa_open_entry != other.xa_open_entry) return false
        if (this.xa_close_entry != other.xa_close_entry) return false
        if (this.xa_start_entry != other.xa_start_entry) return false
        if (this.xa_end_entry != other.xa_end_entry) return false
        if (this.xa_rollback_entry != other.xa_rollback_entry) return false
        if (this.xa_prepare_entry != other.xa_prepare_entry) return false
        if (this.xa_commit_entry != other.xa_commit_entry) return false
        if (this.xa_recover_entry != other.xa_recover_entry) return false
        if (this.xa_forget_entry != other.xa_forget_entry) return false
        if (this.xa_complete_entry != other.xa_complete_entry) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.version.hashCode()
        result = 31 * result + this.xa_open_entry.hashCode()
        result = 31 * result + this.xa_close_entry.hashCode()
        result = 31 * result + this.xa_start_entry.hashCode()
        result = 31 * result + this.xa_end_entry.hashCode()
        result = 31 * result + this.xa_rollback_entry.hashCode()
        result = 31 * result + this.xa_prepare_entry.hashCode()
        result = 31 * result + this.xa_commit_entry.hashCode()
        result = 31 * result + this.xa_recover_entry.hashCode()
        result = 31 * result + this.xa_forget_entry.hashCode()
        result = 31 * result + this.xa_complete_entry.hashCode()
        return result
    }
}
