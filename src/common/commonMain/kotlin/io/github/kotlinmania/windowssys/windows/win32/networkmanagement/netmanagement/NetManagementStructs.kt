@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import io.github.kotlinmania.windowssys.windows.win32.security.SID_NAME_USE

public data class ACCESS_INFO_0(public var acc0_resource_name: PWSTR = 0L)

public data class ACCESS_INFO_1(
    public var acc1_resource_name: PWSTR = 0L,
    public var acc1_attr: UInt = 0u,
    public var acc1_count: UInt = 0u,
)

public data class ACCESS_INFO_1002(public var acc1002_attr: UInt = 0u)

public data class ACCESS_LIST(public var acl_ugname: PWSTR = 0L, public var acl_access: UInt = 0u)

public data class ADMIN_OTHER_INFO(public var alrtad_errcode: UInt = 0u, public var alrtad_numstrings: UInt = 0u)

public data class AE_ACCLIM(
    public var ae_al_compname: UInt = 0u,
    public var ae_al_username: UInt = 0u,
    public var ae_al_resname: UInt = 0u,
    public var ae_al_limit: UInt = 0u,
)

public data class AE_ACLMOD(
    public var ae_am_compname: UInt = 0u,
    public var ae_am_username: UInt = 0u,
    public var ae_am_resname: UInt = 0u,
    public var ae_am_action: UInt = 0u,
    public var ae_am_datalen: UInt = 0u,
)

public data class AE_CLOSEFILE(
    public var ae_cf_compname: UInt = 0u,
    public var ae_cf_username: UInt = 0u,
    public var ae_cf_resname: UInt = 0u,
    public var ae_cf_fileid: UInt = 0u,
    public var ae_cf_duration: UInt = 0u,
    public var ae_cf_reason: UInt = 0u,
)

public data class AE_CONNREJ(
    public var ae_cr_compname: UInt = 0u,
    public var ae_cr_username: UInt = 0u,
    public var ae_cr_netname: UInt = 0u,
    public var ae_cr_reason: UInt = 0u,
)

public data class AE_CONNSTART(
    public var ae_ct_compname: UInt = 0u,
    public var ae_ct_username: UInt = 0u,
    public var ae_ct_netname: UInt = 0u,
    public var ae_ct_connid: UInt = 0u,
)

public data class AE_CONNSTOP(
    public var ae_cp_compname: UInt = 0u,
    public var ae_cp_username: UInt = 0u,
    public var ae_cp_netname: UInt = 0u,
    public var ae_cp_connid: UInt = 0u,
    public var ae_cp_reason: UInt = 0u,
)

public data class AE_GENERIC(
    public var ae_ge_msgfile: UInt = 0u,
    public var ae_ge_msgnum: UInt = 0u,
    public var ae_ge_params: UInt = 0u,
    public var ae_ge_param1: UInt = 0u,
    public var ae_ge_param2: UInt = 0u,
    public var ae_ge_param3: UInt = 0u,
    public var ae_ge_param4: UInt = 0u,
    public var ae_ge_param5: UInt = 0u,
    public var ae_ge_param6: UInt = 0u,
    public var ae_ge_param7: UInt = 0u,
    public var ae_ge_param8: UInt = 0u,
    public var ae_ge_param9: UInt = 0u,
)

public data class AE_LOCKOUT(
    public var ae_lk_compname: UInt = 0u,
    public var ae_lk_username: UInt = 0u,
    public var ae_lk_action: UInt = 0u,
    public var ae_lk_bad_pw_count: UInt = 0u,
)

public data class AE_NETLOGOFF(
    public var ae_nf_compname: UInt = 0u,
    public var ae_nf_username: UInt = 0u,
    public var ae_nf_reserved1: UInt = 0u,
    public var ae_nf_reserved2: UInt = 0u,
)

public data class AE_NETLOGON(
    public var ae_no_compname: UInt = 0u,
    public var ae_no_username: UInt = 0u,
    public var ae_no_privilege: UInt = 0u,
    public var ae_no_authflags: UInt = 0u,
)

public data class AE_RESACCESS(
    public var ae_ra_compname: UInt = 0u,
    public var ae_ra_username: UInt = 0u,
    public var ae_ra_resname: UInt = 0u,
    public var ae_ra_operation: UInt = 0u,
    public var ae_ra_returncode: UInt = 0u,
    public var ae_ra_restype: UInt = 0u,
    public var ae_ra_fileid: UInt = 0u,
)

public data class AE_RESACCESSREJ(
    public var ae_rr_compname: UInt = 0u,
    public var ae_rr_username: UInt = 0u,
    public var ae_rr_resname: UInt = 0u,
    public var ae_rr_operation: UInt = 0u,
)

public data class AE_SERVICESTAT(
    public var ae_ss_compname: UInt = 0u,
    public var ae_ss_username: UInt = 0u,
    public var ae_ss_svcname: UInt = 0u,
    public var ae_ss_status: UInt = 0u,
    public var ae_ss_code: UInt = 0u,
    public var ae_ss_text: UInt = 0u,
    public var ae_ss_returnval: UInt = 0u,
)

public data class AE_SESSLOGOFF(
    public var ae_sf_compname: UInt = 0u,
    public var ae_sf_username: UInt = 0u,
    public var ae_sf_reason: UInt = 0u,
)

public data class AE_SESSLOGON(
    public var ae_so_compname: UInt = 0u,
    public var ae_so_username: UInt = 0u,
    public var ae_so_privilege: UInt = 0u,
)

public data class AE_SESSPWERR(public var ae_sp_compname: UInt = 0u, public var ae_sp_username: UInt = 0u)

public data class AE_SRVSTATUS(public var ae_sv_status: UInt = 0u)

public data class AE_UASMOD(
    public var ae_um_compname: UInt = 0u,
    public var ae_um_username: UInt = 0u,
    public var ae_um_resname: UInt = 0u,
    public var ae_um_rectype: UInt = 0u,
    public var ae_um_action: UInt = 0u,
    public var ae_um_datalen: UInt = 0u,
)

public data class AT_ENUM(
    public var JobId: UInt = 0u,
    public var JobTime: ULong = 0uL,
    public var DaysOfMonth: UInt = 0u,
    public var DaysOfWeek: UByte = 0u,
    public var Flags: UByte = 0u,
    public var Command: PWSTR = 0L,
)

public data class AT_INFO(
    public var JobTime: ULong = 0uL,
    public var DaysOfMonth: UInt = 0u,
    public var DaysOfWeek: UByte = 0u,
    public var Flags: UByte = 0u,
    public var Command: PWSTR = 0L,
)

public data class AUDIT_ENTRY(
    public var ae_len: UInt = 0u,
    public var ae_reserved: UInt = 0u,
    public var ae_time: UInt = 0u,
    public var ae_type: UInt = 0u,
    public var ae_data_offset: UInt = 0u,
    public var ae_data_size: UInt = 0u,
)

public data class CONFIG_INFO_0(public var cfgi0_key: PWSTR = 0L, public var cfgi0_data: PWSTR = 0L)

public data class DSREG_JOIN_INFO(
    public var joinType: DSREG_JOIN_TYPE = 0,
    public var pJoinCertificate: Long = 0L,
    public var pszDeviceId: PWSTR = 0L,
    public var pszIdpDomain: PWSTR = 0L,
    public var pszTenantId: PWSTR = 0L,
    public var pszJoinUserEmail: PWSTR = 0L,
    public var pszTenantDisplayName: PWSTR = 0L,
    public var pszMdmEnrollmentUrl: PWSTR = 0L,
    public var pszMdmTermsOfUseUrl: PWSTR = 0L,
    public var pszMdmComplianceUrl: PWSTR = 0L,
    public var pszUserSettingSyncUrl: PWSTR = 0L,
    public var pUserInfo: Long = 0L,
)

public data class DSREG_USER_INFO(
    public var pszUserEmail: PWSTR = 0L,
    public var pszUserKeyId: PWSTR = 0L,
    public var pszUserKeyName: PWSTR = 0L,
)

public data class ERRLOG_OTHER_INFO(public var alrter_errcode: UInt = 0u, public var alrter_offset: UInt = 0u)

public data class ERROR_LOG(
    public var el_len: UInt = 0u,
    public var el_reserved: UInt = 0u,
    public var el_time: UInt = 0u,
    public var el_error: UInt = 0u,
    public var el_name: PWSTR = 0L,
    public var el_text: PWSTR = 0L,
    public var el_data: Long = 0L,
    public var el_data_size: UInt = 0u,
    public var el_nstrings: UInt = 0u,
)

