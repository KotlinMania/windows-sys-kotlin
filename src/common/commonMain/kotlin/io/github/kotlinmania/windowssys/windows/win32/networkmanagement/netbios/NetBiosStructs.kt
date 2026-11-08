@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netbios

import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public data class ACTION_HEADER(
    public var transport_id: UInt = 0u,
    public var action_code: UShort = 0u,
    public var reserved: UShort = 0u,
)

public class ADAPTER_STATUS(
    public var adapter_address: UByteArray = UByteArray(6),
    public var rev_major: UByte = 0u,
    public var reserved0: UByte = 0u,
    public var adapter_type: UByte = 0u,
    public var rev_minor: UByte = 0u,
    public var duration: UShort = 0u,
    public var frmr_recv: UShort = 0u,
    public var frmr_xmit: UShort = 0u,
    public var iframe_recv_err: UShort = 0u,
    public var xmit_aborts: UShort = 0u,
    public var xmit_success: UInt = 0u,
    public var recv_success: UInt = 0u,
    public var iframe_xmit_err: UShort = 0u,
    public var recv_buff_unavail: UShort = 0u,
    public var t1_timeouts: UShort = 0u,
    public var ti_timeouts: UShort = 0u,
    public var reserved1: UInt = 0u,
    public var free_ncbs: UShort = 0u,
    public var max_cfg_ncbs: UShort = 0u,
    public var max_ncbs: UShort = 0u,
    public var xmit_buf_unavail: UShort = 0u,
    public var max_dgram_size: UShort = 0u,
    public var pending_sess: UShort = 0u,
    public var max_cfg_sess: UShort = 0u,
    public var max_sess: UShort = 0u,
    public var max_sess_pkt_size: UShort = 0u,
    public var name_count: UShort = 0u,
)

public data class FIND_NAME_BUFFER(
    public var length: UByte = 0u,
    public var access_control: UByte = 0u,
    public var frame_control: UByte = 0u,
    public var destination_addr: UByteArray = UByteArray(6),
    public var source_addr: UByteArray = UByteArray(6),
    public var routing_info: UByteArray = UByteArray(18),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FIND_NAME_BUFFER) return false
        if (this.length != other.length) return false
        if (this.access_control != other.access_control) return false
        if (this.frame_control != other.frame_control) return false
        if (!this.destination_addr.contentEquals(other.destination_addr)) return false
        if (!this.source_addr.contentEquals(other.source_addr)) return false
        if (!this.routing_info.contentEquals(other.routing_info)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.access_control.hashCode()
        result = 31 * result + this.frame_control.hashCode()
        result = 31 * result + this.destination_addr.contentHashCode()
        result = 31 * result + this.source_addr.contentHashCode()
        result = 31 * result + this.routing_info.contentHashCode()
        return result
    }
}

public data class FIND_NAME_HEADER(
    public var node_count: UShort = 0u,
    public var reserved: UByte = 0u,
    public var unique_group: UByte = 0u,
)

public data class LANA_ENUM(public var length: UByte = 0u, public var lana: UByteArray = UByteArray(255)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LANA_ENUM) return false
        if (this.length != other.length) return false
        if (!this.lana.contentEquals(other.lana)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.lana.contentHashCode()
        return result
    }
}

public data class NAME_BUFFER(
    public var name: UByteArray = UByteArray(16),
    public var name_num: UByte = 0u,
    public var name_flags: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NAME_BUFFER) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.name_num != other.name_num) return false
        if (this.name_flags != other.name_flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.name_num.hashCode()
        result = 31 * result + this.name_flags.hashCode()
        return result
    }
}

public data class NCB(
    public var ncb_command: UByte = 0u,
    public var ncb_retcode: UByte = 0u,
    public var ncb_lsn: UByte = 0u,
    public var ncb_num: UByte = 0u,
    public var ncb_buffer: Long = 0L,
    public var ncb_length: UShort = 0u,
    public var ncb_callname: UByteArray = UByteArray(16),
    public var ncb_name: UByteArray = UByteArray(16),
    public var ncb_rto: UByte = 0u,
    public var ncb_sto: UByte = 0u,
    public var ncb_post: Long = 0L,
    public var ncb_lana_num: UByte = 0u,
    public var ncb_cmd_cplt: UByte = 0u,
    public var ncb_reserve: UByteArray = UByteArray(18),
    public var ncb_event: HANDLE = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NCB) return false
        if (this.ncb_command != other.ncb_command) return false
        if (this.ncb_retcode != other.ncb_retcode) return false
        if (this.ncb_lsn != other.ncb_lsn) return false
        if (this.ncb_num != other.ncb_num) return false
        if (this.ncb_buffer != other.ncb_buffer) return false
        if (this.ncb_length != other.ncb_length) return false
        if (!this.ncb_callname.contentEquals(other.ncb_callname)) return false
        if (!this.ncb_name.contentEquals(other.ncb_name)) return false
        if (this.ncb_rto != other.ncb_rto) return false
        if (this.ncb_sto != other.ncb_sto) return false
        if (this.ncb_post != other.ncb_post) return false
        if (this.ncb_lana_num != other.ncb_lana_num) return false
        if (this.ncb_cmd_cplt != other.ncb_cmd_cplt) return false
        if (!this.ncb_reserve.contentEquals(other.ncb_reserve)) return false
        if (this.ncb_event != other.ncb_event) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ncb_command.hashCode()
        result = 31 * result + this.ncb_retcode.hashCode()
        result = 31 * result + this.ncb_lsn.hashCode()
        result = 31 * result + this.ncb_num.hashCode()
        result = 31 * result + this.ncb_buffer.hashCode()
        result = 31 * result + this.ncb_length.hashCode()
        result = 31 * result + this.ncb_callname.contentHashCode()
        result = 31 * result + this.ncb_name.contentHashCode()
        result = 31 * result + this.ncb_rto.hashCode()
        result = 31 * result + this.ncb_sto.hashCode()
        result = 31 * result + this.ncb_post.hashCode()
        result = 31 * result + this.ncb_lana_num.hashCode()
        result = 31 * result + this.ncb_cmd_cplt.hashCode()
        result = 31 * result + this.ncb_reserve.contentHashCode()
        result = 31 * result + this.ncb_event.hashCode()
        return result
    }
}

public data class SESSION_BUFFER(
    public var lsn: UByte = 0u,
    public var state: UByte = 0u,
    public var local_name: UByteArray = UByteArray(16),
    public var remote_name: UByteArray = UByteArray(16),
    public var rcvs_outstanding: UByte = 0u,
    public var sends_outstanding: UByte = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SESSION_BUFFER) return false
        if (this.lsn != other.lsn) return false
        if (this.state != other.state) return false
        if (!this.local_name.contentEquals(other.local_name)) return false
        if (!this.remote_name.contentEquals(other.remote_name)) return false
        if (this.rcvs_outstanding != other.rcvs_outstanding) return false
        if (this.sends_outstanding != other.sends_outstanding) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.lsn.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.local_name.contentHashCode()
        result = 31 * result + this.remote_name.contentHashCode()
        result = 31 * result + this.rcvs_outstanding.hashCode()
        result = 31 * result + this.sends_outstanding.hashCode()
        return result
    }
}

public data class SESSION_HEADER(
    public var sess_name: UByte = 0u,
    public var num_sess: UByte = 0u,
    public var rcv_dg_outstanding: UByte = 0u,
    public var rcv_any_outstanding: UByte = 0u,
)
