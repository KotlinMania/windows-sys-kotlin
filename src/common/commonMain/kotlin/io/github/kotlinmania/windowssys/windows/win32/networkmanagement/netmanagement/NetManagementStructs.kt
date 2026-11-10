@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.netmanagement

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SidNameUse
import io.github.kotlinmania.windowssys.windows.win32.security.cryptography.CertContext

public data class AccessInfo0(
    public var acc0ResourceName: Pwstr = null,
)

public data class AccessInfo1(
    public var acc1ResourceName: Pwstr = null,
    public var acc1Attr: UInt = 0u,
    public var acc1Count: UInt = 0u,
)

public data class AccessInfo1002(
    public var acc1002Attr: UInt = 0u,
)

public data class AccessList(
    public var aclUgname: Pwstr = null,
    public var aclAccess: UInt = 0u,
)

public data class AdminOtherInfo(
    public var alrtadErrcode: UInt = 0u,
    public var alrtadNumstrings: UInt = 0u,
)

public data class AeAcclim(
    public var aeAlCompname: UInt = 0u,
    public var aeAlUsername: UInt = 0u,
    public var aeAlResname: UInt = 0u,
    public var aeAlLimit: UInt = 0u,
)

public data class AeAclmod(
    public var aeAmCompname: UInt = 0u,
    public var aeAmUsername: UInt = 0u,
    public var aeAmResname: UInt = 0u,
    public var aeAmAction: UInt = 0u,
    public var aeAmDatalen: UInt = 0u,
)

public data class AeClosefile(
    public var aeCfCompname: UInt = 0u,
    public var aeCfUsername: UInt = 0u,
    public var aeCfResname: UInt = 0u,
    public var aeCfFileid: UInt = 0u,
    public var aeCfDuration: UInt = 0u,
    public var aeCfReason: UInt = 0u,
)

public data class AeConnrej(
    public var aeCrCompname: UInt = 0u,
    public var aeCrUsername: UInt = 0u,
    public var aeCrNetname: UInt = 0u,
    public var aeCrReason: UInt = 0u,
)

public data class AeConnstart(
    public var aeCtCompname: UInt = 0u,
    public var aeCtUsername: UInt = 0u,
    public var aeCtNetname: UInt = 0u,
    public var aeCtConnid: UInt = 0u,
)

public data class AeConnstop(
    public var aeCpCompname: UInt = 0u,
    public var aeCpUsername: UInt = 0u,
    public var aeCpNetname: UInt = 0u,
    public var aeCpConnid: UInt = 0u,
    public var aeCpReason: UInt = 0u,
)

public data class AeGeneric(
    public var aeGeMsgfile: UInt = 0u,
    public var aeGeMsgnum: UInt = 0u,
    public var aeGeParams: UInt = 0u,
    public var aeGeParam1: UInt = 0u,
    public var aeGeParam2: UInt = 0u,
    public var aeGeParam3: UInt = 0u,
    public var aeGeParam4: UInt = 0u,
    public var aeGeParam5: UInt = 0u,
    public var aeGeParam6: UInt = 0u,
    public var aeGeParam7: UInt = 0u,
    public var aeGeParam8: UInt = 0u,
    public var aeGeParam9: UInt = 0u,
)

public data class AeLockout(
    public var aeLkCompname: UInt = 0u,
    public var aeLkUsername: UInt = 0u,
    public var aeLkAction: UInt = 0u,
    public var aeLkBadPwCount: UInt = 0u,
)

public data class AeNetlogoff(
    public var aeNfCompname: UInt = 0u,
    public var aeNfUsername: UInt = 0u,
    public var aeNfReserved1: UInt = 0u,
    public var aeNfReserved2: UInt = 0u,
)

public data class AeNetlogon(
    public var aeNoCompname: UInt = 0u,
    public var aeNoUsername: UInt = 0u,
    public var aeNoPrivilege: UInt = 0u,
    public var aeNoAuthflags: UInt = 0u,
)

public data class AeResaccess(
    public var aeRaCompname: UInt = 0u,
    public var aeRaUsername: UInt = 0u,
    public var aeRaResname: UInt = 0u,
    public var aeRaOperation: UInt = 0u,
    public var aeRaReturncode: UInt = 0u,
    public var aeRaRestype: UInt = 0u,
    public var aeRaFileid: UInt = 0u,
)

public data class AeResaccessrej(
    public var aeRrCompname: UInt = 0u,
    public var aeRrUsername: UInt = 0u,
    public var aeRrResname: UInt = 0u,
    public var aeRrOperation: UInt = 0u,
)

public data class AeServicestat(
    public var aeSsCompname: UInt = 0u,
    public var aeSsUsername: UInt = 0u,
    public var aeSsSvcname: UInt = 0u,
    public var aeSsStatus: UInt = 0u,
    public var aeSsCode: UInt = 0u,
    public var aeSsText: UInt = 0u,
    public var aeSsReturnval: UInt = 0u,
)

public data class AeSesslogoff(
    public var aeSfCompname: UInt = 0u,
    public var aeSfUsername: UInt = 0u,
    public var aeSfReason: UInt = 0u,
)

public data class AeSesslogon(
    public var aeSoCompname: UInt = 0u,
    public var aeSoUsername: UInt = 0u,
    public var aeSoPrivilege: UInt = 0u,
)

public data class AeSesspwerr(
    public var aeSpCompname: UInt = 0u,
    public var aeSpUsername: UInt = 0u,
)

public data class AeSrvstatus(
    public var aeSvStatus: UInt = 0u,
)

public data class AeUasmod(
    public var aeUmCompname: UInt = 0u,
    public var aeUmUsername: UInt = 0u,
    public var aeUmResname: UInt = 0u,
    public var aeUmRectype: UInt = 0u,
    public var aeUmAction: UInt = 0u,
    public var aeUmDatalen: UInt = 0u,
)

public data class AtEnum(
    public var jobId: UInt = 0u,
    public var jobTime: Int = 0,
    public var daysOfMonth: UInt = 0u,
    public var daysOfWeek: UByte = 0u,
    public var flags: UByte = 0u,
    public var command: Pwstr = null,
)

public data class AtInfo(
    public var jobTime: Int = 0,
    public var daysOfMonth: UInt = 0u,
    public var daysOfWeek: UByte = 0u,
    public var flags: UByte = 0u,
    public var command: Pwstr = null,
)

public data class AuditEntry(
    public var aeLen: UInt = 0u,
    public var aeReserved: UInt = 0u,
    public var aeTime: UInt = 0u,
    public var aeType: UInt = 0u,
    public var aeDataOffset: UInt = 0u,
    public var aeDataSize: UInt = 0u,
)

public data class ConfigInfo0(
    public var cfgi0Key: Pwstr = null,
    public var cfgi0Data: Pwstr = null,
)

public data class DsregJoinInfo(
    public var joinType: DsregJoinType = 0,
    public var pJoinCertificate: CertContext? = null,
    public var pszDeviceId: Pwstr = null,
    public var pszIdpDomain: Pwstr = null,
    public var pszTenantId: Pwstr = null,
    public var pszJoinUserEmail: Pwstr = null,
    public var pszTenantDisplayName: Pwstr = null,
    public var pszMdmEnrollmentUrl: Pwstr = null,
    public var pszMdmTermsOfUseUrl: Pwstr = null,
    public var pszMdmComplianceUrl: Pwstr = null,
    public var pszUserSettingSyncUrl: Pwstr = null,
    public var pUserInfo: DsregUserInfo? = null,
)

public data class DsregUserInfo(
    public var pszUserEmail: Pwstr = null,
    public var pszUserKeyId: Pwstr = null,
    public var pszUserKeyName: Pwstr = null,
)

public data class ErrlogOtherInfo(
    public var alrterErrcode: UInt = 0u,
    public var alrterOffset: UInt = 0u,
)