public data class FLAT_STRING(
    public var MaximumLength: Short = 0,
    public var Length: Short = 0,
    public var Buffer: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FLAT_STRING) return false
        if (this.MaximumLength != other.MaximumLength) return false
        if (this.Length != other.Length) return false
        if (!this.Buffer.contentEquals(other.Buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MaximumLength.hashCode()
        result = 31 * result + this.Length.hashCode()
        result = 31 * result + this.Buffer.contentHashCode()
        return result
    }
}

public data class GROUP_INFO_0(public var grpi0_name: PWSTR = 0L)

public data class GROUP_INFO_1(public var grpi1_name: PWSTR = 0L, public var grpi1_comment: PWSTR = 0L)

public data class GROUP_INFO_1002(public var grpi1002_comment: PWSTR = 0L)

public data class GROUP_INFO_1005(public var grpi1005_attributes: UInt = 0u)

public data class GROUP_INFO_2(
    public var grpi2_name: PWSTR = 0L,
    public var grpi2_comment: PWSTR = 0L,
    public var grpi2_group_id: UInt = 0u,
    public var grpi2_attributes: UInt = 0u,
)

public data class GROUP_INFO_3(
    public var grpi3_name: PWSTR = 0L,
    public var grpi3_comment: PWSTR = 0L,
    public var grpi3_group_sid: PSID = 0L,
    public var grpi3_attributes: UInt = 0u,
)

public data class GROUP_USERS_INFO_0(public var grui0_name: PWSTR = 0L)

public data class GROUP_USERS_INFO_1(public var grui1_name: PWSTR = 0L, public var grui1_attributes: UInt = 0u)

public data class HARDWARE_ADDRESS(public var Address: UByteArray = UByteArray(6)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HARDWARE_ADDRESS) return false
        if (!this.Address.contentEquals(other.Address)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Address.contentHashCode()
    }
}

public data class HLOG(
    public var time: UInt = 0u,
    public var last_flags: UInt = 0u,
    public var offset: UInt = 0u,
    public var rec_offset: UInt = 0u,
)

public data class LOCALGROUP_INFO_0(public var lgrpi0_name: PWSTR = 0L)

public data class LOCALGROUP_INFO_1(public var lgrpi1_name: PWSTR = 0L, public var lgrpi1_comment: PWSTR = 0L)

public data class LOCALGROUP_INFO_1002(public var lgrpi1002_comment: PWSTR = 0L)

public data class LOCALGROUP_MEMBERS_INFO_0(public var lgrmi0_sid: PSID = 0L)

public data class LOCALGROUP_MEMBERS_INFO_1(
    public var lgrmi1_sid: PSID = 0L,
    public var lgrmi1_sidusage: SID_NAME_USE = 0,
    public var lgrmi1_name: PWSTR = 0L,
)

public data class LOCALGROUP_MEMBERS_INFO_2(
    public var lgrmi2_sid: PSID = 0L,
    public var lgrmi2_sidusage: SID_NAME_USE = 0,
    public var lgrmi2_domainandname: PWSTR = 0L,
)

public data class LOCALGROUP_MEMBERS_INFO_3(public var lgrmi3_domainandname: PWSTR = 0L)

public data class LOCALGROUP_USERS_INFO_0(public var lgrui0_name: PWSTR = 0L)

public data class MPR_PROTOCOL_0(
    public var dwProtocolId: UInt = 0u,
    public var wszProtocol: UShortArray = UShortArray(41),
    public var wszDLLName: UShortArray = UShortArray(49),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MPR_PROTOCOL_0) return false
        if (this.dwProtocolId != other.dwProtocolId) return false
        if (!this.wszProtocol.contentEquals(other.wszProtocol)) return false
        if (!this.wszDLLName.contentEquals(other.wszDLLName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwProtocolId.hashCode()
        result = 31 * result + this.wszProtocol.contentHashCode()
        result = 31 * result + this.wszDLLName.contentHashCode()
        return result
    }
}

public data class MSA_INFO_0(public var State: MSA_INFO_STATE = 0)

public data class MSG_INFO_0(public var msgi0_name: PWSTR = 0L)

public data class MSG_INFO_1(
    public var msgi1_name: PWSTR = 0L,
    public var msgi1_forward_flag: UInt = 0u,
    public var msgi1_forward: PWSTR = 0L,
)

public data class NETLOGON_INFO_1(public var netlog1_flags: UInt = 0u, public var netlog1_pdc_connection_status: UInt = 0u)

public data class NETLOGON_INFO_2(
    public var netlog2_flags: UInt = 0u,
    public var netlog2_pdc_connection_status: UInt = 0u,
    public var netlog2_trusted_dc_name: PWSTR = 0L,
    public var netlog2_tc_connection_status: UInt = 0u,
)

public data class NETLOGON_INFO_3(
    public var netlog3_flags: UInt = 0u,
    public var netlog3_logon_attempts: UInt = 0u,
    public var netlog3_reserved1: UInt = 0u,
    public var netlog3_reserved2: UInt = 0u,
    public var netlog3_reserved3: UInt = 0u,
    public var netlog3_reserved4: UInt = 0u,
    public var netlog3_reserved5: UInt = 0u,
)

public data class NETLOGON_INFO_4(public var netlog4_trusted_dc_name: PWSTR = 0L, public var netlog4_trusted_domain_name: PWSTR = 0L)

public data class NETSETUP_PROVISIONING_PARAMS(
    public var dwVersion: UInt = 0u,
    public var lpDomain: PCWSTR = 0L,
    public var lpHostName: PCWSTR = 0L,
    public var lpMachineAccountOU: PCWSTR = 0L,
    public var lpDcName: PCWSTR = 0L,
    public var dwProvisionOptions: NETSETUP_PROVISION = 0u,
    public var aCertTemplateNames: Long = 0L,
    public var cCertTemplateNames: UInt = 0u,
    public var aMachinePolicyNames: Long = 0L,
    public var cMachinePolicyNames: UInt = 0u,
    public var aMachinePolicyPaths: Long = 0L,
    public var cMachinePolicyPaths: UInt = 0u,
    public var lpNetbiosName: PWSTR = 0L,
    public var lpSiteName: PWSTR = 0L,
    public var lpPrimaryDNSDomain: PWSTR = 0L,
)

public data class NETWORK_NAME(public var Name: FLAT_STRING = FLAT_STRING())

public data class NET_DISPLAY_GROUP(
    public var grpi3_name: PWSTR = 0L,
    public var grpi3_comment: PWSTR = 0L,
    public var grpi3_group_id: UInt = 0u,
    public var grpi3_attributes: UInt = 0u,
    public var grpi3_next_index: UInt = 0u,
)

public data class NET_DISPLAY_MACHINE(
    public var usri2_name: PWSTR = 0L,
    public var usri2_comment: PWSTR = 0L,
    public var usri2_flags: USER_ACCOUNT_FLAGS = 0u,
    public var usri2_user_id: UInt = 0u,
    public var usri2_next_index: UInt = 0u,
)

public data class NET_DISPLAY_USER(
    public var usri1_name: PWSTR = 0L,
    public var usri1_comment: PWSTR = 0L,
    public var usri1_flags: USER_ACCOUNT_FLAGS = 0u,
    public var usri1_full_name: PWSTR = 0L,
    public var usri1_user_id: UInt = 0u,
    public var usri1_next_index: UInt = 0u,
)

public data class NET_VALIDATE_AUTHENTICATION_INPUT_ARG(public var InputPersistedFields: NET_VALIDATE_PERSISTED_FIELDS = NET_VALIDATE_PERSISTED_FIELDS(), public var PasswordMatched: Boolean = false)

public data class NET_VALIDATE_OUTPUT_ARG(public var ChangedPersistedFields: NET_VALIDATE_PERSISTED_FIELDS = NET_VALIDATE_PERSISTED_FIELDS(), public var ValidationStatus: UInt = 0u)

public data class NET_VALIDATE_PASSWORD_CHANGE_INPUT_ARG(
    public var InputPersistedFields: NET_VALIDATE_PERSISTED_FIELDS = NET_VALIDATE_PERSISTED_FIELDS(),
    public var ClearPassword: PWSTR = 0L,
    public var UserAccountName: PWSTR = 0L,
    public var HashedPassword: NET_VALIDATE_PASSWORD_HASH = NET_VALIDATE_PASSWORD_HASH(),
    public var PasswordMatch: Boolean = false,
)

public data class NET_VALIDATE_PASSWORD_HASH(public var Length: UInt = 0u, public var Hash: Long = 0L)