public data class ErrorLog(
    public var elLen: UInt = 0u,
    public var elReserved: UInt = 0u,
    public var elTime: UInt = 0u,
    public var elError: UInt = 0u,
    public var elName: Pwstr = null,
    public var elText: Pwstr = null,
    public var elData: COpaquePointer? = null,
    public var elDataSize: UInt = 0u,
    public var elNstrings: UInt = 0u,
)

public data class FlatString(
    public var maximumLength: Short = 0,
    public var length: Short = 0,
    public var buffer: ByteArray = ByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FlatString) return false
        if (this.maximumLength != other.maximumLength) return false
        if (this.length != other.length) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maximumLength.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.buffer.contentHashCode()
        return result
    }
}

public data class GroupInfo0(
    public var grpi0Name: Pwstr = null,
)

public data class GroupInfo1(
    public var grpi1Name: Pwstr = null,
    public var grpi1Comment: Pwstr = null,
)

public data class GroupInfo1002(
    public var grpi1002Comment: Pwstr = null,
)

public data class GroupInfo1005(
    public var grpi1005Attributes: UInt = 0u,
)

public data class GroupInfo2(
    public var grpi2Name: Pwstr = null,
    public var grpi2Comment: Pwstr = null,
    public var grpi2GroupId: UInt = 0u,
    public var grpi2Attributes: UInt = 0u,
)

public data class GroupInfo3(
    public var grpi3Name: Pwstr = null,
    public var grpi3Comment: Pwstr = null,
    public var grpi3GroupSid: Psid = null,
    public var grpi3Attributes: UInt = 0u,
)

public data class GroupUsersInfo0(
    public var grui0Name: Pwstr = null,
)

public data class GroupUsersInfo1(
    public var grui1Name: Pwstr = null,
    public var grui1Attributes: UInt = 0u,
)

public data class HardwareAddress(
    public var address: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HardwareAddress) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int = this.address.contentHashCode()
}

public data class Hlog(
    public var time: UInt = 0u,
    public var lastFlags: UInt = 0u,
    public var offset: UInt = 0u,
    public var recOffset: UInt = 0u,
)

public data class LocalgroupInfo0(
    public var lgrpi0Name: Pwstr = null,
)

public data class LocalgroupInfo1(
    public var lgrpi1Name: Pwstr = null,
    public var lgrpi1Comment: Pwstr = null,
)

public data class LocalgroupInfo1002(
    public var lgrpi1002Comment: Pwstr = null,
)

public data class LocalgroupMembersInfo0(
    public var lgrmi0Sid: Psid = null,
)

public data class LocalgroupMembersInfo1(
    public var lgrmi1Sid: Psid = null,
    public var lgrmi1Sidusage: SidNameUse = 0,
    public var lgrmi1Name: Pwstr = null,
)

public data class LocalgroupMembersInfo2(
    public var lgrmi2Sid: Psid = null,
    public var lgrmi2Sidusage: SidNameUse = 0,
    public var lgrmi2Domainandname: Pwstr = null,
)

public data class LocalgroupMembersInfo3(
    public var lgrmi3Domainandname: Pwstr = null,
)

public data class LocalgroupUsersInfo0(
    public var lgrui0Name: Pwstr = null,
)

public data class MprProtocol0(
    public var dwProtocolId: UInt = 0u,
    public var wszProtocol: UShortArray = UShortArray(41),
    public var wszDLLName: UShortArray = UShortArray(49),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MprProtocol0) return false
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

public data class MsaInfo0(
    public var state: MsaInfoState = 0,
)

public data class MsgInfo0(
    public var msgi0Name: Pwstr = null,
)

public data class MsgInfo1(
    public var msgi1Name: Pwstr = null,
    public var msgi1ForwardFlag: UInt = 0u,
    public var msgi1Forward: Pwstr = null,
)

public data class NetlogonInfo1(
    public var netlog1Flags: UInt = 0u,
    public var netlog1PdcConnectionStatus: UInt = 0u,
)

public data class NetlogonInfo2(
    public var netlog2Flags: UInt = 0u,
    public var netlog2PdcConnectionStatus: UInt = 0u,
    public var netlog2TrustedDcName: Pwstr = null,
    public var netlog2TcConnectionStatus: UInt = 0u,
)

public data class NetlogonInfo3(
    public var netlog3Flags: UInt = 0u,
    public var netlog3LogonAttempts: UInt = 0u,
    public var netlog3Reserved1: UInt = 0u,
    public var netlog3Reserved2: UInt = 0u,
    public var netlog3Reserved3: UInt = 0u,
    public var netlog3Reserved4: UInt = 0u,
    public var netlog3Reserved5: UInt = 0u,
)

public data class NetlogonInfo4(
    public var netlog4TrustedDcName: Pwstr = null,
    public var netlog4TrustedDomainName: Pwstr = null,
)

public data class NetsetupProvisioningParams(
    public var dwVersion: UInt = 0u,
    public var lpDomain: Pcwstr = null,
    public var lpHostName: Pcwstr = null,
    public var lpMachineAccountOU: Pcwstr = null,
    public var lpDcName: Pcwstr = null,
    public var dwProvisionOptions: NetsetupProvision = 0u,
    public var aCertTemplateNames: Pcwstr? = null,
    public var cCertTemplateNames: UInt = 0u,
    public var aMachinePolicyNames: Pcwstr? = null,
    public var cMachinePolicyNames: UInt = 0u,
    public var aMachinePolicyPaths: Pcwstr? = null,
    public var cMachinePolicyPaths: UInt = 0u,
    public var lpNetbiosName: Pwstr = null,
    public var lpSiteName: Pwstr = null,
    public var lpPrimaryDNSDomain: Pwstr = null,
)

public data class NetworkName(
    public var name: FlatString = FlatString(),
)

public data class NetDisplayGroup(
    public var grpi3Name: Pwstr = null,
    public var grpi3Comment: Pwstr = null,
    public var grpi3GroupId: UInt = 0u,
    public var grpi3Attributes: UInt = 0u,
    public var grpi3NextIndex: UInt = 0u,
)

public data class NetDisplayMachine(
    public var usri2Name: Pwstr = null,
    public var usri2Comment: Pwstr = null,
    public var usri2Flags: UserAccountFlags = 0u,
    public var usri2UserId: UInt = 0u,
    public var usri2NextIndex: UInt = 0u,
)

public data class NetDisplayUser(
    public var usri1Name: Pwstr = null,
    public var usri1Comment: Pwstr = null,
    public var usri1Flags: UserAccountFlags = 0u,
    public var usri1FullName: Pwstr = null,
    public var usri1UserId: UInt = 0u,
    public var usri1NextIndex: UInt = 0u,
)

public data class NetValidateAuthenticationInputArg(
    public var inputPersistedFields: NetValidatePersistedFields = NetValidatePersistedFields(),
    public var passwordMatched: Boolean = false,
)

public data class NetValidateOutputArg(
    public var changedPersistedFields: NetValidatePersistedFields = NetValidatePersistedFields(),
    public var validationStatus: UInt = 0u,
)

public data class NetValidatePasswordChangeInputArg(
    public var inputPersistedFields: NetValidatePersistedFields = NetValidatePersistedFields(),
    public var clearPassword: Pwstr = null,
    public var userAccountName: Pwstr = null,
    public var hashedPassword: NetValidatePasswordHash = NetValidatePasswordHash(),
    public var passwordMatch: Boolean = false,
)

public data class NetValidatePasswordHash(
    public var length: UInt = 0u,
    public var hash: COpaquePointer? = null,
)

public data class NetValidatePasswordResetInputArg(
    public var inputPersistedFields: NetValidatePersistedFields = NetValidatePersistedFields(),
    public var clearPassword: Pwstr = null,
    public var userAccountName: Pwstr = null,
    public var hashedPassword: NetValidatePasswordHash = NetValidatePasswordHash(),
    public var passwordMustChangeAtNextLogon: Boolean = false,
    public var clearLockout: Boolean = false,
)

public data class NetValidatePersistedFields(
    public var presentFields: UInt = 0u,
    public var passwordLastSet: Filetime = Filetime(),
    public var badPasswordTime: Filetime = Filetime(),
    public var lockoutTime: Filetime = Filetime(),
    public var badPasswordCount: UInt = 0u,
    public var passwordHistoryLength: UInt = 0u,
    public var passwordHistory: NetValidatePasswordHash? = null,
)

public data class OboToken(
    public var type: OboTokenType = 0,
    public var pncc: COpaquePointer? = null,
    public var pszwManufacturer: Pcwstr = null,
    public var pszwProduct: Pcwstr = null,
    public var pszwDisplayName: Pcwstr = null,
    public var fRegistered: Bool = 0,
)

public data class PrintOtherInfo(
    public var alrtprJobid: UInt = 0u,
    public var alrtprStatus: UInt = 0u,
    public var alrtprSubmitted: UInt = 0u,
    public var alrtprSize: UInt = 0u,
)

public data class RasconIpui(
    public var guidConnection: Guid = Guid(),
    public var fIPv6Cfg: Bool = 0,
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
        if (other !is RasconIpui) return false
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

public data class ReplEdirInfo0(
    public var rped0Dirname: Pwstr = null,
)

public data class ReplEdirInfo1(
    public var rped1Dirname: Pwstr = null,
    public var rped1Integrity: UInt = 0u,
    public var rped1Extent: UInt = 0u,
)

public data class ReplEdirInfo1000(
    public var rped1000Integrity: UInt = 0u,
)

public data class ReplEdirInfo1001(
    public var rped1001Extent: UInt = 0u,
)

public data class ReplEdirInfo2(
    public var rped2Dirname: Pwstr = null,
    public var rped2Integrity: UInt = 0u,
    public var rped2Extent: UInt = 0u,
    public var rped2Lockcount: UInt = 0u,
    public var rped2Locktime: UInt = 0u,
)

public data class ReplIdirInfo0(
    public var rpid0Dirname: Pwstr = null,
)

public data class ReplIdirInfo1(
    public var rpid1Dirname: Pwstr = null,
    public var rpid1State: UInt = 0u,
    public var rpid1Mastername: Pwstr = null,
    public var rpid1LastUpdateTime: UInt = 0u,
    public var rpid1Lockcount: UInt = 0u,
    public var rpid1Locktime: UInt = 0u,
)

public data class ReplInfo0(
    public var rp0Role: UInt = 0u,
    public var rp0Exportpath: Pwstr = null,
    public var rp0Exportlist: Pwstr = null,
    public var rp0Importpath: Pwstr = null,
    public var rp0Importlist: Pwstr = null,
    public var rp0Logonusername: Pwstr = null,
    public var rp0Interval: UInt = 0u,
    public var rp0Pulse: UInt = 0u,
    public var rp0Guardtime: UInt = 0u,
    public var rp0Random: UInt = 0u,
)

public data class ReplInfo1000(
    public var rp1000Interval: UInt = 0u,
)

public data class ReplInfo1001(
    public var rp1001Pulse: UInt = 0u,
)

public data class ReplInfo1002(
    public var rp1002Guardtime: UInt = 0u,
)

public data class ReplInfo1003(
    public var rp1003Random: UInt = 0u,
)

public data class RtrInfoBlockHeader(
    public var version: UInt = 0u,
    public var size: UInt = 0u,
    public var tocEntriesCount: UInt = 0u,
    public var tocEntry: List<RtrTocEntry> = List(1) { RtrTocEntry() },
)

public data class RtrTocEntry(
    public var infoType: UInt = 0u,
    public var infoSize: UInt = 0u,
    public var count: UInt = 0u,
    public var offset: UInt = 0u,
)

public data class ServerInfo100(
    public var sv100PlatformId: UInt = 0u,
    public var sv100Name: Pwstr = null,
)

public data class ServerInfo1005(
    public var sv1005Comment: Pwstr = null,
)

public data class ServerInfo101(
    public var sv101PlatformId: UInt = 0u,
    public var sv101Name: Pwstr = null,
    public var sv101VersionMajor: UInt = 0u,
    public var sv101VersionMinor: UInt = 0u,
    public var sv101Type: NetServerType = 0u,
    public var sv101Comment: Pwstr = null,
)

public data class ServerInfo1010(
    public var sv1010Disc: Int = 0,
)

public data class ServerInfo1016(
    public var sv1016Hidden: ServerInfoHidden = 0,
)

public data class ServerInfo1017(
    public var sv1017Announce: UInt = 0u,
)

public data class ServerInfo1018(
    public var sv1018Anndelta: UInt = 0u,
)

public data class ServerInfo102(
    public var sv102PlatformId: UInt = 0u,
    public var sv102Name: Pwstr = null,
    public var sv102VersionMajor: UInt = 0u,
    public var sv102VersionMinor: UInt = 0u,
    public var sv102Type: NetServerType = 0u,
    public var sv102Comment: Pwstr = null,
    public var sv102Users: UInt = 0u,
    public var sv102Disc: Int = 0,
    public var sv102Hidden: ServerInfoHidden = 0,
    public var sv102Announce: UInt = 0u,
    public var sv102Anndelta: UInt = 0u,
    public var sv102Licenses: UInt = 0u,
    public var sv102Userpath: Pwstr = null,
)

public data class ServerInfo103(
    public var sv103PlatformId: UInt = 0u,
    public var sv103Name: Pwstr = null,
    public var sv103VersionMajor: UInt = 0u,
    public var sv103VersionMinor: UInt = 0u,
    public var sv103Type: UInt = 0u,
    public var sv103Comment: Pwstr = null,
    public var sv103Users: UInt = 0u,
    public var sv103Disc: Int = 0,
    public var sv103Hidden: Bool = 0,
    public var sv103Announce: UInt = 0u,
    public var sv103Anndelta: UInt = 0u,
    public var sv103Licenses: UInt = 0u,
    public var sv103Userpath: Pwstr = null,
    public var sv103Capabilities: UInt = 0u,
)

public data class ServerInfo1107(
    public var sv1107Users: UInt = 0u,
)

public data class ServerInfo1501(
    public var sv1501Sessopens: UInt = 0u,
)

public data class ServerInfo1502(
    public var sv1502Sessvcs: UInt = 0u,
)

public data class ServerInfo1503(
    public var sv1503Opensearch: UInt = 0u,
)

public data class ServerInfo1506(
    public var sv1506Maxworkitems: UInt = 0u,
)

public data class ServerInfo1509(
    public var sv1509Maxrawbuflen: UInt = 0u,
)

public data class ServerInfo1510(
    public var sv1510Sessusers: UInt = 0u,
)

public data class ServerInfo1511(
    public var sv1511Sessconns: UInt = 0u,
)

public data class ServerInfo1512(
    public var sv1512Maxnonpagedmemoryusage: UInt = 0u,
)

public data class ServerInfo1513(
    public var sv1513Maxpagedmemoryusage: UInt = 0u,
)

public data class ServerInfo1514(
    public var sv1514Enablesoftcompat: Bool = 0,
)

public data class ServerInfo1515(
    public var sv1515Enableforcedlogoff: Bool = 0,
)

public data class ServerInfo1516(
    public var sv1516Timesource: Bool = 0,
)

public data class ServerInfo1518(
    public var sv1518Lmannounce: Bool = 0,
)

public data class ServerInfo1520(
    public var sv1520Maxcopyreadlen: UInt = 0u,
)

public data class ServerInfo1521(
    public var sv1521Maxcopywritelen: UInt = 0u,
)

public data class ServerInfo1522(
    public var sv1522Minkeepsearch: UInt = 0u,
)

public data class ServerInfo1523(
    public var sv1523Maxkeepsearch: UInt = 0u,
)

public data class ServerInfo1524(
    public var sv1524Minkeepcomplsearch: UInt = 0u,
)

public data class ServerInfo1525(
    public var sv1525Maxkeepcomplsearch: UInt = 0u,
)

public data class ServerInfo1528(
    public var sv1528Scavtimeout: UInt = 0u,
)

public data class ServerInfo1529(
    public var sv1529Minrcvqueue: UInt = 0u,
)

public data class ServerInfo1530(
    public var sv1530Minfreeworkitems: UInt = 0u,
)

public data class ServerInfo1533(
    public var sv1533Maxmpxct: UInt = 0u,
)

public data class ServerInfo1534(
    public var sv1534Oplockbreakwait: UInt = 0u,
)

public data class ServerInfo1535(
    public var sv1535Oplockbreakresponsewait: UInt = 0u,
)

public data class ServerInfo1536(
    public var sv1536Enableoplocks: Bool = 0,
)

public data class ServerInfo1537(
    public var sv1537Enableoplockforceclose: Bool = 0,
)

public data class ServerInfo1538(
    public var sv1538Enablefcbopens: Bool = 0,
)

public data class ServerInfo1539(
    public var sv1539Enableraw: Bool = 0,
)

public data class ServerInfo1540(
    public var sv1540Enablesharednetdrives: Bool = 0,
)

public data class ServerInfo1541(
    public var sv1541Minfreeconnections: Bool = 0,
)

public data class ServerInfo1542(
    public var sv1542Maxfreeconnections: Bool = 0,
)

public data class ServerInfo1543(
    public var sv1543Initsesstable: UInt = 0u,
)

public data class ServerInfo1544(
    public var sv1544Initconntable: UInt = 0u,
)

public data class ServerInfo1545(
    public var sv1545Initfiletable: UInt = 0u,
)

public data class ServerInfo1546(
    public var sv1546Initsearchtable: UInt = 0u,
)

public data class ServerInfo1547(
    public var sv1547Alertschedule: UInt = 0u,
)

public data class ServerInfo1548(
    public var sv1548Errorthreshold: UInt = 0u,
)

public data class ServerInfo1549(
    public var sv1549Networkerrorthreshold: UInt = 0u,
)

public data class ServerInfo1550(
    public var sv1550Diskspacethreshold: UInt = 0u,
)

public data class ServerInfo1552(
    public var sv1552Maxlinkdelay: UInt = 0u,
)

public data class ServerInfo1553(
    public var sv1553Minlinkthroughput: UInt = 0u,
)

public data class ServerInfo1554(
    public var sv1554Linkinfovalidtime: UInt = 0u,
)

public data class ServerInfo1555(
    public var sv1555Scavqosinfoupdatetime: UInt = 0u,
)

public data class ServerInfo1556(
    public var sv1556Maxworkitemidletime: UInt = 0u,
)

public data class ServerInfo1557(
    public var sv1557Maxrawworkitems: UInt = 0u,
)

public data class ServerInfo1560(
    public var sv1560Producttype: UInt = 0u,
)

public data class ServerInfo1561(
    public var sv1561Serversize: UInt = 0u,
)

public data class ServerInfo1562(
    public var sv1562Connectionlessautodisc: UInt = 0u,
)

public data class ServerInfo1563(
    public var sv1563Sharingviolationretries: UInt = 0u,
)

public data class ServerInfo1564(
    public var sv1564Sharingviolationdelay: UInt = 0u,
)

public data class ServerInfo1565(
    public var sv1565Maxglobalopensearch: UInt = 0u,
)

public data class ServerInfo1566(
    public var sv1566Removeduplicatesearches: Bool = 0,
)

public data class ServerInfo1567(
    public var sv1567Lockviolationretries: UInt = 0u,
)

public data class ServerInfo1568(
    public var sv1568Lockviolationoffset: UInt = 0u,
)

public data class ServerInfo1569(
    public var sv1569Lockviolationdelay: UInt = 0u,
)

public data class ServerInfo1570(
    public var sv1570Mdlreadswitchover: UInt = 0u,
)

public data class ServerInfo1571(
    public var sv1571Cachedopenlimit: UInt = 0u,
)

public data class ServerInfo1572(
    public var sv1572Criticalthreads: UInt = 0u,
)

public data class ServerInfo1573(
    public var sv1573Restrictnullsessaccess: UInt = 0u,
)

public data class ServerInfo1574(
    public var sv1574Enablewfw311directipx: UInt = 0u,
)

public data class ServerInfo1575(
    public var sv1575Otherqueueaffinity: UInt = 0u,
)

public data class ServerInfo1576(
    public var sv1576Queuesamplesecs: UInt = 0u,
)

public data class ServerInfo1577(
    public var sv1577Balancecount: UInt = 0u,
)

public data class ServerInfo1578(
    public var sv1578Preferredaffinity: UInt = 0u,
)

public data class ServerInfo1579(
    public var sv1579Maxfreerfcbs: UInt = 0u,
)

public data class ServerInfo1580(
    public var sv1580Maxfreemfcbs: UInt = 0u,
)

public data class ServerInfo1581(
    public var sv1581Maxfreemlcbs: UInt = 0u,
)

public data class ServerInfo1582(
    public var sv1582Maxfreepagedpoolchunks: UInt = 0u,
)

public data class ServerInfo1583(
    public var sv1583Minpagedpoolchunksize: UInt = 0u,
)

public data class ServerInfo1584(
    public var sv1584Maxpagedpoolchunksize: UInt = 0u,
)

public data class ServerInfo1585(
    public var sv1585Sendsfrompreferredprocessor: Bool = 0,
)

public data class ServerInfo1586(
    public var sv1586Maxthreadsperqueue: UInt = 0u,
)

public data class ServerInfo1587(
    public var sv1587Cacheddirectorylimit: UInt = 0u,
)

public data class ServerInfo1588(
    public var sv1588Maxcopylength: UInt = 0u,
)

public data class ServerInfo1590(
    public var sv1590Enablecompression: UInt = 0u,
)

public data class ServerInfo1591(
    public var sv1591Autosharewks: UInt = 0u,
)

public data class ServerInfo1592(
    public var sv1592Autosharewks: UInt = 0u,
)

public data class ServerInfo1593(
    public var sv1593Enablesecuritysignature: UInt = 0u,
)

public data class ServerInfo1594(
    public var sv1594Requiresecuritysignature: UInt = 0u,
)

public data class ServerInfo1595(
    public var sv1595Minclientbuffersize: UInt = 0u,
)

public data class ServerInfo1596(
    public var sv1596ConnectionNoSessionsTimeout: UInt = 0u,
)

public data class ServerInfo1597(
    public var sv1597IdleThreadTimeOut: UInt = 0u,
)

public data class ServerInfo1598(
    public var sv1598EnableW9xsecuritysignature: UInt = 0u,
)

public data class ServerInfo1599(
    public var sv1598Enforcekerberosreauthentication: Boolean = false,
)

public data class ServerInfo1600(
    public var sv1598Disabledos: Boolean = false,
)

public data class ServerInfo1601(
    public var sv1598Lowdiskspaceminimum: UInt = 0u,
)

public data class ServerInfo1602(
    public var sv1598Disablestrictnamechecking: Bool = 0,
)

public class ServerInfo402(
    public var sv402UlistMtime: UInt = 0u,
    public var sv402GlistMtime: UInt = 0u,
    public var sv402AlistMtime: UInt = 0u,
    public var sv402Alerts: Pwstr = null,
    public var sv402Security: ServerInfoSecurity = 0u,
    public var sv402Numadmin: UInt = 0u,
    public var sv402Lanmask: UInt = 0u,
    public var sv402Guestacct: Pwstr = null,
    public var sv402Chdevs: UInt = 0u,
    public var sv402Chdevq: UInt = 0u,
    public var sv402Chdevjobs: UInt = 0u,
    public var sv402Connections: UInt = 0u,
    public var sv402Shares: UInt = 0u,
    public var sv402Openfiles: UInt = 0u,
    public var sv402Sessopens: UInt = 0u,
    public var sv402Sessvcs: UInt = 0u,
    public var sv402Sessreqs: UInt = 0u,
    public var sv402Opensearch: UInt = 0u,
    public var sv402Activelocks: UInt = 0u,
    public var sv402Numreqbuf: UInt = 0u,
    public var sv402Sizreqbuf: UInt = 0u,
    public var sv402Numbigbuf: UInt = 0u,
    public var sv402Numfiletasks: UInt = 0u,
    public var sv402Alertsched: UInt = 0u,
    public var sv402Erroralert: UInt = 0u,
    public var sv402Logonalert: UInt = 0u,
    public var sv402Accessalert: UInt = 0u,
    public var sv402Diskalert: UInt = 0u,
    public var sv402Netioalert: UInt = 0u,
    public var sv402Maxauditsz: UInt = 0u,
    public var sv402Srvheuristics: Pwstr = null,
)

public class ServerInfo403(
    public var sv403UlistMtime: UInt = 0u,
    public var sv403GlistMtime: UInt = 0u,
    public var sv403AlistMtime: UInt = 0u,
    public var sv403Alerts: Pwstr = null,
    public var sv403Security: ServerInfoSecurity = 0u,
    public var sv403Numadmin: UInt = 0u,
    public var sv403Lanmask: UInt = 0u,
    public var sv403Guestacct: Pwstr = null,
    public var sv403Chdevs: UInt = 0u,
    public var sv403Chdevq: UInt = 0u,
    public var sv403Chdevjobs: UInt = 0u,
    public var sv403Connections: UInt = 0u,
    public var sv403Shares: UInt = 0u,
    public var sv403Openfiles: UInt = 0u,
    public var sv403Sessopens: UInt = 0u,
    public var sv403Sessvcs: UInt = 0u,
    public var sv403Sessreqs: UInt = 0u,
    public var sv403Opensearch: UInt = 0u,
    public var sv403Activelocks: UInt = 0u,
    public var sv403Numreqbuf: UInt = 0u,
    public var sv403Sizreqbuf: UInt = 0u,
    public var sv403Numbigbuf: UInt = 0u,
    public var sv403Numfiletasks: UInt = 0u,
    public var sv403Alertsched: UInt = 0u,
    public var sv403Erroralert: UInt = 0u,
    public var sv403Logonalert: UInt = 0u,
    public var sv403Accessalert: UInt = 0u,
    public var sv403Diskalert: UInt = 0u,
    public var sv403Netioalert: UInt = 0u,
    public var sv403Maxauditsz: UInt = 0u,
    public var sv403Srvheuristics: Pwstr = null,
    public var sv403Auditedevents: UInt = 0u,
    public var sv403Autoprofile: UInt = 0u,
    public var sv403Autopath: Pwstr = null,
)

public class ServerInfo502(
    public var sv502Sessopens: UInt = 0u,
    public var sv502Sessvcs: UInt = 0u,
    public var sv502Opensearch: UInt = 0u,
    public var sv502Sizreqbuf: UInt = 0u,
    public var sv502Initworkitems: UInt = 0u,
    public var sv502Maxworkitems: UInt = 0u,
    public var sv502Rawworkitems: UInt = 0u,
    public var sv502Irpstacksize: UInt = 0u,
    public var sv502Maxrawbuflen: UInt = 0u,
    public var sv502Sessusers: UInt = 0u,
    public var sv502Sessconns: UInt = 0u,
    public var sv502Maxpagedmemoryusage: UInt = 0u,
    public var sv502Maxnonpagedmemoryusage: UInt = 0u,
    public var sv502Enablesoftcompat: Bool = 0,
    public var sv502Enableforcedlogoff: Bool = 0,
    public var sv502Timesource: Bool = 0,
    public var sv502Acceptdownlevelapis: Bool = 0,
    public var sv502Lmannounce: Bool = 0,
)

public class ServerInfo503(
    public var sv503Sessopens: UInt = 0u,
    public var sv503Sessvcs: UInt = 0u,
    public var sv503Opensearch: UInt = 0u,
    public var sv503Sizreqbuf: UInt = 0u,
    public var sv503Initworkitems: UInt = 0u,
    public var sv503Maxworkitems: UInt = 0u,
    public var sv503Rawworkitems: UInt = 0u,
    public var sv503Irpstacksize: UInt = 0u,
    public var sv503Maxrawbuflen: UInt = 0u,
    public var sv503Sessusers: UInt = 0u,
    public var sv503Sessconns: UInt = 0u,
    public var sv503Maxpagedmemoryusage: UInt = 0u,
    public var sv503Maxnonpagedmemoryusage: UInt = 0u,
    public var sv503Enablesoftcompat: Bool = 0,
    public var sv503Enableforcedlogoff: Bool = 0,
    public var sv503Timesource: Bool = 0,
    public var sv503Acceptdownlevelapis: Bool = 0,
    public var sv503Lmannounce: Bool = 0,
    public var sv503Domain: Pwstr = null,
    public var sv503Maxcopyreadlen: UInt = 0u,
    public var sv503Maxcopywritelen: UInt = 0u,
    public var sv503Minkeepsearch: UInt = 0u,
    public var sv503Maxkeepsearch: UInt = 0u,
    public var sv503Minkeepcomplsearch: UInt = 0u,
    public var sv503Maxkeepcomplsearch: UInt = 0u,
    public var sv503Threadcountadd: UInt = 0u,
    public var sv503Numblockthreads: UInt = 0u,
    public var sv503Scavtimeout: UInt = 0u,
    public var sv503Minrcvqueue: UInt = 0u,
    public var sv503Minfreeworkitems: UInt = 0u,
    public var sv503Xactmemsize: UInt = 0u,
    public var sv503Threadpriority: UInt = 0u,
    public var sv503Maxmpxct: UInt = 0u,
    public var sv503Oplockbreakwait: UInt = 0u,
    public var sv503Oplockbreakresponsewait: UInt = 0u,
    public var sv503Enableoplocks: Bool = 0,
    public var sv503Enableoplockforceclose: Bool = 0,
    public var sv503Enablefcbopens: Bool = 0,
    public var sv503Enableraw: Bool = 0,
    public var sv503Enablesharednetdrives: Bool = 0,
    public var sv503Minfreeconnections: UInt = 0u,
    public var sv503Maxfreeconnections: UInt = 0u,
)

public class ServerInfo598(
    public var sv598Maxrawworkitems: UInt = 0u,
    public var sv598Maxthreadsperqueue: UInt = 0u,
    public var sv598Producttype: UInt = 0u,
    public var sv598Serversize: UInt = 0u,
    public var sv598Connectionlessautodisc: UInt = 0u,
    public var sv598Sharingviolationretries: UInt = 0u,
    public var sv598Sharingviolationdelay: UInt = 0u,
    public var sv598Maxglobalopensearch: UInt = 0u,
    public var sv598Removeduplicatesearches: UInt = 0u,
    public var sv598Lockviolationoffset: UInt = 0u,
    public var sv598Lockviolationdelay: UInt = 0u,
    public var sv598Mdlreadswitchover: UInt = 0u,
    public var sv598Cachedopenlimit: UInt = 0u,
    public var sv598Otherqueueaffinity: UInt = 0u,
    public var sv598Restrictnullsessaccess: Bool = 0,
    public var sv598Enablewfw311directipx: Bool = 0,
    public var sv598Queuesamplesecs: UInt = 0u,
    public var sv598Balancecount: UInt = 0u,
    public var sv598Preferredaffinity: UInt = 0u,
    public var sv598Maxfreerfcbs: UInt = 0u,
    public var sv598Maxfreemfcbs: UInt = 0u,
    public var sv598Maxfreelfcbs: UInt = 0u,
    public var sv598Maxfreepagedpoolchunks: UInt = 0u,
    public var sv598Minpagedpoolchunksize: UInt = 0u,
    public var sv598Maxpagedpoolchunksize: UInt = 0u,
    public var sv598Sendsfrompreferredprocessor: Bool = 0,
    public var sv598Cacheddirectorylimit: UInt = 0u,
    public var sv598Maxcopylength: UInt = 0u,
    public var sv598Enablecompression: Bool = 0,
    public var sv598Autosharewks: Bool = 0,
    public var sv598Autoshareserver: Bool = 0,
    public var sv598Enablesecuritysignature: Bool = 0,
    public var sv598Requiresecuritysignature: Bool = 0,
    public var sv598Minclientbuffersize: UInt = 0u,
    public var sv598Serverguid: Guid = Guid(),
    public var sv598ConnectionNoSessionsTimeout: UInt = 0u,
    public var sv598IdleThreadTimeOut: UInt = 0u,
    public var sv598EnableW9xsecuritysignature: Bool = 0,
    public var sv598Enforcekerberosreauthentication: Bool = 0,
    public var sv598Disabledos: Bool = 0,
    public var sv598Lowdiskspaceminimum: UInt = 0u,
    public var sv598Disablestrictnamechecking: Bool = 0,
    public var sv598Enableauthenticateusersharing: Bool = 0,
)

public class ServerInfo599(
    public var sv599Sessopens: UInt = 0u,
    public var sv599Sessvcs: UInt = 0u,
    public var sv599Opensearch: UInt = 0u,
    public var sv599Sizreqbuf: UInt = 0u,
    public var sv599Initworkitems: UInt = 0u,
    public var sv599Maxworkitems: UInt = 0u,
    public var sv599Rawworkitems: UInt = 0u,
    public var sv599Irpstacksize: UInt = 0u,
    public var sv599Maxrawbuflen: UInt = 0u,
    public var sv599Sessusers: UInt = 0u,
    public var sv599Sessconns: UInt = 0u,
    public var sv599Maxpagedmemoryusage: UInt = 0u,
    public var sv599Maxnonpagedmemoryusage: UInt = 0u,
    public var sv599Enablesoftcompat: Bool = 0,
    public var sv599Enableforcedlogoff: Bool = 0,
    public var sv599Timesource: Bool = 0,
    public var sv599Acceptdownlevelapis: Bool = 0,
    public var sv599Lmannounce: Bool = 0,
    public var sv599Domain: Pwstr = null,
    public var sv599Maxcopyreadlen: UInt = 0u,
    public var sv599Maxcopywritelen: UInt = 0u,
    public var sv599Minkeepsearch: UInt = 0u,
    public var sv599Maxkeepsearch: UInt = 0u,
    public var sv599Minkeepcomplsearch: UInt = 0u,
    public var sv599Maxkeepcomplsearch: UInt = 0u,
    public var sv599Threadcountadd: UInt = 0u,
    public var sv599Numblockthreads: UInt = 0u,
    public var sv599Scavtimeout: UInt = 0u,
    public var sv599Minrcvqueue: UInt = 0u,
    public var sv599Minfreeworkitems: UInt = 0u,
    public var sv599Xactmemsize: UInt = 0u,
    public var sv599Threadpriority: UInt = 0u,
    public var sv599Maxmpxct: UInt = 0u,
    public var sv599Oplockbreakwait: UInt = 0u,
    public var sv599Oplockbreakresponsewait: UInt = 0u,
    public var sv599Enableoplocks: Bool = 0,
    public var sv599Enableoplockforceclose: Bool = 0,
    public var sv599Enablefcbopens: Bool = 0,
    public var sv599Enableraw: Bool = 0,
    public var sv599Enablesharednetdrives: Bool = 0,
    public var sv599Minfreeconnections: UInt = 0u,
    public var sv599Maxfreeconnections: UInt = 0u,
    public var sv599Initsesstable: UInt = 0u,
    public var sv599Initconntable: UInt = 0u,
    public var sv599Initfiletable: UInt = 0u,
    public var sv599Initsearchtable: UInt = 0u,
    public var sv599Alertschedule: UInt = 0u,
    public var sv599Errorthreshold: UInt = 0u,
    public var sv599Networkerrorthreshold: UInt = 0u,
    public var sv599Diskspacethreshold: UInt = 0u,
    public var sv599Reserved: UInt = 0u,
    public var sv599Maxlinkdelay: UInt = 0u,
    public var sv599Minlinkthroughput: UInt = 0u,
    public var sv599Linkinfovalidtime: UInt = 0u,
    public var sv599Scavqosinfoupdatetime: UInt = 0u,
    public var sv599Maxworkitemidletime: UInt = 0u,
)

public data class ServerTransportInfo0(
    public var svti0Numberofvcs: UInt = 0u,
    public var svti0Transportname: Pwstr = null,
    public var svti0Transportaddress: COpaquePointer? = null,
    public var svti0Transportaddresslength: UInt = 0u,
    public var svti0Networkaddress: Pwstr = null,
)

public data class ServerTransportInfo1(
    public var svti1Numberofvcs: UInt = 0u,
    public var svti1Transportname: Pwstr = null,
    public var svti1Transportaddress: COpaquePointer? = null,
    public var svti1Transportaddresslength: UInt = 0u,
    public var svti1Networkaddress: Pwstr = null,
    public var svti1Domain: Pwstr = null,
)

public data class ServerTransportInfo2(
    public var svti2Numberofvcs: UInt = 0u,
    public var svti2Transportname: Pwstr = null,
    public var svti2Transportaddress: COpaquePointer? = null,
    public var svti2Transportaddresslength: UInt = 0u,
    public var svti2Networkaddress: Pwstr = null,
    public var svti2Domain: Pwstr = null,
    public var svti2Flags: UInt = 0u,
)

public data class ServerTransportInfo3(
    public var svti3Numberofvcs: UInt = 0u,
    public var svti3Transportname: Pwstr = null,
    public var svti3Transportaddress: COpaquePointer? = null,
    public var svti3Transportaddresslength: UInt = 0u,
    public var svti3Networkaddress: Pwstr = null,
    public var svti3Domain: Pwstr = null,
    public var svti3Flags: UInt = 0u,
    public var svti3Passwordlength: UInt = 0u,
    public var svti3Password: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServerTransportInfo3) return false
        if (this.svti3Numberofvcs != other.svti3Numberofvcs) return false
        if (this.svti3Transportname != other.svti3Transportname) return false
        if (this.svti3Transportaddress != other.svti3Transportaddress) return false
        if (this.svti3Transportaddresslength != other.svti3Transportaddresslength) return false
        if (this.svti3Networkaddress != other.svti3Networkaddress) return false
        if (this.svti3Domain != other.svti3Domain) return false
        if (this.svti3Flags != other.svti3Flags) return false
        if (this.svti3Passwordlength != other.svti3Passwordlength) return false
        if (!this.svti3Password.contentEquals(other.svti3Password)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.svti3Numberofvcs.hashCode()
        result = 31 * result + this.svti3Transportname.hashCode()
        result = 31 * result + this.svti3Transportaddress.hashCode()
        result = 31 * result + this.svti3Transportaddresslength.hashCode()
        result = 31 * result + this.svti3Networkaddress.hashCode()
        result = 31 * result + this.svti3Domain.hashCode()
        result = 31 * result + this.svti3Flags.hashCode()
        result = 31 * result + this.svti3Passwordlength.hashCode()
        result = 31 * result + this.svti3Password.contentHashCode()
        return result
    }
}