public data class NET_VALIDATE_PASSWORD_RESET_INPUT_ARG(
    public var InputPersistedFields: NET_VALIDATE_PERSISTED_FIELDS = NET_VALIDATE_PERSISTED_FIELDS(),
    public var ClearPassword: PWSTR = 0L,
    public var UserAccountName: PWSTR = 0L,
    public var HashedPassword: NET_VALIDATE_PASSWORD_HASH = NET_VALIDATE_PASSWORD_HASH(),
    public var PasswordMustChangeAtNextLogon: Boolean = false,
    public var ClearLockout: Boolean = false,
)

public data class NET_VALIDATE_PERSISTED_FIELDS(
    public var PresentFields: UInt = 0u,
    public var PasswordLastSet: FILETIME = FILETIME(),
    public var BadPasswordTime: FILETIME = FILETIME(),
    public var LockoutTime: FILETIME = FILETIME(),
    public var BadPasswordCount: UInt = 0u,
    public var PasswordHistoryLength: UInt = 0u,
    public var PasswordHistory: Long = 0L,
)

public data class OBO_TOKEN(
    public var Type: OBO_TOKEN_TYPE = 0,
    public var pncc: Long = 0L,
    public var pszwManufacturer: PCWSTR = 0L,
    public var pszwProduct: PCWSTR = 0L,
    public var pszwDisplayName: PCWSTR = 0L,
    public var fRegistered: BOOL = 0,
)

public data class PRINT_OTHER_INFO(
    public var alrtpr_jobid: UInt = 0u,
    public var alrtpr_status: UInt = 0u,
    public var alrtpr_submitted: UInt = 0u,
    public var alrtpr_size: UInt = 0u,
)

public data class RASCON_IPUI(
    public var guidConnection: GUID = GUID(),
    public var fIPv6Cfg: BOOL = 0,
    public var dwFlags: UInt = 0u,
    public var pszwIpAddr: UShortArray = UShortArray(16),
    public var pszwDnsAddr: UShortArray = UShortArray(16),
    public var pszwDns2Addr: UShortArray = UShortArray(16),
    public var pszwWinsAddr: UShortArray = UShortArray(16),
    public var pszwWins2Addr: UShortArray = UShortArray(16),
    public var pszwDnsSuffix: UShortArray = UShortArray(256),
    public var pszwIpv6Addr: UShortArray = UShortArray(65),
    public var dwIpv6PrefixLength: UInt = 0u,
    public var pszwIpv6DnsAddr: UShortArray = UShortArray(65),
    public var pszwIpv6Dns2Addr: UShortArray = UShortArray(65),
    public var dwIPv4InfMetric: UInt = 0u,
    public var dwIPv6InfMetric: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RASCON_IPUI) return false
        if (this.guidConnection != other.guidConnection) return false
        if (this.fIPv6Cfg != other.fIPv6Cfg) return false
        if (this.dwFlags != other.dwFlags) return false
        if (!this.pszwIpAddr.contentEquals(other.pszwIpAddr)) return false
        if (!this.pszwDnsAddr.contentEquals(other.pszwDnsAddr)) return false
        if (!this.pszwDns2Addr.contentEquals(other.pszwDns2Addr)) return false
        if (!this.pszwWinsAddr.contentEquals(other.pszwWinsAddr)) return false
        if (!this.pszwWins2Addr.contentEquals(other.pszwWins2Addr)) return false
        if (!this.pszwDnsSuffix.contentEquals(other.pszwDnsSuffix)) return false
        if (!this.pszwIpv6Addr.contentEquals(other.pszwIpv6Addr)) return false
        if (this.dwIpv6PrefixLength != other.dwIpv6PrefixLength) return false
        if (!this.pszwIpv6DnsAddr.contentEquals(other.pszwIpv6DnsAddr)) return false
        if (!this.pszwIpv6Dns2Addr.contentEquals(other.pszwIpv6Dns2Addr)) return false
        if (this.dwIPv4InfMetric != other.dwIPv4InfMetric) return false
        if (this.dwIPv6InfMetric != other.dwIPv6InfMetric) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.guidConnection.hashCode()
        result = 31 * result + this.fIPv6Cfg.hashCode()
        result = 31 * result + this.dwFlags.hashCode()
        result = 31 * result + this.pszwIpAddr.contentHashCode()
        result = 31 * result + this.pszwDnsAddr.contentHashCode()
        result = 31 * result + this.pszwDns2Addr.contentHashCode()
        result = 31 * result + this.pszwWinsAddr.contentHashCode()
        result = 31 * result + this.pszwWins2Addr.contentHashCode()
        result = 31 * result + this.pszwDnsSuffix.contentHashCode()
        result = 31 * result + this.pszwIpv6Addr.contentHashCode()
        result = 31 * result + this.dwIpv6PrefixLength.hashCode()
        result = 31 * result + this.pszwIpv6DnsAddr.contentHashCode()
        result = 31 * result + this.pszwIpv6Dns2Addr.contentHashCode()
        result = 31 * result + this.dwIPv4InfMetric.hashCode()
        result = 31 * result + this.dwIPv6InfMetric.hashCode()
        return result
    }
}

public data class REPL_EDIR_INFO_0(public var rped0_dirname: PWSTR = 0L)

public data class REPL_EDIR_INFO_1(
    public var rped1_dirname: PWSTR = 0L,
    public var rped1_integrity: UInt = 0u,
    public var rped1_extent: UInt = 0u,
)

public data class REPL_EDIR_INFO_1000(public var rped1000_integrity: UInt = 0u)

public data class REPL_EDIR_INFO_1001(public var rped1001_extent: UInt = 0u)

public data class REPL_EDIR_INFO_2(
    public var rped2_dirname: PWSTR = 0L,
    public var rped2_integrity: UInt = 0u,
    public var rped2_extent: UInt = 0u,
    public var rped2_lockcount: UInt = 0u,
    public var rped2_locktime: UInt = 0u,
)

public data class REPL_IDIR_INFO_0(public var rpid0_dirname: PWSTR = 0L)

public data class REPL_IDIR_INFO_1(
    public var rpid1_dirname: PWSTR = 0L,
    public var rpid1_state: UInt = 0u,
    public var rpid1_mastername: PWSTR = 0L,
    public var rpid1_last_update_time: UInt = 0u,
    public var rpid1_lockcount: UInt = 0u,
    public var rpid1_locktime: UInt = 0u,
)

public data class REPL_INFO_0(
    public var rp0_role: UInt = 0u,
    public var rp0_exportpath: PWSTR = 0L,
    public var rp0_exportlist: PWSTR = 0L,
    public var rp0_importpath: PWSTR = 0L,
    public var rp0_importlist: PWSTR = 0L,
    public var rp0_logonusername: PWSTR = 0L,
    public var rp0_interval: UInt = 0u,
    public var rp0_pulse: UInt = 0u,
    public var rp0_guardtime: UInt = 0u,
    public var rp0_random: UInt = 0u,
)

public data class REPL_INFO_1000(public var rp1000_interval: UInt = 0u)

public data class REPL_INFO_1001(public var rp1001_pulse: UInt = 0u)

public data class REPL_INFO_1002(public var rp1002_guardtime: UInt = 0u)

public data class REPL_INFO_1003(public var rp1003_random: UInt = 0u)

public data class RTR_INFO_BLOCK_HEADER(
    public var Version: UInt = 0u,
    public var Size: UInt = 0u,
    public var TocEntriesCount: UInt = 0u,
    public var TocEntry: List<RTR_TOC_ENTRY> = List(1) { RTR_TOC_ENTRY() },
)

public data class RTR_TOC_ENTRY(
    public var InfoType: UInt = 0u,
    public var InfoSize: UInt = 0u,
    public var Count: UInt = 0u,
    public var Offset: UInt = 0u,
)

public data class SERVER_INFO_100(public var sv100_platform_id: UInt = 0u, public var sv100_name: PWSTR = 0L)

public data class SERVER_INFO_1005(public var sv1005_comment: PWSTR = 0L)

public data class SERVER_INFO_101(
    public var sv101_platform_id: UInt = 0u,
    public var sv101_name: PWSTR = 0L,
    public var sv101_version_major: UInt = 0u,
    public var sv101_version_minor: UInt = 0u,
    public var sv101_type: NET_SERVER_TYPE = 0u,
    public var sv101_comment: PWSTR = 0L,
)

public data class SERVER_INFO_1010(public var sv1010_disc: Int = 0)

public data class SERVER_INFO_1016(public var sv1016_hidden: SERVER_INFO_HIDDEN = 0)

public data class SERVER_INFO_1017(public var sv1017_announce: UInt = 0u)

public data class SERVER_INFO_1018(public var sv1018_anndelta: UInt = 0u)