public data class ServiceInfo0(
    public var svci0Name: Pwstr = null,
)

public data class ServiceInfo1(
    public var svci1Name: Pwstr = null,
    public var svci1Status: UInt = 0u,
    public var svci1Code: UInt = 0u,
    public var svci1Pid: UInt = 0u,
)

public data class ServiceInfo2(
    public var svci2Name: Pwstr = null,
    public var svci2Status: UInt = 0u,
    public var svci2Code: UInt = 0u,
    public var svci2Pid: UInt = 0u,
    public var svci2Text: Pwstr = null,
    public var svci2SpecificError: UInt = 0u,
    public var svci2DisplayName: Pwstr = null,
)

public data class SmbCompressionInfo(
    public var switch: Boolean = false,
    public var reserved1: UByte = 0u,
    public var reserved2: UShort = 0u,
    public var reserved3: UInt = 0u,
)

public data class SmbTreeConnectParameters(
    public var eABufferOffset: UInt = 0u,
    public var eABufferLen: UInt = 0u,
    public var createOptions: UInt = 0u,
    public var treeConnectAttributes: UInt = 0u,
)

public data class SmbUseOptionCompressionParameters(
    public var tag: UInt = 0u,
    public var length: UShort = 0u,
    public var reserved: UShort = 0u,
)