public data class SERVER_INFO_102(
    public var sv102_platform_id: UInt = 0u,
    public var sv102_name: PWSTR = 0L,
    public var sv102_version_major: UInt = 0u,
    public var sv102_version_minor: UInt = 0u,
    public var sv102_type: NET_SERVER_TYPE = 0u,
    public var sv102_comment: PWSTR = 0L,
    public var sv102_users: UInt = 0u,
    public var sv102_disc: Int = 0,
    public var sv102_hidden: SERVER_INFO_HIDDEN = 0,
    public var sv102_announce: UInt = 0u,
    public var sv102_anndelta: UInt = 0u,
    public var sv102_licenses: UInt = 0u,
    public var sv102_userpath: PWSTR = 0L,
)

public data class SERVER_INFO_103(
    public var sv103_platform_id: UInt = 0u,
    public var sv103_name: PWSTR = 0L,
    public var sv103_version_major: UInt = 0u,
    public var sv103_version_minor: UInt = 0u,
    public var sv103_type: UInt = 0u,
    public var sv103_comment: PWSTR = 0L,
    public var sv103_users: UInt = 0u,
    public var sv103_disc: Int = 0,
    public var sv103_hidden: BOOL = 0,
    public var sv103_announce: UInt = 0u,
    public var sv103_anndelta: UInt = 0u,
    public var sv103_licenses: UInt = 0u,
    public var sv103_userpath: PWSTR = 0L,
    public var sv103_capabilities: UInt = 0u,
)

public data class SERVER_INFO_1107(public var sv1107_users: UInt = 0u)

public data class SERVER_INFO_1501(public var sv1501_sessopens: UInt = 0u)

public data class SERVER_INFO_1502(public var sv1502_sessvcs: UInt = 0u)

public data class SERVER_INFO_1503(public var sv1503_opensearch: UInt = 0u)

public data class SERVER_INFO_1506(public var sv1506_maxworkitems: UInt = 0u)

public data class SERVER_INFO_1509(public var sv1509_maxrawbuflen: UInt = 0u)

public data class SERVER_INFO_1510(public var sv1510_sessusers: UInt = 0u)

public data class SERVER_INFO_1511(public var sv1511_sessconns: UInt = 0u)

public data class SERVER_INFO_1512(public var sv1512_maxnonpagedmemoryusage: UInt = 0u)

public data class SERVER_INFO_1513(public var sv1513_maxpagedmemoryusage: UInt = 0u)

public data class SERVER_INFO_1514(public var sv1514_enablesoftcompat: BOOL = 0)

public data class SERVER_INFO_1515(public var sv1515_enableforcedlogoff: BOOL = 0)

public data class SERVER_INFO_1516(public var sv1516_timesource: BOOL = 0)

public data class SERVER_INFO_1518(public var sv1518_lmannounce: BOOL = 0)

public data class SERVER_INFO_1520(public var sv1520_maxcopyreadlen: UInt = 0u)

public data class SERVER_INFO_1521(public var sv1521_maxcopywritelen: UInt = 0u)

public data class SERVER_INFO_1522(public var sv1522_minkeepsearch: UInt = 0u)

public data class SERVER_INFO_1523(public var sv1523_maxkeepsearch: UInt = 0u)

public data class SERVER_INFO_1524(public var sv1524_minkeepcomplsearch: UInt = 0u)

public data class SERVER_INFO_1525(public var sv1525_maxkeepcomplsearch: UInt = 0u)

public data class SERVER_INFO_1528(public var sv1528_scavtimeout: UInt = 0u)

public data class SERVER_INFO_1529(public var sv1529_minrcvqueue: UInt = 0u)

public data class SERVER_INFO_1530(public var sv1530_minfreeworkitems: UInt = 0u)

public data class SERVER_INFO_1533(public var sv1533_maxmpxct: UInt = 0u)

public data class SERVER_INFO_1534(public var sv1534_oplockbreakwait: UInt = 0u)

public data class SERVER_INFO_1535(public var sv1535_oplockbreakresponsewait: UInt = 0u)

public data class SERVER_INFO_1536(public var sv1536_enableoplocks: BOOL = 0)

public data class SERVER_INFO_1537(public var sv1537_enableoplockforceclose: BOOL = 0)

public data class SERVER_INFO_1538(public var sv1538_enablefcbopens: BOOL = 0)

public data class SERVER_INFO_1539(public var sv1539_enableraw: BOOL = 0)

public data class SERVER_INFO_1540(public var sv1540_enablesharednetdrives: BOOL = 0)

public data class SERVER_INFO_1541(public var sv1541_minfreeconnections: BOOL = 0)

public data class SERVER_INFO_1542(public var sv1542_maxfreeconnections: BOOL = 0)

public data class SERVER_INFO_1543(public var sv1543_initsesstable: UInt = 0u)

public data class SERVER_INFO_1544(public var sv1544_initconntable: UInt = 0u)

public data class SERVER_INFO_1545(public var sv1545_initfiletable: UInt = 0u)

public data class SERVER_INFO_1546(public var sv1546_initsearchtable: UInt = 0u)

public data class SERVER_INFO_1547(public var sv1547_alertschedule: UInt = 0u)

public data class SERVER_INFO_1548(public var sv1548_errorthreshold: UInt = 0u)

public data class SERVER_INFO_1549(public var sv1549_networkerrorthreshold: UInt = 0u)

public data class SERVER_INFO_1550(public var sv1550_diskspacethreshold: UInt = 0u)

public data class SERVER_INFO_1552(public var sv1552_maxlinkdelay: UInt = 0u)

public data class SERVER_INFO_1553(public var sv1553_minlinkthroughput: UInt = 0u)

public data class SERVER_INFO_1554(public var sv1554_linkinfovalidtime: UInt = 0u)

public data class SERVER_INFO_1555(public var sv1555_scavqosinfoupdatetime: UInt = 0u)

public data class SERVER_INFO_1556(public var sv1556_maxworkitemidletime: UInt = 0u)

public data class SERVER_INFO_1557(public var sv1557_maxrawworkitems: UInt = 0u)

public data class SERVER_INFO_1560(public var sv1560_producttype: UInt = 0u)

public data class SERVER_INFO_1561(public var sv1561_serversize: UInt = 0u)

public data class SERVER_INFO_1562(public var sv1562_connectionlessautodisc: UInt = 0u)

public data class SERVER_INFO_1563(public var sv1563_sharingviolationretries: UInt = 0u)

public data class SERVER_INFO_1564(public var sv1564_sharingviolationdelay: UInt = 0u)

public data class SERVER_INFO_1565(public var sv1565_maxglobalopensearch: UInt = 0u)

public data class SERVER_INFO_1566(public var sv1566_removeduplicatesearches: BOOL = 0)

public data class SERVER_INFO_1567(public var sv1567_lockviolationretries: UInt = 0u)

public data class SERVER_INFO_1568(public var sv1568_lockviolationoffset: UInt = 0u)

public data class SERVER_INFO_1569(public var sv1569_lockviolationdelay: UInt = 0u)

public data class SERVER_INFO_1570(public var sv1570_mdlreadswitchover: UInt = 0u)

public data class SERVER_INFO_1571(public var sv1571_cachedopenlimit: UInt = 0u)

public data class SERVER_INFO_1572(public var sv1572_criticalthreads: UInt = 0u)

public data class SERVER_INFO_1573(public var sv1573_restrictnullsessaccess: UInt = 0u)

public data class SERVER_INFO_1574(public var sv1574_enablewfw311directipx: UInt = 0u)

public data class SERVER_INFO_1575(public var sv1575_otherqueueaffinity: UInt = 0u)

public data class SERVER_INFO_1576(public var sv1576_queuesamplesecs: UInt = 0u)

public data class SERVER_INFO_1577(public var sv1577_balancecount: UInt = 0u)

public data class SERVER_INFO_1578(public var sv1578_preferredaffinity: UInt = 0u)

public data class SERVER_INFO_1579(public var sv1579_maxfreerfcbs: UInt = 0u)

public data class SERVER_INFO_1580(public var sv1580_maxfreemfcbs: UInt = 0u)

public data class SERVER_INFO_1581(public var sv1581_maxfreemlcbs: UInt = 0u)

public data class SERVER_INFO_1582(public var sv1582_maxfreepagedpoolchunks: UInt = 0u)

public data class SERVER_INFO_1583(public var sv1583_minpagedpoolchunksize: UInt = 0u)

public data class SERVER_INFO_1584(public var sv1584_maxpagedpoolchunksize: UInt = 0u)

public data class SERVER_INFO_1585(public var sv1585_sendsfrompreferredprocessor: BOOL = 0)

public data class SERVER_INFO_1586(public var sv1586_maxthreadsperqueue: UInt = 0u)