public data class StdAlert(
    public var alrtTimestamp: UInt = 0u,
    public var alrtEventname: UShortArray = UShortArray(17),
    public var alrtServicename: UShortArray = UShortArray(81),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StdAlert) return false
        if (this.alrtTimestamp != other.alrtTimestamp) return false
        if (!this.alrtEventname.contentEquals(other.alrtEventname)) return false
        if (!this.alrtServicename.contentEquals(other.alrtServicename)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.alrtTimestamp.hashCode()
        result = 31 * result + this.alrtEventname.contentHashCode()
        result = 31 * result + this.alrtServicename.contentHashCode()
        return result
    }
}

public data class TimeOfDayInfo(
    public var todElapsedt: UInt = 0u,
    public var todMsecs: UInt = 0u,
    public var todHours: UInt = 0u,
    public var todMins: UInt = 0u,
    public var todSecs: UInt = 0u,
    public var todHunds: UInt = 0u,
    public var todTimezone: Int = 0,
    public var todTinterval: UInt = 0u,
    public var todDay: UInt = 0u,
    public var todMonth: UInt = 0u,
    public var todYear: UInt = 0u,
    public var todWeekday: UInt = 0u,
)

public data class TransportInfo(
    public var type: TransportType = 0,
    public var skipCertificateCheck: Boolean = false,
)