public data class SERVER_INFO_1587(public var sv1587_cacheddirectorylimit: UInt = 0u)

public data class SERVER_INFO_1588(public var sv1588_maxcopylength: UInt = 0u)

public data class SERVER_INFO_1590(public var sv1590_enablecompression: UInt = 0u)

public data class SERVER_INFO_1591(public var sv1591_autosharewks: UInt = 0u)

public data class SERVER_INFO_1592(public var sv1592_autosharewks: UInt = 0u)

public data class SERVER_INFO_1593(public var sv1593_enablesecuritysignature: UInt = 0u)

public data class SERVER_INFO_1594(public var sv1594_requiresecuritysignature: UInt = 0u)

public data class SERVER_INFO_1595(public var sv1595_minclientbuffersize: UInt = 0u)

public data class SERVER_INFO_1596(public var sv1596_ConnectionNoSessionsTimeout: UInt = 0u)

public data class SERVER_INFO_1597(public var sv1597_IdleThreadTimeOut: UInt = 0u)

public data class SERVER_INFO_1598(public var sv1598_enableW9xsecuritysignature: UInt = 0u)

public data class SERVER_INFO_1599(public var sv1598_enforcekerberosreauthentication: Boolean = false)

public data class SERVER_INFO_1600(public var sv1598_disabledos: Boolean = false)

public data class SERVER_INFO_1601(public var sv1598_lowdiskspaceminimum: UInt = 0u)

public data class SERVER_INFO_1602(public var sv_1598_disablestrictnamechecking: BOOL = 0)

public class SERVER_INFO_402(
    public var sv402_ulist_mtime: UInt = 0u,
    public var sv402_glist_mtime: UInt = 0u,
    public var sv402_alist_mtime: UInt = 0u,
    public var sv402_alerts: PWSTR = 0L,
    public var sv402_security: SERVER_INFO_SECURITY = 0u,
    public var sv402_numadmin: UInt = 0u,
    public var sv402_lanmask: UInt = 0u,
    public var sv402_guestacct: PWSTR = 0L,
    public var sv402_chdevs: UInt = 0u,
    public var sv402_chdevq: UInt = 0u,
    public var sv402_chdevjobs: UInt = 0u,
    public var sv402_connections: UInt = 0u,
    public var sv402_shares: UInt = 0u,
    public var sv402_openfiles: UInt = 0u,
    public var sv402_sessopens: UInt = 0u,
    public var sv402_sessvcs: UInt = 0u,
    public var sv402_sessreqs: UInt = 0u,
    public var sv402_opensearch: UInt = 0u,
    public var sv402_activelocks: UInt = 0u,
    public var sv402_numreqbuf: UInt = 0u,
    public var sv402_sizreqbuf: UInt = 0u,
    public var sv402_numbigbuf: UInt = 0u,
    public var sv402_numfiletasks: UInt = 0u,
    public var sv402_alertsched: UInt = 0u,
    public var sv402_erroralert: UInt = 0u,
    public var sv402_logonalert: UInt = 0u,
    public var sv402_accessalert: UInt = 0u,
    public var sv402_diskalert: UInt = 0u,
    public var sv402_netioalert: UInt = 0u,
    public var sv402_maxauditsz: UInt = 0u,
    public var sv402_srvheuristics: PWSTR = 0L,
)

public class SERVER_INFO_403(
    public var sv403_ulist_mtime: UInt = 0u,
    public var sv403_glist_mtime: UInt = 0u,
    public var sv403_alist_mtime: UInt = 0u,
    public var sv403_alerts: PWSTR = 0L,
    public var sv403_security: SERVER_INFO_SECURITY = 0u,
    public var sv403_numadmin: UInt = 0u,
    public var sv403_lanmask: UInt = 0u,
    public var sv403_guestacct: PWSTR = 0L,
    public var sv403_chdevs: UInt = 0u,
    public var sv403_chdevq: UInt = 0u,
    public var sv403_chdevjobs: UInt = 0u,
    public var sv403_connections: UInt = 0u,
    public var sv403_shares: UInt = 0u,
    public var sv403_openfiles: UInt = 0u,
    public var sv403_sessopens: UInt = 0u,
    public var sv403_sessvcs: UInt = 0u,
    public var sv403_sessreqs: UInt = 0u,
    public var sv403_opensearch: UInt = 0u,
    public var sv403_activelocks: UInt = 0u,
    public var sv403_numreqbuf: UInt = 0u,
    public var sv403_sizreqbuf: UInt = 0u,
    public var sv403_numbigbuf: UInt = 0u,
    public var sv403_numfiletasks: UInt = 0u,
    public var sv403_alertsched: UInt = 0u,
    public var sv403_erroralert: UInt = 0u,
    public var sv403_logonalert: UInt = 0u,
    public var sv403_accessalert: UInt = 0u,
    public var sv403_diskalert: UInt = 0u,
    public var sv403_netioalert: UInt = 0u,
    public var sv403_maxauditsz: UInt = 0u,
    public var sv403_srvheuristics: PWSTR = 0L,
    public var sv403_auditedevents: UInt = 0u,
    public var sv403_autoprofile: UInt = 0u,
    public var sv403_autopath: PWSTR = 0L,
)

public class SERVER_INFO_502(
    public var sv502_sessopens: UInt = 0u,
    public var sv502_sessvcs: UInt = 0u,
    public var sv502_opensearch: UInt = 0u,
    public var sv502_sizreqbuf: UInt = 0u,
    public var sv502_initworkitems: UInt = 0u,
    public var sv502_maxworkitems: UInt = 0u,
    public var sv502_rawworkitems: UInt = 0u,
    public var sv502_irpstacksize: UInt = 0u,
    public var sv502_maxrawbuflen: UInt = 0u,
    public var sv502_sessusers: UInt = 0u,
    public var sv502_sessconns: UInt = 0u,
    public var sv502_maxpagedmemoryusage: UInt = 0u,
    public var sv502_maxnonpagedmemoryusage: UInt = 0u,
    public var sv502_enablesoftcompat: BOOL = 0,
    public var sv502_enableforcedlogoff: BOOL = 0,
    public var sv502_timesource: BOOL = 0,
    public var sv502_acceptdownlevelapis: BOOL = 0,
    public var sv502_lmannounce: BOOL = 0,
)

public class SERVER_INFO_503(
    public var sv503_sessopens: UInt = 0u,
    public var sv503_sessvcs: UInt = 0u,
    public var sv503_opensearch: UInt = 0u,
    public var sv503_sizreqbuf: UInt = 0u,
    public var sv503_initworkitems: UInt = 0u,
    public var sv503_maxworkitems: UInt = 0u,
    public var sv503_rawworkitems: UInt = 0u,
    public var sv503_irpstacksize: UInt = 0u,
    public var sv503_maxrawbuflen: UInt = 0u,
    public var sv503_sessusers: UInt = 0u,
    public var sv503_sessconns: UInt = 0u,
    public var sv503_maxpagedmemoryusage: UInt = 0u,
    public var sv503_maxnonpagedmemoryusage: UInt = 0u,
    public var sv503_enablesoftcompat: BOOL = 0,
    public var sv503_enableforcedlogoff: BOOL = 0,
    public var sv503_timesource: BOOL = 0,
    public var sv503_acceptdownlevelapis: BOOL = 0,
    public var sv503_lmannounce: BOOL = 0,
    public var sv503_domain: PWSTR = 0L,
    public var sv503_maxcopyreadlen: UInt = 0u,
    public var sv503_maxcopywritelen: UInt = 0u,
    public var sv503_minkeepsearch: UInt = 0u,
    public var sv503_maxkeepsearch: UInt = 0u,
    public var sv503_minkeepcomplsearch: UInt = 0u,
    public var sv503_maxkeepcomplsearch: UInt = 0u,
    public var sv503_threadcountadd: UInt = 0u,
    public var sv503_numblockthreads: UInt = 0u,
    public var sv503_scavtimeout: UInt = 0u,
    public var sv503_minrcvqueue: UInt = 0u,
    public var sv503_minfreeworkitems: UInt = 0u,
    public var sv503_xactmemsize: UInt = 0u,
    public var sv503_threadpriority: UInt = 0u,
    public var sv503_maxmpxct: UInt = 0u,
    public var sv503_oplockbreakwait: UInt = 0u,
    public var sv503_oplockbreakresponsewait: UInt = 0u,
    public var sv503_enableoplocks: BOOL = 0,
    public var sv503_enableoplockforceclose: BOOL = 0,
    public var sv503_enablefcbopens: BOOL = 0,
    public var sv503_enableraw: BOOL = 0,
    public var sv503_enablesharednetdrives: BOOL = 0,
    public var sv503_minfreeconnections: UInt = 0u,
    public var sv503_maxfreeconnections: UInt = 0u,
)