public data class UserInfo0(
    public var usri0Name: Pwstr = null,
)

public data class UserInfo1(
    public var usri1Name: Pwstr = null,
    public var usri1Password: Pwstr = null,
    public var usri1PasswordAge: UInt = 0u,
    public var usri1Priv: UserPriv = 0u,
    public var usri1HomeDir: Pwstr = null,
    public var usri1Comment: Pwstr = null,
    public var usri1Flags: UserAccountFlags = 0u,
    public var usri1ScriptPath: Pwstr = null,
)

public data class UserInfo10(
    public var usri10Name: Pwstr = null,
    public var usri10Comment: Pwstr = null,
    public var usri10UsrComment: Pwstr = null,
    public var usri10FullName: Pwstr = null,
)

public data class UserInfo1003(
    public var usri1003Password: Pwstr = null,
)

public data class UserInfo1005(
    public var usri1005Priv: UserPriv = 0u,
)

public data class UserInfo1006(
    public var usri1006HomeDir: Pwstr = null,
)

public data class UserInfo1007(
    public var usri1007Comment: Pwstr = null,
)

public data class UserInfo1008(
    public var usri1008Flags: UserAccountFlags = 0u,
)

public data class UserInfo1009(
    public var usri1009ScriptPath: Pwstr = null,
)