public class SERVER_INFO_598(
    public var sv598_maxrawworkitems: UInt = 0u,
    public var sv598_maxthreadsperqueue: UInt = 0u,
    public var sv598_producttype: UInt = 0u,
    public var sv598_serversize: UInt = 0u,
    public var sv598_connectionlessautodisc: UInt = 0u,
    public var sv598_sharingviolationretries: UInt = 0u,
    public var sv598_sharingviolationdelay: UInt = 0u,
    public var sv598_maxglobalopensearch: UInt = 0u,
    public var sv598_removeduplicatesearches: UInt = 0u,
    public var sv598_lockviolationoffset: UInt = 0u,
    public var sv598_lockviolationdelay: UInt = 0u,
    public var sv598_mdlreadswitchover: UInt = 0u,
    public var sv598_cachedopenlimit: UInt = 0u,
    public var sv598_otherqueueaffinity: UInt = 0u,
    public var sv598_restrictnullsessaccess: BOOL = 0,
    public var sv598_enablewfw311directipx: BOOL = 0,
    public var sv598_queuesamplesecs: UInt = 0u,
    public var sv598_balancecount: UInt = 0u,
    public var sv598_preferredaffinity: UInt = 0u,
    public var sv598_maxfreerfcbs: UInt = 0u,
    public var sv598_maxfreemfcbs: UInt = 0u,
    public var sv598_maxfreelfcbs: UInt = 0u,
    public var sv598_maxfreepagedpoolchunks: UInt = 0u,
    public var sv598_minpagedpoolchunksize: UInt = 0u,
    public var sv598_maxpagedpoolchunksize: UInt = 0u,
    public var sv598_sendsfrompreferredprocessor: BOOL = 0,
    public var sv598_cacheddirectorylimit: UInt = 0u,
    public var sv598_maxcopylength: UInt = 0u,
    public var sv598_enablecompression: BOOL = 0,
    public var sv598_autosharewks: BOOL = 0,
    public var sv598_autoshareserver: BOOL = 0,
    public var sv598_enablesecuritysignature: BOOL = 0,
    public var sv598_requiresecuritysignature: BOOL = 0,
    public var sv598_minclientbuffersize: UInt = 0u,
    public var sv598_serverguid: GUID = GUID(),
    public var sv598_ConnectionNoSessionsTimeout: UInt = 0u,
    public var sv598_IdleThreadTimeOut: UInt = 0u,
    public var sv598_enableW9xsecuritysignature: BOOL = 0,
    public var sv598_enforcekerberosreauthentication: BOOL = 0,
    public var sv598_disabledos: BOOL = 0,
    public var sv598_lowdiskspaceminimum: UInt = 0u,
    public var sv598_disablestrictnamechecking: BOOL = 0,
    public var sv598_enableauthenticateusersharing: BOOL = 0,
)

public class SERVER_INFO_599(
    public var sv599_sessopens: UInt = 0u,
    public var sv599_sessvcs: UInt = 0u,
    public var sv599_opensearch: UInt = 0u,
    public var sv599_sizreqbuf: UInt = 0u,
    public var sv599_initworkitems: UInt = 0u,
    public var sv599_maxworkitems: UInt = 0u,
    public var sv599_rawworkitems: UInt = 0u,
    public var sv599_irpstacksize: UInt = 0u,
    public var sv599_maxrawbuflen: UInt = 0u,
    public var sv599_sessusers: UInt = 0u,
    public var sv599_sessconns: UInt = 0u,
    public var sv599_maxpagedmemoryusage: UInt = 0u,
    public var sv599_maxnonpagedmemoryusage: UInt = 0u,
    public var sv599_enablesoftcompat: BOOL = 0,
    public var sv599_enableforcedlogoff: BOOL = 0,
    public var sv599_timesource: BOOL = 0,
    public var sv599_acceptdownlevelapis: BOOL = 0,
    public var sv599_lmannounce: BOOL = 0,
    public var sv599_domain: PWSTR = 0L,
    public var sv599_maxcopyreadlen: UInt = 0u,
    public var sv599_maxcopywritelen: UInt = 0u,
    public var sv599_minkeepsearch: UInt = 0u,
    public var sv599_maxkeepsearch: UInt = 0u,
    public var sv599_minkeepcomplsearch: UInt = 0u,
    public var sv599_maxkeepcomplsearch: UInt = 0u,
    public var sv599_threadcountadd: UInt = 0u,
    public var sv599_numblockthreads: UInt = 0u,
    public var sv599_scavtimeout: UInt = 0u,
    public var sv599_minrcvqueue: UInt = 0u,
    public var sv599_minfreeworkitems: UInt = 0u,
    public var sv599_xactmemsize: UInt = 0u,
    public var sv599_threadpriority: UInt = 0u,
    public var sv599_maxmpxct: UInt = 0u,
    public var sv599_oplockbreakwait: UInt = 0u,
    public var sv599_oplockbreakresponsewait: UInt = 0u,
    public var sv599_enableoplocks: BOOL = 0,
    public var sv599_enableoplockforceclose: BOOL = 0,
    public var sv599_enablefcbopens: BOOL = 0,
    public var sv599_enableraw: BOOL = 0,
    public var sv599_enablesharednetdrives: BOOL = 0,
    public var sv599_minfreeconnections: UInt = 0u,
    public var sv599_maxfreeconnections: UInt = 0u,
    public var sv599_initsesstable: UInt = 0u,
    public var sv599_initconntable: UInt = 0u,
    public var sv599_initfiletable: UInt = 0u,
    public var sv599_initsearchtable: UInt = 0u,
    public var sv599_alertschedule: UInt = 0u,
    public var sv599_errorthreshold: UInt = 0u,
    public var sv599_networkerrorthreshold: UInt = 0u,
    public var sv599_diskspacethreshold: UInt = 0u,
    public var sv599_reserved: UInt = 0u,
    public var sv599_maxlinkdelay: UInt = 0u,
    public var sv599_minlinkthroughput: UInt = 0u,
    public var sv599_linkinfovalidtime: UInt = 0u,
    public var sv599_scavqosinfoupdatetime: UInt = 0u,
    public var sv599_maxworkitemidletime: UInt = 0u,
)

public data class SERVER_TRANSPORT_INFO_0(
    public var svti0_numberofvcs: UInt = 0u,
    public var svti0_transportname: PWSTR = 0L,
    public var svti0_transportaddress: Long = 0L,
    public var svti0_transportaddresslength: UInt = 0u,
    public var svti0_networkaddress: PWSTR = 0L,
)

public data class SERVER_TRANSPORT_INFO_1(
    public var svti1_numberofvcs: UInt = 0u,
    public var svti1_transportname: PWSTR = 0L,
    public var svti1_transportaddress: Long = 0L,
    public var svti1_transportaddresslength: UInt = 0u,
    public var svti1_networkaddress: PWSTR = 0L,
    public var svti1_domain: PWSTR = 0L,
)

public data class SERVER_TRANSPORT_INFO_2(
    public var svti2_numberofvcs: UInt = 0u,
    public var svti2_transportname: PWSTR = 0L,
    public var svti2_transportaddress: Long = 0L,
    public var svti2_transportaddresslength: UInt = 0u,
    public var svti2_networkaddress: PWSTR = 0L,
    public var svti2_domain: PWSTR = 0L,
    public var svti2_flags: UInt = 0u,
)

public data class SERVER_TRANSPORT_INFO_3(
    public var svti3_numberofvcs: UInt = 0u,
    public var svti3_transportname: PWSTR = 0L,
    public var svti3_transportaddress: Long = 0L,
    public var svti3_transportaddresslength: UInt = 0u,
    public var svti3_networkaddress: PWSTR = 0L,
    public var svti3_domain: PWSTR = 0L,
    public var svti3_flags: UInt = 0u,
    public var svti3_passwordlength: UInt = 0u,
    public var svti3_password: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SERVER_TRANSPORT_INFO_3) return false
        if (this.svti3_numberofvcs != other.svti3_numberofvcs) return false
        if (this.svti3_transportname != other.svti3_transportname) return false
        if (this.svti3_transportaddress != other.svti3_transportaddress) return false
        if (this.svti3_transportaddresslength != other.svti3_transportaddresslength) return false
        if (this.svti3_networkaddress != other.svti3_networkaddress) return false
        if (this.svti3_domain != other.svti3_domain) return false
        if (this.svti3_flags != other.svti3_flags) return false
        if (this.svti3_passwordlength != other.svti3_passwordlength) return false
        if (!this.svti3_password.contentEquals(other.svti3_password)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.svti3_numberofvcs.hashCode()
        result = 31 * result + this.svti3_transportname.hashCode()
        result = 31 * result + this.svti3_transportaddress.hashCode()
        result = 31 * result + this.svti3_transportaddresslength.hashCode()
        result = 31 * result + this.svti3_networkaddress.hashCode()
        result = 31 * result + this.svti3_domain.hashCode()
        result = 31 * result + this.svti3_flags.hashCode()
        result = 31 * result + this.svti3_passwordlength.hashCode()
        result = 31 * result + this.svti3_password.contentHashCode()
        return result
    }
}