public data class UserInfo1010(
    public var usri1010AuthFlags: AfOp = 0u,
)

public data class UserInfo1011(
    public var usri1011FullName: Pwstr = null,
)

public data class UserInfo1012(
    public var usri1012UsrComment: Pwstr = null,
)

public data class UserInfo1013(
    public var usri1013Parms: Pwstr = null,
)

public data class UserInfo1014(
    public var usri1014Workstations: Pwstr = null,
)

public data class UserInfo1017(
    public var usri1017AcctExpires: UInt = 0u,
)

public data class UserInfo1018(
    public var usri1018MaxStorage: UInt = 0u,
)

public data class UserInfo1020(
    public var usri1020UnitsPerWeek: UInt = 0u,
    public var usri1020LogonHours: COpaquePointer? = null,
)

public data class UserInfo1023(
    public var usri1023LogonServer: Pwstr = null,
)

public data class UserInfo1024(
    public var usri1024CountryCode: UInt = 0u,
)

public data class UserInfo1025(
    public var usri1025CodePage: UInt = 0u,
)

public data class UserInfo1051(
    public var usri1051PrimaryGroupId: UInt = 0u,
)

public data class UserInfo1052(
    public var usri1052Profile: Pwstr = null,
)

public data class UserInfo1053(
    public var usri1053HomeDirDrive: Pwstr = null,
)

public class UserInfo11(
    public var usri11Name: Pwstr = null,
    public var usri11Comment: Pwstr = null,
    public var usri11UsrComment: Pwstr = null,
    public var usri11FullName: Pwstr = null,
    public var usri11Priv: UserPriv = 0u,
    public var usri11AuthFlags: AfOp = 0u,
    public var usri11PasswordAge: UInt = 0u,
    public var usri11HomeDir: Pwstr = null,
    public var usri11Parms: Pwstr = null,
    public var usri11LastLogon: UInt = 0u,
    public var usri11LastLogoff: UInt = 0u,
    public var usri11BadPwCount: UInt = 0u,
    public var usri11NumLogons: UInt = 0u,
    public var usri11LogonServer: Pwstr = null,
    public var usri11CountryCode: UInt = 0u,
    public var usri11Workstations: Pwstr = null,
    public var usri11MaxStorage: UInt = 0u,
    public var usri11UnitsPerWeek: UInt = 0u,
    public var usri11LogonHours: COpaquePointer? = null,
    public var usri11CodePage: UInt = 0u,
)

public class UserInfo2(
    public var usri2Name: Pwstr = null,
    public var usri2Password: Pwstr = null,
    public var usri2PasswordAge: UInt = 0u,
    public var usri2Priv: UserPriv = 0u,
    public var usri2HomeDir: Pwstr = null,
    public var usri2Comment: Pwstr = null,
    public var usri2Flags: UserAccountFlags = 0u,
    public var usri2ScriptPath: Pwstr = null,
    public var usri2AuthFlags: AfOp = 0u,
    public var usri2FullName: Pwstr = null,
    public var usri2UsrComment: Pwstr = null,
    public var usri2Parms: Pwstr = null,
    public var usri2Workstations: Pwstr = null,
    public var usri2LastLogon: UInt = 0u,
    public var usri2LastLogoff: UInt = 0u,
    public var usri2AcctExpires: UInt = 0u,
    public var usri2MaxStorage: UInt = 0u,
    public var usri2UnitsPerWeek: UInt = 0u,
    public var usri2LogonHours: COpaquePointer? = null,
    public var usri2BadPwCount: UInt = 0u,
    public var usri2NumLogons: UInt = 0u,
    public var usri2LogonServer: Pwstr = null,
    public var usri2CountryCode: UInt = 0u,
    public var usri2CodePage: UInt = 0u,
)

public data class UserInfo20(
    public var usri20Name: Pwstr = null,
    public var usri20FullName: Pwstr = null,
    public var usri20Comment: Pwstr = null,
    public var usri20Flags: UserAccountFlags = 0u,
    public var usri20UserId: UInt = 0u,
)

public data class UserInfo21(
    public var usri21Password: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserInfo21) return false
        if (!this.usri21Password.contentEquals(other.usri21Password)) return false
        return true
    }

    override fun hashCode(): Int = this.usri21Password.contentHashCode()
}

public class UserInfo22(
    public var usri22Name: Pwstr = null,
    public var usri22Password: UByteArray = UByteArray(16),
    public var usri22PasswordAge: UInt = 0u,
    public var usri22Priv: UserPriv = 0u,
    public var usri22HomeDir: Pwstr = null,
    public var usri22Comment: Pwstr = null,
    public var usri22Flags: UserAccountFlags = 0u,
    public var usri22ScriptPath: Pwstr = null,
    public var usri22AuthFlags: AfOp = 0u,
    public var usri22FullName: Pwstr = null,
    public var usri22UsrComment: Pwstr = null,
    public var usri22Parms: Pwstr = null,
    public var usri22Workstations: Pwstr = null,
    public var usri22LastLogon: UInt = 0u,
    public var usri22LastLogoff: UInt = 0u,
    public var usri22AcctExpires: UInt = 0u,
    public var usri22MaxStorage: UInt = 0u,
    public var usri22UnitsPerWeek: UInt = 0u,
    public var usri22LogonHours: COpaquePointer? = null,
    public var usri22BadPwCount: UInt = 0u,
    public var usri22NumLogons: UInt = 0u,
    public var usri22LogonServer: Pwstr = null,
    public var usri22CountryCode: UInt = 0u,
    public var usri22CodePage: UInt = 0u,
)

public data class UserInfo23(
    public var usri23Name: Pwstr = null,
    public var usri23FullName: Pwstr = null,
    public var usri23Comment: Pwstr = null,
    public var usri23Flags: UserAccountFlags = 0u,
    public var usri23UserSid: Psid = null,
)

public data class UserInfo24(
    public var usri24InternetIdentity: Bool = 0,
    public var usri24Flags: UInt = 0u,
    public var usri24InternetProviderName: Pwstr = null,
    public var usri24InternetPrincipalName: Pwstr = null,
    public var usri24UserSid: Psid = null,
)

public class UserInfo3(
    public var usri3Name: Pwstr = null,
    public var usri3Password: Pwstr = null,
    public var usri3PasswordAge: UInt = 0u,
    public var usri3Priv: UserPriv = 0u,
    public var usri3HomeDir: Pwstr = null,
    public var usri3Comment: Pwstr = null,
    public var usri3Flags: UserAccountFlags = 0u,
    public var usri3ScriptPath: Pwstr = null,
    public var usri3AuthFlags: AfOp = 0u,
    public var usri3FullName: Pwstr = null,
    public var usri3UsrComment: Pwstr = null,
    public var usri3Parms: Pwstr = null,
    public var usri3Workstations: Pwstr = null,
    public var usri3LastLogon: UInt = 0u,
    public var usri3LastLogoff: UInt = 0u,
    public var usri3AcctExpires: UInt = 0u,
    public var usri3MaxStorage: UInt = 0u,
    public var usri3UnitsPerWeek: UInt = 0u,
    public var usri3LogonHours: COpaquePointer? = null,
    public var usri3BadPwCount: UInt = 0u,
    public var usri3NumLogons: UInt = 0u,
    public var usri3LogonServer: Pwstr = null,
    public var usri3CountryCode: UInt = 0u,
    public var usri3CodePage: UInt = 0u,
    public var usri3UserId: UInt = 0u,
    public var usri3PrimaryGroupId: UInt = 0u,
    public var usri3Profile: Pwstr = null,
    public var usri3HomeDirDrive: Pwstr = null,
    public var usri3PasswordExpired: UInt = 0u,
)

public class UserInfo4(
    public var usri4Name: Pwstr = null,
    public var usri4Password: Pwstr = null,
    public var usri4PasswordAge: UInt = 0u,
    public var usri4Priv: UserPriv = 0u,
    public var usri4HomeDir: Pwstr = null,
    public var usri4Comment: Pwstr = null,
    public var usri4Flags: UserAccountFlags = 0u,
    public var usri4ScriptPath: Pwstr = null,
    public var usri4AuthFlags: AfOp = 0u,
    public var usri4FullName: Pwstr = null,
    public var usri4UsrComment: Pwstr = null,
    public var usri4Parms: Pwstr = null,
    public var usri4Workstations: Pwstr = null,
    public var usri4LastLogon: UInt = 0u,
    public var usri4LastLogoff: UInt = 0u,
    public var usri4AcctExpires: UInt = 0u,
    public var usri4MaxStorage: UInt = 0u,
    public var usri4UnitsPerWeek: UInt = 0u,
    public var usri4LogonHours: COpaquePointer? = null,
    public var usri4BadPwCount: UInt = 0u,
    public var usri4NumLogons: UInt = 0u,
    public var usri4LogonServer: Pwstr = null,
    public var usri4CountryCode: UInt = 0u,
    public var usri4CodePage: UInt = 0u,
    public var usri4UserSid: Psid = null,
    public var usri4PrimaryGroupId: UInt = 0u,
    public var usri4Profile: Pwstr = null,
    public var usri4HomeDirDrive: Pwstr = null,
    public var usri4PasswordExpired: UInt = 0u,
)

public data class UserModalsInfo0(
    public var usrmod0MinPasswdLen: UInt = 0u,
    public var usrmod0MaxPasswdAge: UInt = 0u,
    public var usrmod0MinPasswdAge: UInt = 0u,
    public var usrmod0ForceLogoff: UInt = 0u,
    public var usrmod0PasswordHistLen: UInt = 0u,
)

public data class UserModalsInfo1(
    public var usrmod1Role: UInt = 0u,
    public var usrmod1Primary: Pwstr = null,
)

public data class UserModalsInfo1001(
    public var usrmod1001MinPasswdLen: UInt = 0u,
)

public data class UserModalsInfo1002(
    public var usrmod1002MaxPasswdAge: UInt = 0u,
)

public data class UserModalsInfo1003(
    public var usrmod1003MinPasswdAge: UInt = 0u,
)

public data class UserModalsInfo1004(
    public var usrmod1004ForceLogoff: UInt = 0u,
)

public data class UserModalsInfo1005(
    public var usrmod1005PasswordHistLen: UInt = 0u,
)

public data class UserModalsInfo1006(
    public var usrmod1006Role: UserModalsRoles = 0u,
)

public data class UserModalsInfo1007(
    public var usrmod1007Primary: Pwstr = null,
)

public data class UserModalsInfo2(
    public var usrmod2DomainName: Pwstr = null,
    public var usrmod2DomainId: Psid = null,
)

public data class UserModalsInfo3(
    public var usrmod3LockoutDuration: UInt = 0u,
    public var usrmod3LockoutObservationWindow: UInt = 0u,
    public var usrmod3LockoutThreshold: UInt = 0u,
)

public data class UserOtherInfo(
    public var alrtusErrcode: UInt = 0u,
    public var alrtusNumstrings: UInt = 0u,
)

public data class UseInfo0(
    public var ui0Local: Pwstr = null,
    public var ui0Remote: Pwstr = null,
)

public data class UseInfo1(
    public var ui1Local: Pwstr = null,
    public var ui1Remote: Pwstr = null,
    public var ui1Password: Pwstr = null,
    public var ui1Status: UInt = 0u,
    public var ui1AsgType: UseInfoAsgType = 0u,
    public var ui1Refcount: UInt = 0u,
    public var ui1Usecount: UInt = 0u,
)

public data class UseInfo2(
    public var ui2Local: Pwstr = null,
    public var ui2Remote: Pwstr = null,
    public var ui2Password: Pwstr = null,
    public var ui2Status: UInt = 0u,
    public var ui2AsgType: UseInfoAsgType = 0u,
    public var ui2Refcount: UInt = 0u,
    public var ui2Usecount: UInt = 0u,
    public var ui2Username: Pwstr = null,
    public var ui2Domainname: Pwstr = null,
)