public data class SERVICE_INFO_0(public var svci0_name: PWSTR = 0L)

public data class SERVICE_INFO_1(
    public var svci1_name: PWSTR = 0L,
    public var svci1_status: UInt = 0u,
    public var svci1_code: UInt = 0u,
    public var svci1_pid: UInt = 0u,
)

public data class SERVICE_INFO_2(
    public var svci2_name: PWSTR = 0L,
    public var svci2_status: UInt = 0u,
    public var svci2_code: UInt = 0u,
    public var svci2_pid: UInt = 0u,
    public var svci2_text: PWSTR = 0L,
    public var svci2_specific_error: UInt = 0u,
    public var svci2_display_name: PWSTR = 0L,
)

public data class SMB_COMPRESSION_INFO(
    public var Switch: Boolean = false,
    public var Reserved1: UByte = 0u,
    public var Reserved2: UShort = 0u,
    public var Reserved3: UInt = 0u,
)

public data class SMB_TREE_CONNECT_PARAMETERS(
    public var EABufferOffset: UInt = 0u,
    public var EABufferLen: UInt = 0u,
    public var CreateOptions: UInt = 0u,
    public var TreeConnectAttributes: UInt = 0u,
)

public data class SMB_USE_OPTION_COMPRESSION_PARAMETERS(
    public var Tag: UInt = 0u,
    public var Length: UShort = 0u,
    public var Reserved: UShort = 0u,
)

public data class STD_ALERT(
    public var alrt_timestamp: UInt = 0u,
    public var alrt_eventname: UShortArray = UShortArray(17),
    public var alrt_servicename: UShortArray = UShortArray(81),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is STD_ALERT) return false
        if (this.alrt_timestamp != other.alrt_timestamp) return false
        if (!this.alrt_eventname.contentEquals(other.alrt_eventname)) return false
        if (!this.alrt_servicename.contentEquals(other.alrt_servicename)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.alrt_timestamp.hashCode()
        result = 31 * result + this.alrt_eventname.contentHashCode()
        result = 31 * result + this.alrt_servicename.contentHashCode()
        return result
    }
}

public data class TIME_OF_DAY_INFO(
    public var tod_elapsedt: UInt = 0u,
    public var tod_msecs: UInt = 0u,
    public var tod_hours: UInt = 0u,
    public var tod_mins: UInt = 0u,
    public var tod_secs: UInt = 0u,
    public var tod_hunds: UInt = 0u,
    public var tod_timezone: Int = 0,
    public var tod_tinterval: UInt = 0u,
    public var tod_day: UInt = 0u,
    public var tod_month: UInt = 0u,
    public var tod_year: UInt = 0u,
    public var tod_weekday: UInt = 0u,
)

public data class TRANSPORT_INFO(public var Type: TRANSPORT_TYPE = 0, public var SkipCertificateCheck: Boolean = false)

public data class USER_INFO_0(public var usri0_name: PWSTR = 0L)

public data class USER_INFO_1(
    public var usri1_name: PWSTR = 0L,
    public var usri1_password: PWSTR = 0L,
    public var usri1_password_age: UInt = 0u,
    public var usri1_priv: USER_PRIV = 0u,
    public var usri1_home_dir: PWSTR = 0L,
    public var usri1_comment: PWSTR = 0L,
    public var usri1_flags: USER_ACCOUNT_FLAGS = 0u,
    public var usri1_script_path: PWSTR = 0L,
)

public data class USER_INFO_10(
    public var usri10_name: PWSTR = 0L,
    public var usri10_comment: PWSTR = 0L,
    public var usri10_usr_comment: PWSTR = 0L,
    public var usri10_full_name: PWSTR = 0L,
)

public data class USER_INFO_1003(public var usri1003_password: PWSTR = 0L)

public data class USER_INFO_1005(public var usri1005_priv: USER_PRIV = 0u)

public data class USER_INFO_1006(public var usri1006_home_dir: PWSTR = 0L)

public data class USER_INFO_1007(public var usri1007_comment: PWSTR = 0L)

public data class USER_INFO_1008(public var usri1008_flags: USER_ACCOUNT_FLAGS = 0u)

public data class USER_INFO_1009(public var usri1009_script_path: PWSTR = 0L)

public data class USER_INFO_1010(public var usri1010_auth_flags: AF_OP = 0u)

public data class USER_INFO_1011(public var usri1011_full_name: PWSTR = 0L)

public data class USER_INFO_1012(public var usri1012_usr_comment: PWSTR = 0L)

public data class USER_INFO_1013(public var usri1013_parms: PWSTR = 0L)

public data class USER_INFO_1014(public var usri1014_workstations: PWSTR = 0L)

public data class USER_INFO_1017(public var usri1017_acct_expires: UInt = 0u)

public data class USER_INFO_1018(public var usri1018_max_storage: UInt = 0u)

public data class USER_INFO_1020(public var usri1020_units_per_week: UInt = 0u, public var usri1020_logon_hours: Long = 0L)

public data class USER_INFO_1023(public var usri1023_logon_server: PWSTR = 0L)

public data class USER_INFO_1024(public var usri1024_country_code: UInt = 0u)

public data class USER_INFO_1025(public var usri1025_code_page: UInt = 0u)

public data class USER_INFO_1051(public var usri1051_primary_group_id: UInt = 0u)

public data class USER_INFO_1052(public var usri1052_profile: PWSTR = 0L)

public data class USER_INFO_1053(public var usri1053_home_dir_drive: PWSTR = 0L)

public class USER_INFO_11(
    public var usri11_name: PWSTR = 0L,
    public var usri11_comment: PWSTR = 0L,
    public var usri11_usr_comment: PWSTR = 0L,
    public var usri11_full_name: PWSTR = 0L,
    public var usri11_priv: USER_PRIV = 0u,
    public var usri11_auth_flags: AF_OP = 0u,
    public var usri11_password_age: UInt = 0u,
    public var usri11_home_dir: PWSTR = 0L,
    public var usri11_parms: PWSTR = 0L,
    public var usri11_last_logon: UInt = 0u,
    public var usri11_last_logoff: UInt = 0u,
    public var usri11_bad_pw_count: UInt = 0u,
    public var usri11_num_logons: UInt = 0u,
    public var usri11_logon_server: PWSTR = 0L,
    public var usri11_country_code: UInt = 0u,
    public var usri11_workstations: PWSTR = 0L,
    public var usri11_max_storage: UInt = 0u,
    public var usri11_units_per_week: UInt = 0u,
    public var usri11_logon_hours: Long = 0L,
    public var usri11_code_page: UInt = 0u,
)

public class USER_INFO_2(
    public var usri2_name: PWSTR = 0L,
    public var usri2_password: PWSTR = 0L,
    public var usri2_password_age: UInt = 0u,
    public var usri2_priv: USER_PRIV = 0u,
    public var usri2_home_dir: PWSTR = 0L,
    public var usri2_comment: PWSTR = 0L,
    public var usri2_flags: USER_ACCOUNT_FLAGS = 0u,
    public var usri2_script_path: PWSTR = 0L,
    public var usri2_auth_flags: AF_OP = 0u,
    public var usri2_full_name: PWSTR = 0L,
    public var usri2_usr_comment: PWSTR = 0L,
    public var usri2_parms: PWSTR = 0L,
    public var usri2_workstations: PWSTR = 0L,
    public var usri2_last_logon: UInt = 0u,
    public var usri2_last_logoff: UInt = 0u,
    public var usri2_acct_expires: UInt = 0u,
    public var usri2_max_storage: UInt = 0u,
    public var usri2_units_per_week: UInt = 0u,
    public var usri2_logon_hours: Long = 0L,
    public var usri2_bad_pw_count: UInt = 0u,
    public var usri2_num_logons: UInt = 0u,
    public var usri2_logon_server: PWSTR = 0L,
    public var usri2_country_code: UInt = 0u,
    public var usri2_code_page: UInt = 0u,
)

public data class USER_INFO_20(
    public var usri20_name: PWSTR = 0L,
    public var usri20_full_name: PWSTR = 0L,
    public var usri20_comment: PWSTR = 0L,
    public var usri20_flags: USER_ACCOUNT_FLAGS = 0u,
    public var usri20_user_id: UInt = 0u,
)

public data class USER_INFO_21(public var usri21_password: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is USER_INFO_21) return false
        if (!this.usri21_password.contentEquals(other.usri21_password)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.usri21_password.contentHashCode()
    }
}

public class USER_INFO_22(
    public var usri22_name: PWSTR = 0L,
    public var usri22_password: UByteArray = UByteArray(16),
    public var usri22_password_age: UInt = 0u,
    public var usri22_priv: USER_PRIV = 0u,
    public var usri22_home_dir: PWSTR = 0L,
    public var usri22_comment: PWSTR = 0L,
    public var usri22_flags: USER_ACCOUNT_FLAGS = 0u,
    public var usri22_script_path: PWSTR = 0L,
    public var usri22_auth_flags: AF_OP = 0u,
    public var usri22_full_name: PWSTR = 0L,
    public var usri22_usr_comment: PWSTR = 0L,
    public var usri22_parms: PWSTR = 0L,
    public var usri22_workstations: PWSTR = 0L,
    public var usri22_last_logon: UInt = 0u,
    public var usri22_last_logoff: UInt = 0u,
    public var usri22_acct_expires: UInt = 0u,
    public var usri22_max_storage: UInt = 0u,
    public var usri22_units_per_week: UInt = 0u,
    public var usri22_logon_hours: Long = 0L,
    public var usri22_bad_pw_count: UInt = 0u,
    public var usri22_num_logons: UInt = 0u,
    public var usri22_logon_server: PWSTR = 0L,
    public var usri22_country_code: UInt = 0u,
    public var usri22_code_page: UInt = 0u,
)

public data class USER_INFO_23(
    public var usri23_name: PWSTR = 0L,
    public var usri23_full_name: PWSTR = 0L,
    public var usri23_comment: PWSTR = 0L,
    public var usri23_flags: USER_ACCOUNT_FLAGS = 0u,
    public var usri23_user_sid: PSID = 0L,
)

public data class USER_INFO_24(
    public var usri24_internet_identity: BOOL = 0,
    public var usri24_flags: UInt = 0u,
    public var usri24_internet_provider_name: PWSTR = 0L,
    public var usri24_internet_principal_name: PWSTR = 0L,
    public var usri24_user_sid: PSID = 0L,
)

public class USER_INFO_3(
    public var usri3_name: PWSTR = 0L,
    public var usri3_password: PWSTR = 0L,
    public var usri3_password_age: UInt = 0u,
    public var usri3_priv: USER_PRIV = 0u,
    public var usri3_home_dir: PWSTR = 0L,
    public var usri3_comment: PWSTR = 0L,
    public var usri3_flags: USER_ACCOUNT_FLAGS = 0u,
    public var usri3_script_path: PWSTR = 0L,
    public var usri3_auth_flags: AF_OP = 0u,
    public var usri3_full_name: PWSTR = 0L,
    public var usri3_usr_comment: PWSTR = 0L,
    public var usri3_parms: PWSTR = 0L,
    public var usri3_workstations: PWSTR = 0L,
    public var usri3_last_logon: UInt = 0u,
    public var usri3_last_logoff: UInt = 0u,
    public var usri3_acct_expires: UInt = 0u,
    public var usri3_max_storage: UInt = 0u,
    public var usri3_units_per_week: UInt = 0u,
    public var usri3_logon_hours: Long = 0L,
    public var usri3_bad_pw_count: UInt = 0u,
    public var usri3_num_logons: UInt = 0u,
    public var usri3_logon_server: PWSTR = 0L,
    public var usri3_country_code: UInt = 0u,
    public var usri3_code_page: UInt = 0u,
    public var usri3_user_id: UInt = 0u,
    public var usri3_primary_group_id: UInt = 0u,
    public var usri3_profile: PWSTR = 0L,
    public var usri3_home_dir_drive: PWSTR = 0L,
    public var usri3_password_expired: UInt = 0u,
)

public class USER_INFO_4(
    public var usri4_name: PWSTR = 0L,
    public var usri4_password: PWSTR = 0L,
    public var usri4_password_age: UInt = 0u,
    public var usri4_priv: USER_PRIV = 0u,
    public var usri4_home_dir: PWSTR = 0L,
    public var usri4_comment: PWSTR = 0L,
    public var usri4_flags: USER_ACCOUNT_FLAGS = 0u,
    public var usri4_script_path: PWSTR = 0L,
    public var usri4_auth_flags: AF_OP = 0u,
    public var usri4_full_name: PWSTR = 0L,
    public var usri4_usr_comment: PWSTR = 0L,
    public var usri4_parms: PWSTR = 0L,
    public var usri4_workstations: PWSTR = 0L,
    public var usri4_last_logon: UInt = 0u,
    public var usri4_last_logoff: UInt = 0u,
    public var usri4_acct_expires: UInt = 0u,
    public var usri4_max_storage: UInt = 0u,
    public var usri4_units_per_week: UInt = 0u,
    public var usri4_logon_hours: Long = 0L,
    public var usri4_bad_pw_count: UInt = 0u,
    public var usri4_num_logons: UInt = 0u,
    public var usri4_logon_server: PWSTR = 0L,
    public var usri4_country_code: UInt = 0u,
    public var usri4_code_page: UInt = 0u,
    public var usri4_user_sid: PSID = 0L,
    public var usri4_primary_group_id: UInt = 0u,
    public var usri4_profile: PWSTR = 0L,
    public var usri4_home_dir_drive: PWSTR = 0L,
    public var usri4_password_expired: UInt = 0u,
)

public data class USER_MODALS_INFO_0(
    public var usrmod0_min_passwd_len: UInt = 0u,
    public var usrmod0_max_passwd_age: UInt = 0u,
    public var usrmod0_min_passwd_age: UInt = 0u,
    public var usrmod0_force_logoff: UInt = 0u,
    public var usrmod0_password_hist_len: UInt = 0u,
)

public data class USER_MODALS_INFO_1(public var usrmod1_role: UInt = 0u, public var usrmod1_primary: PWSTR = 0L)

public data class USER_MODALS_INFO_1001(public var usrmod1001_min_passwd_len: UInt = 0u)

public data class USER_MODALS_INFO_1002(public var usrmod1002_max_passwd_age: UInt = 0u)

public data class USER_MODALS_INFO_1003(public var usrmod1003_min_passwd_age: UInt = 0u)

public data class USER_MODALS_INFO_1004(public var usrmod1004_force_logoff: UInt = 0u)

public data class USER_MODALS_INFO_1005(public var usrmod1005_password_hist_len: UInt = 0u)

public data class USER_MODALS_INFO_1006(public var usrmod1006_role: USER_MODALS_ROLES = 0u)

public data class USER_MODALS_INFO_1007(public var usrmod1007_primary: PWSTR = 0L)

public data class USER_MODALS_INFO_2(public var usrmod2_domain_name: PWSTR = 0L, public var usrmod2_domain_id: PSID = 0L)

public data class USER_MODALS_INFO_3(
    public var usrmod3_lockout_duration: UInt = 0u,
    public var usrmod3_lockout_observation_window: UInt = 0u,
    public var usrmod3_lockout_threshold: UInt = 0u,
)

public data class USER_OTHER_INFO(public var alrtus_errcode: UInt = 0u, public var alrtus_numstrings: UInt = 0u)

public data class USE_INFO_0(public var ui0_local: PWSTR = 0L, public var ui0_remote: PWSTR = 0L)

public data class USE_INFO_1(
    public var ui1_local: PWSTR = 0L,
    public var ui1_remote: PWSTR = 0L,
    public var ui1_password: PWSTR = 0L,
    public var ui1_status: UInt = 0u,
    public var ui1_asg_type: USE_INFO_ASG_TYPE = 0u,
    public var ui1_refcount: UInt = 0u,
    public var ui1_usecount: UInt = 0u,
)

public data class USE_INFO_2(
    public var ui2_local: PWSTR = 0L,
    public var ui2_remote: PWSTR = 0L,
    public var ui2_password: PWSTR = 0L,
    public var ui2_status: UInt = 0u,
    public var ui2_asg_type: USE_INFO_ASG_TYPE = 0u,
    public var ui2_refcount: UInt = 0u,
    public var ui2_usecount: UInt = 0u,
    public var ui2_username: PWSTR = 0L,
    public var ui2_domainname: PWSTR = 0L,
)
