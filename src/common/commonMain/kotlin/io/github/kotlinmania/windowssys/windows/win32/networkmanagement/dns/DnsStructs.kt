@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public data class DNS_AAAA_DATA(public var Ip6Address: IP6_ADDRESS = IP6_ADDRESS())

public data class DNS_ADDR(public var MaxSa: ByteArray = ByteArray(32), public var Data: DNS_ADDR_0 = DNS_ADDR_0()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_ADDR) return false
        if (!this.MaxSa.contentEquals(other.MaxSa)) return false
        if (this.Data != other.Data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MaxSa.contentHashCode()
        result = 31 * result + this.Data.hashCode()
        return result
    }
}

public data class DNS_ADDR_0(public var DnsAddrUserDword: UIntArray = UIntArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_ADDR_0) return false
        if (!this.DnsAddrUserDword.contentEquals(other.DnsAddrUserDword)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.DnsAddrUserDword.contentHashCode()
    }
}

public data class DNS_ADDR_ARRAY(
    public var MaxCount: UInt = 0u,
    public var AddrCount: UInt = 0u,
    public var Tag: UInt = 0u,
    public var Family: UShort = 0u,
    public var WordReserved: UShort = 0u,
    public var Flags: UInt = 0u,
    public var MatchFlag: UInt = 0u,
    public var Reserved1: UInt = 0u,
    public var Reserved2: UInt = 0u,
    public var AddrArray: List<DNS_ADDR> = List(1) { DNS_ADDR() },
)

public data class DNS_APPLICATION_SETTINGS(public var Version: UInt = 0u, public var Flags: ULong = 0uL)

public data class DNS_ATMA_DATA(public var AddressType: UByte = 0u, public var Address: UByteArray = UByteArray(20)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_ATMA_DATA) return false
        if (this.AddressType != other.AddressType) return false
        if (!this.Address.contentEquals(other.Address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AddressType.hashCode()
        result = 31 * result + this.Address.contentHashCode()
        return result
    }
}

public data class DNS_A_DATA(public var IpAddress: UInt = 0u)

public data class DNS_CONNECTION_IFINDEX_ENTRY(public var pwszConnectionName: PCWSTR = 0L, public var dwIfIndex: UInt = 0u)

public data class DNS_CONNECTION_IFINDEX_LIST(public var pConnectionIfIndexEntries: Long = 0L, public var nEntries: UInt = 0u)

public data class DNS_CONNECTION_NAME(public var wszName: UShortArray = UShortArray(65)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_CONNECTION_NAME) return false
        if (!this.wszName.contentEquals(other.wszName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.wszName.contentHashCode()
    }
}

public data class DNS_CONNECTION_NAME_LIST(public var cNames: UInt = 0u, public var pNames: Long = 0L)

public data class DNS_CONNECTION_POLICY_ENTRY(
    public var pwszHost: PCWSTR = 0L,
    public var pwszAppId: PCWSTR = 0L,
    public var cbAppSid: UInt = 0u,
    public var pbAppSid: Long = 0L,
    public var nConnections: UInt = 0u,
    public var ppwszConnections: Long = 0L,
    public var dwPolicyEntryFlags: UInt = 0u,
)

public data class DNS_CONNECTION_POLICY_ENTRY_LIST(public var pPolicyEntries: Long = 0L, public var nEntries: UInt = 0u)

public data class DNS_CONNECTION_PROXY_ELEMENT(public var Type: DNS_CONNECTION_PROXY_TYPE = 0, public var Info: DNS_CONNECTION_PROXY_INFO = DNS_CONNECTION_PROXY_INFO())

public data class DNS_CONNECTION_PROXY_INFO(
    public var Version: UInt = 0u,
    public var pwszFriendlyName: PWSTR = 0L,
    public var Flags: UInt = 0u,
    public var Switch: DNS_CONNECTION_PROXY_INFO_SWITCH = 0,
    public var Anonymous: DNS_CONNECTION_PROXY_INFO_0 = DNS_CONNECTION_PROXY_INFO_0(),
)

public data class DNS_CONNECTION_PROXY_INFO_0(public var Config: DNS_CONNECTION_PROXY_INFO_0_0 = DNS_CONNECTION_PROXY_INFO_0_0(), public var Script: DNS_CONNECTION_PROXY_INFO_0_1 = DNS_CONNECTION_PROXY_INFO_0_1())

public data class DNS_CONNECTION_PROXY_INFO_0_0(
    public var pwszServer: PWSTR = 0L,
    public var pwszUsername: PWSTR = 0L,
    public var pwszPassword: PWSTR = 0L,
    public var pwszException: PWSTR = 0L,
    public var pwszExtraInfo: PWSTR = 0L,
    public var Port: UShort = 0u,
)

public data class DNS_CONNECTION_PROXY_INFO_0_1(
    public var pwszScript: PWSTR = 0L,
    public var pwszUsername: PWSTR = 0L,
    public var pwszPassword: PWSTR = 0L,
)

public data class DNS_CONNECTION_PROXY_INFO_EX(
    public var ProxyInfo: DNS_CONNECTION_PROXY_INFO = DNS_CONNECTION_PROXY_INFO(),
    public var dwInterfaceIndex: UInt = 0u,
    public var pwszConnectionName: PWSTR = 0L,
    public var fDirectConfiguration: BOOL = 0,
    public var hConnection: HANDLE = 0L,
)

public data class DNS_CONNECTION_PROXY_LIST(public var cProxies: UInt = 0u, public var pProxies: Long = 0L)

public data class DNS_CUSTOM_SERVER(
    public var dwServerType: UInt = 0u,
    public var ullFlags: ULong = 0uL,
    public var Anonymous1: DNS_CUSTOM_SERVER_0 = DNS_CUSTOM_SERVER_0(),
    public var Anonymous2: DNS_CUSTOM_SERVER_1 = DNS_CUSTOM_SERVER_1(),
)

public data class DNS_CUSTOM_SERVER_0(public var pwszTemplate: PWSTR = 0L)

public data class DNS_CUSTOM_SERVER_1(public var MaxSa: ByteArray = ByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_CUSTOM_SERVER_1) return false
        if (!this.MaxSa.contentEquals(other.MaxSa)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.MaxSa.contentHashCode()
    }
}

public data class DNS_DHCID_DATA(public var dwByteCount: UInt = 0u, public var DHCID: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_DHCID_DATA) return false
        if (this.dwByteCount != other.dwByteCount) return false
        if (!this.DHCID.contentEquals(other.DHCID)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwByteCount.hashCode()
        result = 31 * result + this.DHCID.contentHashCode()
        return result
    }
}

public data class DNS_DS_DATA(
    public var wKeyTag: UShort = 0u,
    public var chAlgorithm: UByte = 0u,
    public var chDigestType: UByte = 0u,
    public var wDigestLength: UShort = 0u,
    public var wPad: UShort = 0u,
    public var Digest: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_DS_DATA) return false
        if (this.wKeyTag != other.wKeyTag) return false
        if (this.chAlgorithm != other.chAlgorithm) return false
        if (this.chDigestType != other.chDigestType) return false
        if (this.wDigestLength != other.wDigestLength) return false
        if (this.wPad != other.wPad) return false
        if (!this.Digest.contentEquals(other.Digest)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wKeyTag.hashCode()
        result = 31 * result + this.chAlgorithm.hashCode()
        result = 31 * result + this.chDigestType.hashCode()
        result = 31 * result + this.wDigestLength.hashCode()
        result = 31 * result + this.wPad.hashCode()
        result = 31 * result + this.Digest.contentHashCode()
        return result
    }
}

public data class DNS_HEADER(
    public var Xid: UShort = 0u,
    public var _bitfield1: UByte = 0u,
    public var _bitfield2: UByte = 0u,
    public var QuestionCount: UShort = 0u,
    public var AnswerCount: UShort = 0u,
    public var NameServerCount: UShort = 0u,
    public var AdditionalCount: UShort = 0u,
)

public data class DNS_HEADER_EXT(
    public var _bitfield: UShort = 0u,
    public var chRcode: UByte = 0u,
    public var chVersion: UByte = 0u,
)

public data class DNS_KEY_DATA(
    public var wFlags: UShort = 0u,
    public var chProtocol: UByte = 0u,
    public var chAlgorithm: UByte = 0u,
    public var wKeyLength: UShort = 0u,
    public var wPad: UShort = 0u,
    public var Key: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_KEY_DATA) return false
        if (this.wFlags != other.wFlags) return false
        if (this.chProtocol != other.chProtocol) return false
        if (this.chAlgorithm != other.chAlgorithm) return false
        if (this.wKeyLength != other.wKeyLength) return false
        if (this.wPad != other.wPad) return false
        if (!this.Key.contentEquals(other.Key)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wFlags.hashCode()
        result = 31 * result + this.chProtocol.hashCode()
        result = 31 * result + this.chAlgorithm.hashCode()
        result = 31 * result + this.wKeyLength.hashCode()
        result = 31 * result + this.wPad.hashCode()
        result = 31 * result + this.Key.contentHashCode()
        return result
    }
}

public data class DNS_LOC_DATA(
    public var wVersion: UShort = 0u,
    public var wSize: UShort = 0u,
    public var wHorPrec: UShort = 0u,
    public var wVerPrec: UShort = 0u,
    public var dwLatitude: UInt = 0u,
    public var dwLongitude: UInt = 0u,
    public var dwAltitude: UInt = 0u,
)

public data class DNS_MESSAGE_BUFFER(public var MessageHead: DNS_HEADER = DNS_HEADER(), public var MessageBody: ByteArray = ByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_MESSAGE_BUFFER) return false
        if (this.MessageHead != other.MessageHead) return false
        if (!this.MessageBody.contentEquals(other.MessageBody)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.MessageHead.hashCode()
        result = 31 * result + this.MessageBody.contentHashCode()
        return result
    }
}

public data class DNS_MINFO_DATAA(public var pNameMailbox: PSTR = 0L, public var pNameErrorsMailbox: PSTR = 0L)

public data class DNS_MINFO_DATAW(public var pNameMailbox: PWSTR = 0L, public var pNameErrorsMailbox: PWSTR = 0L)

public data class DNS_MX_DATAA(
    public var pNameExchange: PSTR = 0L,
    public var wPreference: UShort = 0u,
    public var Pad: UShort = 0u,
)

public data class DNS_MX_DATAW(
    public var pNameExchange: PWSTR = 0L,
    public var wPreference: UShort = 0u,
    public var Pad: UShort = 0u,
)

public data class DNS_NAPTR_DATAA(
    public var wOrder: UShort = 0u,
    public var wPreference: UShort = 0u,
    public var pFlags: PSTR = 0L,
    public var pService: PSTR = 0L,
    public var pRegularExpression: PSTR = 0L,
    public var pReplacement: PSTR = 0L,
)

public data class DNS_NAPTR_DATAW(
    public var wOrder: UShort = 0u,
    public var wPreference: UShort = 0u,
    public var pFlags: PWSTR = 0L,
    public var pService: PWSTR = 0L,
    public var pRegularExpression: PWSTR = 0L,
    public var pReplacement: PWSTR = 0L,
)

public data class DNS_NSEC3PARAM_DATA(
    public var chAlgorithm: UByte = 0u,
    public var bFlags: UByte = 0u,
    public var wIterations: UShort = 0u,
    public var bSaltLength: UByte = 0u,
    public var bPad: UByteArray = UByteArray(3),
    public var pbSalt: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_NSEC3PARAM_DATA) return false
        if (this.chAlgorithm != other.chAlgorithm) return false
        if (this.bFlags != other.bFlags) return false
        if (this.wIterations != other.wIterations) return false
        if (this.bSaltLength != other.bSaltLength) return false
        if (!this.bPad.contentEquals(other.bPad)) return false
        if (!this.pbSalt.contentEquals(other.pbSalt)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.chAlgorithm.hashCode()
        result = 31 * result + this.bFlags.hashCode()
        result = 31 * result + this.wIterations.hashCode()
        result = 31 * result + this.bSaltLength.hashCode()
        result = 31 * result + this.bPad.contentHashCode()
        result = 31 * result + this.pbSalt.contentHashCode()
        return result
    }
}

public data class DNS_NSEC3_DATA(
    public var chAlgorithm: UByte = 0u,
    public var bFlags: UByte = 0u,
    public var wIterations: UShort = 0u,
    public var bSaltLength: UByte = 0u,
    public var bHashLength: UByte = 0u,
    public var wTypeBitMapsLength: UShort = 0u,
    public var chData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_NSEC3_DATA) return false
        if (this.chAlgorithm != other.chAlgorithm) return false
        if (this.bFlags != other.bFlags) return false
        if (this.wIterations != other.wIterations) return false
        if (this.bSaltLength != other.bSaltLength) return false
        if (this.bHashLength != other.bHashLength) return false
        if (this.wTypeBitMapsLength != other.wTypeBitMapsLength) return false
        if (!this.chData.contentEquals(other.chData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.chAlgorithm.hashCode()
        result = 31 * result + this.bFlags.hashCode()
        result = 31 * result + this.wIterations.hashCode()
        result = 31 * result + this.bSaltLength.hashCode()
        result = 31 * result + this.bHashLength.hashCode()
        result = 31 * result + this.wTypeBitMapsLength.hashCode()
        result = 31 * result + this.chData.contentHashCode()
        return result
    }
}

public data class DNS_NSEC_DATAA(
    public var pNextDomainName: PSTR = 0L,
    public var wTypeBitMapsLength: UShort = 0u,
    public var wPad: UShort = 0u,
    public var TypeBitMaps: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_NSEC_DATAA) return false
        if (this.pNextDomainName != other.pNextDomainName) return false
        if (this.wTypeBitMapsLength != other.wTypeBitMapsLength) return false
        if (this.wPad != other.wPad) return false
        if (!this.TypeBitMaps.contentEquals(other.TypeBitMaps)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNextDomainName.hashCode()
        result = 31 * result + this.wTypeBitMapsLength.hashCode()
        result = 31 * result + this.wPad.hashCode()
        result = 31 * result + this.TypeBitMaps.contentHashCode()
        return result
    }
}

public data class DNS_NSEC_DATAW(
    public var pNextDomainName: PWSTR = 0L,
    public var wTypeBitMapsLength: UShort = 0u,
    public var wPad: UShort = 0u,
    public var TypeBitMaps: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_NSEC_DATAW) return false
        if (this.pNextDomainName != other.pNextDomainName) return false
        if (this.wTypeBitMapsLength != other.wTypeBitMapsLength) return false
        if (this.wPad != other.wPad) return false
        if (!this.TypeBitMaps.contentEquals(other.TypeBitMaps)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNextDomainName.hashCode()
        result = 31 * result + this.wTypeBitMapsLength.hashCode()
        result = 31 * result + this.wPad.hashCode()
        result = 31 * result + this.TypeBitMaps.contentHashCode()
        return result
    }
}

public data class DNS_NULL_DATA(public var dwByteCount: UInt = 0u, public var Data: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_NULL_DATA) return false
        if (this.dwByteCount != other.dwByteCount) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwByteCount.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class DNS_NXT_DATAA(
    public var pNameNext: PSTR = 0L,
    public var wNumTypes: UShort = 0u,
    public var wTypes: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_NXT_DATAA) return false
        if (this.pNameNext != other.pNameNext) return false
        if (this.wNumTypes != other.wNumTypes) return false
        if (!this.wTypes.contentEquals(other.wTypes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNameNext.hashCode()
        result = 31 * result + this.wNumTypes.hashCode()
        result = 31 * result + this.wTypes.contentHashCode()
        return result
    }
}

public data class DNS_NXT_DATAW(
    public var pNameNext: PWSTR = 0L,
    public var wNumTypes: UShort = 0u,
    public var wTypes: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_NXT_DATAW) return false
        if (this.pNameNext != other.pNameNext) return false
        if (this.wNumTypes != other.wNumTypes) return false
        if (!this.wTypes.contentEquals(other.wTypes)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNameNext.hashCode()
        result = 31 * result + this.wNumTypes.hashCode()
        result = 31 * result + this.wTypes.contentHashCode()
        return result
    }
}

public data class DNS_OPT_DATA(
    public var wDataLength: UShort = 0u,
    public var wPad: UShort = 0u,
    public var Data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_OPT_DATA) return false
        if (this.wDataLength != other.wDataLength) return false
        if (this.wPad != other.wPad) return false
        if (!this.Data.contentEquals(other.Data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wDataLength.hashCode()
        result = 31 * result + this.wPad.hashCode()
        result = 31 * result + this.Data.contentHashCode()
        return result
    }
}

public data class DNS_PROXY_INFORMATION(
    public var version: UInt = 0u,
    public var proxyInformationType: DNS_PROXY_INFORMATION_TYPE = 0,
    public var proxyName: PWSTR = 0L,
)

public data class DNS_PTR_DATAA(public var pNameHost: PSTR = 0L)

public data class DNS_PTR_DATAW(public var pNameHost: PWSTR = 0L)

public data class DNS_QUERY_CANCEL(public var Reserved: ByteArray = ByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_QUERY_CANCEL) return false
        if (!this.Reserved.contentEquals(other.Reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.Reserved.contentHashCode()
    }
}

public data class DNS_QUERY_RAW_CANCEL(public var reserved: ByteArray = ByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_QUERY_RAW_CANCEL) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.reserved.contentHashCode()
    }
}

public data class DNS_QUERY_RAW_REQUEST(
    public var version: UInt = 0u,
    public var resultsVersion: UInt = 0u,
    public var dnsQueryRawSize: UInt = 0u,
    public var dnsQueryRaw: Long = 0L,
    public var dnsQueryName: PWSTR = 0L,
    public var dnsQueryType: UShort = 0u,
    public var queryOptions: ULong = 0uL,
    public var interfaceIndex: UInt = 0u,
    public var queryCompletionCallback: DNS_QUERY_RAW_COMPLETION_ROUTINE = null,
    public var queryContext: Long = 0L,
    public var queryRawOptions: ULong = 0uL,
    public var customServersSize: UInt = 0u,
    public var customServers: Long = 0L,
    public var protocol: UInt = 0u,
    public var Anonymous: DNS_QUERY_RAW_REQUEST_0 = DNS_QUERY_RAW_REQUEST_0(),
)

public data class DNS_QUERY_RAW_REQUEST_0(public var maxSa: ByteArray = ByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_QUERY_RAW_REQUEST_0) return false
        if (!this.maxSa.contentEquals(other.maxSa)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.maxSa.contentHashCode()
    }
}

public data class DNS_QUERY_RAW_RESULT(
    public var version: UInt = 0u,
    public var queryStatus: Int = 0,
    public var queryOptions: ULong = 0uL,
    public var queryRawOptions: ULong = 0uL,
    public var responseFlags: ULong = 0uL,
    public var queryRawResponseSize: UInt = 0u,
    public var queryRawResponse: Long = 0L,
    public var queryRecords: Long = 0L,
    public var protocol: UInt = 0u,
    public var Anonymous: DNS_QUERY_RAW_RESULT_0 = DNS_QUERY_RAW_RESULT_0(),
)

public data class DNS_QUERY_RAW_RESULT_0(public var maxSa: ByteArray = ByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_QUERY_RAW_RESULT_0) return false
        if (!this.maxSa.contentEquals(other.maxSa)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.maxSa.contentHashCode()
    }
}

public data class DNS_QUERY_REQUEST(
    public var Version: UInt = 0u,
    public var QueryName: PCWSTR = 0L,
    public var QueryType: UShort = 0u,
    public var QueryOptions: ULong = 0uL,
    public var pDnsServerList: Long = 0L,
    public var InterfaceIndex: UInt = 0u,
    public var pQueryCompletionCallback: PDNS_QUERY_COMPLETION_ROUTINE = null,
    public var pQueryContext: Long = 0L,
)

public data class DNS_QUERY_REQUEST3(
    public var Version: UInt = 0u,
    public var QueryName: PCWSTR = 0L,
    public var QueryType: UShort = 0u,
    public var QueryOptions: ULong = 0uL,
    public var pDnsServerList: Long = 0L,
    public var InterfaceIndex: UInt = 0u,
    public var pQueryCompletionCallback: PDNS_QUERY_COMPLETION_ROUTINE = null,
    public var pQueryContext: Long = 0L,
    public var IsNetworkQueryRequired: BOOL = 0,
    public var RequiredNetworkIndex: UInt = 0u,
    public var cCustomServers: UInt = 0u,
    public var pCustomServers: Long = 0L,
)

public data class DNS_QUERY_RESULT(
    public var Version: UInt = 0u,
    public var QueryStatus: Int = 0,
    public var QueryOptions: ULong = 0uL,
    public var pQueryRecords: Long = 0L,
    public var Reserved: Long = 0L,
)

public data class DNS_RECORDA(
    public var pNext: Long = 0L,
    public var pName: PSTR = 0L,
    public var wType: UShort = 0u,
    public var wDataLength: UShort = 0u,
    public var Flags: DNS_RECORDA_0 = DNS_RECORDA_0(),
    public var dwTtl: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var Data: DNS_RECORDA_1 = DNS_RECORDA_1(),
)

public class DNS_RECORDA_1 {
    public var A: DNS_A_DATA = DNS_A_DATA()

    public var SOA: DNS_SOA_DATAA = DNS_SOA_DATAA()

    public var Soa: DNS_SOA_DATAA = DNS_SOA_DATAA()

    public var PTR: DNS_PTR_DATAA = DNS_PTR_DATAA()

    public var Ptr: DNS_PTR_DATAA = DNS_PTR_DATAA()

    public var NS: DNS_PTR_DATAA = DNS_PTR_DATAA()

    public var Ns: DNS_PTR_DATAA = DNS_PTR_DATAA()

    public var CNAME: DNS_PTR_DATAA = DNS_PTR_DATAA()

    public var Cname: DNS_PTR_DATAA = DNS_PTR_DATAA()

    public var DNAME: DNS_PTR_DATAA = DNS_PTR_DATAA()

    public var Dname: DNS_PTR_DATAA = DNS_PTR_DATAA()

    public var MB: DNS_PTR_DATAA = DNS_PTR_DATAA()

    public var Mb: DNS_PTR_DATAA = DNS_PTR_DATAA()

    public var MD: DNS_PTR_DATAA = DNS_PTR_DATAA()

    public var Md: DNS_PTR_DATAA = DNS_PTR_DATAA()

    public var MF: DNS_PTR_DATAA = DNS_PTR_DATAA()

    public var Mf: DNS_PTR_DATAA = DNS_PTR_DATAA()

    public var MG: DNS_PTR_DATAA = DNS_PTR_DATAA()

    public var Mg: DNS_PTR_DATAA = DNS_PTR_DATAA()

    public var MR: DNS_PTR_DATAA = DNS_PTR_DATAA()

    public var Mr: DNS_PTR_DATAA = DNS_PTR_DATAA()

    public var MINFO: DNS_MINFO_DATAA = DNS_MINFO_DATAA()

    public var Minfo: DNS_MINFO_DATAA = DNS_MINFO_DATAA()

    public var RP: DNS_MINFO_DATAA = DNS_MINFO_DATAA()

    public var Rp: DNS_MINFO_DATAA = DNS_MINFO_DATAA()

    public var MX: DNS_MX_DATAA = DNS_MX_DATAA()

    public var Mx: DNS_MX_DATAA = DNS_MX_DATAA()

    public var AFSDB: DNS_MX_DATAA = DNS_MX_DATAA()

    public var Afsdb: DNS_MX_DATAA = DNS_MX_DATAA()

    public var RT: DNS_MX_DATAA = DNS_MX_DATAA()

    public var Rt: DNS_MX_DATAA = DNS_MX_DATAA()

    public var HINFO: DNS_TXT_DATAA = DNS_TXT_DATAA()

    public var Hinfo: DNS_TXT_DATAA = DNS_TXT_DATAA()

    public var ISDN: DNS_TXT_DATAA = DNS_TXT_DATAA()

    public var Isdn: DNS_TXT_DATAA = DNS_TXT_DATAA()

    public var TXT: DNS_TXT_DATAA = DNS_TXT_DATAA()

    public var Txt: DNS_TXT_DATAA = DNS_TXT_DATAA()

    public var X25: DNS_TXT_DATAA = DNS_TXT_DATAA()

    public var Null: DNS_NULL_DATA = DNS_NULL_DATA()

    public var WKS: DNS_WKS_DATA = DNS_WKS_DATA()

    public var Wks: DNS_WKS_DATA = DNS_WKS_DATA()

    public var AAAA: DNS_AAAA_DATA = DNS_AAAA_DATA()

    public var KEY: DNS_KEY_DATA = DNS_KEY_DATA()

    public var Key: DNS_KEY_DATA = DNS_KEY_DATA()

    public var SIG: DNS_SIG_DATAA = DNS_SIG_DATAA()

    public var Sig: DNS_SIG_DATAA = DNS_SIG_DATAA()

    public var ATMA: DNS_ATMA_DATA = DNS_ATMA_DATA()

    public var Atma: DNS_ATMA_DATA = DNS_ATMA_DATA()

    public var NXT: DNS_NXT_DATAA = DNS_NXT_DATAA()

    public var Nxt: DNS_NXT_DATAA = DNS_NXT_DATAA()

    public var SRV: DNS_SRV_DATAA = DNS_SRV_DATAA()

    public var Srv: DNS_SRV_DATAA = DNS_SRV_DATAA()

    public var NAPTR: DNS_NAPTR_DATAA = DNS_NAPTR_DATAA()

    public var Naptr: DNS_NAPTR_DATAA = DNS_NAPTR_DATAA()

    public var OPT: DNS_OPT_DATA = DNS_OPT_DATA()

    public var Opt: DNS_OPT_DATA = DNS_OPT_DATA()

    public var DS: DNS_DS_DATA = DNS_DS_DATA()

    public var Ds: DNS_DS_DATA = DNS_DS_DATA()

    public var RRSIG: DNS_SIG_DATAA = DNS_SIG_DATAA()

    public var Rrsig: DNS_SIG_DATAA = DNS_SIG_DATAA()

    public var NSEC: DNS_NSEC_DATAA = DNS_NSEC_DATAA()

    public var Nsec: DNS_NSEC_DATAA = DNS_NSEC_DATAA()

    public var DNSKEY: DNS_KEY_DATA = DNS_KEY_DATA()

    public var Dnskey: DNS_KEY_DATA = DNS_KEY_DATA()

    public var TKEY: DNS_TKEY_DATAA = DNS_TKEY_DATAA()

    public var Tkey: DNS_TKEY_DATAA = DNS_TKEY_DATAA()

    public var TSIG: DNS_TSIG_DATAA = DNS_TSIG_DATAA()

    public var Tsig: DNS_TSIG_DATAA = DNS_TSIG_DATAA()

    public var WINS: DNS_WINS_DATA = DNS_WINS_DATA()

    public var Wins: DNS_WINS_DATA = DNS_WINS_DATA()

    public var WINSR: DNS_WINSR_DATAA = DNS_WINSR_DATAA()

    public var WinsR: DNS_WINSR_DATAA = DNS_WINSR_DATAA()

    public var NBSTAT: DNS_WINSR_DATAA = DNS_WINSR_DATAA()

    public var Nbstat: DNS_WINSR_DATAA = DNS_WINSR_DATAA()

    public var DHCID: DNS_DHCID_DATA = DNS_DHCID_DATA()

    public var NSEC3: DNS_NSEC3_DATA = DNS_NSEC3_DATA()

    public var Nsec3: DNS_NSEC3_DATA = DNS_NSEC3_DATA()

    public var NSEC3PARAM: DNS_NSEC3PARAM_DATA = DNS_NSEC3PARAM_DATA()

    public var Nsec3Param: DNS_NSEC3PARAM_DATA = DNS_NSEC3PARAM_DATA()

    public var TLSA: DNS_TLSA_DATA = DNS_TLSA_DATA()

    public var Tlsa: DNS_TLSA_DATA = DNS_TLSA_DATA()

    public var SVCB: DNS_SVCB_DATA = DNS_SVCB_DATA()

    public var Svcb: DNS_SVCB_DATA = DNS_SVCB_DATA()

    public var UNKNOWN: DNS_UNKNOWN_DATA = DNS_UNKNOWN_DATA()

    public var Unknown: DNS_UNKNOWN_DATA = DNS_UNKNOWN_DATA()

    public var pDataPtr: Long = 0L
}

public data class DNS_RECORDA_0(public var DW: UInt = 0u, public var S: DNS_RECORD_FLAGS = DNS_RECORD_FLAGS())

public data class DNS_RECORDW(
    public var pNext: Long = 0L,
    public var pName: PWSTR = 0L,
    public var wType: UShort = 0u,
    public var wDataLength: UShort = 0u,
    public var Flags: DNS_RECORDW_0 = DNS_RECORDW_0(),
    public var dwTtl: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var Data: DNS_RECORDW_1 = DNS_RECORDW_1(),
)

public class DNS_RECORDW_1 {
    public var A: DNS_A_DATA = DNS_A_DATA()

    public var SOA: DNS_SOA_DATAW = DNS_SOA_DATAW()

    public var Soa: DNS_SOA_DATAW = DNS_SOA_DATAW()

    public var PTR: DNS_PTR_DATAW = DNS_PTR_DATAW()

    public var Ptr: DNS_PTR_DATAW = DNS_PTR_DATAW()

    public var NS: DNS_PTR_DATAW = DNS_PTR_DATAW()

    public var Ns: DNS_PTR_DATAW = DNS_PTR_DATAW()

    public var CNAME: DNS_PTR_DATAW = DNS_PTR_DATAW()

    public var Cname: DNS_PTR_DATAW = DNS_PTR_DATAW()

    public var DNAME: DNS_PTR_DATAW = DNS_PTR_DATAW()

    public var Dname: DNS_PTR_DATAW = DNS_PTR_DATAW()

    public var MB: DNS_PTR_DATAW = DNS_PTR_DATAW()

    public var Mb: DNS_PTR_DATAW = DNS_PTR_DATAW()

    public var MD: DNS_PTR_DATAW = DNS_PTR_DATAW()

    public var Md: DNS_PTR_DATAW = DNS_PTR_DATAW()

    public var MF: DNS_PTR_DATAW = DNS_PTR_DATAW()

    public var Mf: DNS_PTR_DATAW = DNS_PTR_DATAW()

    public var MG: DNS_PTR_DATAW = DNS_PTR_DATAW()

    public var Mg: DNS_PTR_DATAW = DNS_PTR_DATAW()

    public var MR: DNS_PTR_DATAW = DNS_PTR_DATAW()

    public var Mr: DNS_PTR_DATAW = DNS_PTR_DATAW()

    public var MINFO: DNS_MINFO_DATAW = DNS_MINFO_DATAW()

    public var Minfo: DNS_MINFO_DATAW = DNS_MINFO_DATAW()

    public var RP: DNS_MINFO_DATAW = DNS_MINFO_DATAW()

    public var Rp: DNS_MINFO_DATAW = DNS_MINFO_DATAW()

    public var MX: DNS_MX_DATAW = DNS_MX_DATAW()

    public var Mx: DNS_MX_DATAW = DNS_MX_DATAW()

    public var AFSDB: DNS_MX_DATAW = DNS_MX_DATAW()

    public var Afsdb: DNS_MX_DATAW = DNS_MX_DATAW()

    public var RT: DNS_MX_DATAW = DNS_MX_DATAW()

    public var Rt: DNS_MX_DATAW = DNS_MX_DATAW()

    public var HINFO: DNS_TXT_DATAW = DNS_TXT_DATAW()

    public var Hinfo: DNS_TXT_DATAW = DNS_TXT_DATAW()

    public var ISDN: DNS_TXT_DATAW = DNS_TXT_DATAW()

    public var Isdn: DNS_TXT_DATAW = DNS_TXT_DATAW()

    public var TXT: DNS_TXT_DATAW = DNS_TXT_DATAW()

    public var Txt: DNS_TXT_DATAW = DNS_TXT_DATAW()

    public var X25: DNS_TXT_DATAW = DNS_TXT_DATAW()

    public var Null: DNS_NULL_DATA = DNS_NULL_DATA()

    public var WKS: DNS_WKS_DATA = DNS_WKS_DATA()

    public var Wks: DNS_WKS_DATA = DNS_WKS_DATA()

    public var AAAA: DNS_AAAA_DATA = DNS_AAAA_DATA()

    public var KEY: DNS_KEY_DATA = DNS_KEY_DATA()

    public var Key: DNS_KEY_DATA = DNS_KEY_DATA()

    public var SIG: DNS_SIG_DATAW = DNS_SIG_DATAW()

    public var Sig: DNS_SIG_DATAW = DNS_SIG_DATAW()

    public var ATMA: DNS_ATMA_DATA = DNS_ATMA_DATA()

    public var Atma: DNS_ATMA_DATA = DNS_ATMA_DATA()

    public var NXT: DNS_NXT_DATAW = DNS_NXT_DATAW()

    public var Nxt: DNS_NXT_DATAW = DNS_NXT_DATAW()

    public var SRV: DNS_SRV_DATAW = DNS_SRV_DATAW()

    public var Srv: DNS_SRV_DATAW = DNS_SRV_DATAW()

    public var NAPTR: DNS_NAPTR_DATAW = DNS_NAPTR_DATAW()

    public var Naptr: DNS_NAPTR_DATAW = DNS_NAPTR_DATAW()

    public var OPT: DNS_OPT_DATA = DNS_OPT_DATA()

    public var Opt: DNS_OPT_DATA = DNS_OPT_DATA()

    public var DS: DNS_DS_DATA = DNS_DS_DATA()

    public var Ds: DNS_DS_DATA = DNS_DS_DATA()

    public var RRSIG: DNS_SIG_DATAW = DNS_SIG_DATAW()

    public var Rrsig: DNS_SIG_DATAW = DNS_SIG_DATAW()

    public var NSEC: DNS_NSEC_DATAW = DNS_NSEC_DATAW()

    public var Nsec: DNS_NSEC_DATAW = DNS_NSEC_DATAW()

    public var DNSKEY: DNS_KEY_DATA = DNS_KEY_DATA()

    public var Dnskey: DNS_KEY_DATA = DNS_KEY_DATA()

    public var TKEY: DNS_TKEY_DATAW = DNS_TKEY_DATAW()

    public var Tkey: DNS_TKEY_DATAW = DNS_TKEY_DATAW()

    public var TSIG: DNS_TSIG_DATAW = DNS_TSIG_DATAW()

    public var Tsig: DNS_TSIG_DATAW = DNS_TSIG_DATAW()

    public var WINS: DNS_WINS_DATA = DNS_WINS_DATA()

    public var Wins: DNS_WINS_DATA = DNS_WINS_DATA()

    public var WINSR: DNS_WINSR_DATAW = DNS_WINSR_DATAW()

    public var WinsR: DNS_WINSR_DATAW = DNS_WINSR_DATAW()

    public var NBSTAT: DNS_WINSR_DATAW = DNS_WINSR_DATAW()

    public var Nbstat: DNS_WINSR_DATAW = DNS_WINSR_DATAW()

    public var DHCID: DNS_DHCID_DATA = DNS_DHCID_DATA()

    public var NSEC3: DNS_NSEC3_DATA = DNS_NSEC3_DATA()

    public var Nsec3: DNS_NSEC3_DATA = DNS_NSEC3_DATA()

    public var NSEC3PARAM: DNS_NSEC3PARAM_DATA = DNS_NSEC3PARAM_DATA()

    public var Nsec3Param: DNS_NSEC3PARAM_DATA = DNS_NSEC3PARAM_DATA()

    public var TLSA: DNS_TLSA_DATA = DNS_TLSA_DATA()

    public var Tlsa: DNS_TLSA_DATA = DNS_TLSA_DATA()

    public var SVCB: DNS_SVCB_DATA = DNS_SVCB_DATA()

    public var Svcb: DNS_SVCB_DATA = DNS_SVCB_DATA()

    public var UNKNOWN: DNS_UNKNOWN_DATA = DNS_UNKNOWN_DATA()

    public var Unknown: DNS_UNKNOWN_DATA = DNS_UNKNOWN_DATA()

    public var pDataPtr: Long = 0L
}

public data class DNS_RECORDW_0(public var DW: UInt = 0u, public var S: DNS_RECORD_FLAGS = DNS_RECORD_FLAGS())

public data class DNS_RECORD_FLAGS(public var _bitfield: UInt = 0u)

public data class DNS_RECORD_OPTW(
    public var pNext: Long = 0L,
    public var pName: PWSTR = 0L,
    public var wType: UShort = 0u,
    public var wDataLength: UShort = 0u,
    public var Flags: DNS_RECORD_OPTW_0 = DNS_RECORD_OPTW_0(),
    public var ExtHeader: DNS_HEADER_EXT = DNS_HEADER_EXT(),
    public var wPayloadSize: UShort = 0u,
    public var wReserved: UShort = 0u,
    public var Data: DNS_RECORD_OPTW_1 = DNS_RECORD_OPTW_1(),
)

public data class DNS_RECORD_OPTW_1(public var OPT: DNS_OPT_DATA = DNS_OPT_DATA(), public var Opt: DNS_OPT_DATA = DNS_OPT_DATA())

public data class DNS_RECORD_OPTW_0(public var DW: UInt = 0u, public var S: DNS_RECORD_FLAGS = DNS_RECORD_FLAGS())

public data class DNS_RRSET(public var pFirstRR: Long = 0L, public var pLastRR: Long = 0L)

public data class DNS_SERVICE_BROWSE_REQUEST(
    public var Version: UInt = 0u,
    public var InterfaceIndex: UInt = 0u,
    public var QueryName: PCWSTR = 0L,
    public var Anonymous: DNS_SERVICE_BROWSE_REQUEST_0 = DNS_SERVICE_BROWSE_REQUEST_0(),
    public var pQueryContext: Long = 0L,
)

public data class DNS_SERVICE_BROWSE_REQUEST_0(public var pBrowseCallback: PDNS_SERVICE_BROWSE_CALLBACK = null, public var pBrowseCallbackV2: PDNS_QUERY_COMPLETION_ROUTINE = null)

public data class DNS_SERVICE_CANCEL(public var reserved: Long = 0L)

public data class DNS_SERVICE_INSTANCE(
    public var pszInstanceName: PWSTR = 0L,
    public var pszHostName: PWSTR = 0L,
    public var ip4Address: Long = 0L,
    public var ip6Address: Long = 0L,
    public var wPort: UShort = 0u,
    public var wPriority: UShort = 0u,
    public var wWeight: UShort = 0u,
    public var dwPropertyCount: UInt = 0u,
    public var keys: Long = 0L,
    public var values: Long = 0L,
    public var dwInterfaceIndex: UInt = 0u,
)

public data class DNS_SERVICE_REGISTER_REQUEST(
    public var Version: UInt = 0u,
    public var InterfaceIndex: UInt = 0u,
    public var pServiceInstance: Long = 0L,
    public var pRegisterCompletionCallback: PDNS_SERVICE_REGISTER_COMPLETE = null,
    public var pQueryContext: Long = 0L,
    public var hCredentials: HANDLE = 0L,
    public var unicastEnabled: BOOL = 0,
)

public data class DNS_SERVICE_RESOLVE_REQUEST(
    public var Version: UInt = 0u,
    public var InterfaceIndex: UInt = 0u,
    public var QueryName: PWSTR = 0L,
    public var pResolveCompletionCallback: PDNS_SERVICE_RESOLVE_COMPLETE = null,
    public var pQueryContext: Long = 0L,
)

public data class DNS_SIG_DATAA(
    public var wTypeCovered: UShort = 0u,
    public var chAlgorithm: UByte = 0u,
    public var chLabelCount: UByte = 0u,
    public var dwOriginalTtl: UInt = 0u,
    public var dwExpiration: UInt = 0u,
    public var dwTimeSigned: UInt = 0u,
    public var wKeyTag: UShort = 0u,
    public var wSignatureLength: UShort = 0u,
    public var pNameSigner: PSTR = 0L,
    public var Signature: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_SIG_DATAA) return false
        if (this.wTypeCovered != other.wTypeCovered) return false
        if (this.chAlgorithm != other.chAlgorithm) return false
        if (this.chLabelCount != other.chLabelCount) return false
        if (this.dwOriginalTtl != other.dwOriginalTtl) return false
        if (this.dwExpiration != other.dwExpiration) return false
        if (this.dwTimeSigned != other.dwTimeSigned) return false
        if (this.wKeyTag != other.wKeyTag) return false
        if (this.wSignatureLength != other.wSignatureLength) return false
        if (this.pNameSigner != other.pNameSigner) return false
        if (!this.Signature.contentEquals(other.Signature)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wTypeCovered.hashCode()
        result = 31 * result + this.chAlgorithm.hashCode()
        result = 31 * result + this.chLabelCount.hashCode()
        result = 31 * result + this.dwOriginalTtl.hashCode()
        result = 31 * result + this.dwExpiration.hashCode()
        result = 31 * result + this.dwTimeSigned.hashCode()
        result = 31 * result + this.wKeyTag.hashCode()
        result = 31 * result + this.wSignatureLength.hashCode()
        result = 31 * result + this.pNameSigner.hashCode()
        result = 31 * result + this.Signature.contentHashCode()
        return result
    }
}

public data class DNS_SIG_DATAW(
    public var wTypeCovered: UShort = 0u,
    public var chAlgorithm: UByte = 0u,
    public var chLabelCount: UByte = 0u,
    public var dwOriginalTtl: UInt = 0u,
    public var dwExpiration: UInt = 0u,
    public var dwTimeSigned: UInt = 0u,
    public var wKeyTag: UShort = 0u,
    public var wSignatureLength: UShort = 0u,
    public var pNameSigner: PWSTR = 0L,
    public var Signature: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_SIG_DATAW) return false
        if (this.wTypeCovered != other.wTypeCovered) return false
        if (this.chAlgorithm != other.chAlgorithm) return false
        if (this.chLabelCount != other.chLabelCount) return false
        if (this.dwOriginalTtl != other.dwOriginalTtl) return false
        if (this.dwExpiration != other.dwExpiration) return false
        if (this.dwTimeSigned != other.dwTimeSigned) return false
        if (this.wKeyTag != other.wKeyTag) return false
        if (this.wSignatureLength != other.wSignatureLength) return false
        if (this.pNameSigner != other.pNameSigner) return false
        if (!this.Signature.contentEquals(other.Signature)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wTypeCovered.hashCode()
        result = 31 * result + this.chAlgorithm.hashCode()
        result = 31 * result + this.chLabelCount.hashCode()
        result = 31 * result + this.dwOriginalTtl.hashCode()
        result = 31 * result + this.dwExpiration.hashCode()
        result = 31 * result + this.dwTimeSigned.hashCode()
        result = 31 * result + this.wKeyTag.hashCode()
        result = 31 * result + this.wSignatureLength.hashCode()
        result = 31 * result + this.pNameSigner.hashCode()
        result = 31 * result + this.Signature.contentHashCode()
        return result
    }
}

public data class DNS_SOA_DATAA(
    public var pNamePrimaryServer: PSTR = 0L,
    public var pNameAdministrator: PSTR = 0L,
    public var dwSerialNo: UInt = 0u,
    public var dwRefresh: UInt = 0u,
    public var dwRetry: UInt = 0u,
    public var dwExpire: UInt = 0u,
    public var dwDefaultTtl: UInt = 0u,
)

public data class DNS_SOA_DATAW(
    public var pNamePrimaryServer: PWSTR = 0L,
    public var pNameAdministrator: PWSTR = 0L,
    public var dwSerialNo: UInt = 0u,
    public var dwRefresh: UInt = 0u,
    public var dwRetry: UInt = 0u,
    public var dwExpire: UInt = 0u,
    public var dwDefaultTtl: UInt = 0u,
)

public data class DNS_SRV_DATAA(
    public var pNameTarget: PSTR = 0L,
    public var wPriority: UShort = 0u,
    public var wWeight: UShort = 0u,
    public var wPort: UShort = 0u,
    public var Pad: UShort = 0u,
)

public data class DNS_SRV_DATAW(
    public var pNameTarget: PWSTR = 0L,
    public var wPriority: UShort = 0u,
    public var wWeight: UShort = 0u,
    public var wPort: UShort = 0u,
    public var Pad: UShort = 0u,
)

public data class DNS_SVCB_DATA(
    public var wSvcPriority: UShort = 0u,
    public var pszTargetName: PSTR = 0L,
    public var cSvcParams: UShort = 0u,
    public var pSvcParams: Long = 0L,
)

public data class DNS_SVCB_PARAM(public var wSvcParamKey: UShort = 0u, public var Anonymous: DNS_SVCB_PARAM_0 = DNS_SVCB_PARAM_0())

public data class DNS_SVCB_PARAM_0(
    public var pIpv4Hints: Long = 0L,
    public var pIpv6Hints: Long = 0L,
    public var pMandatory: Long = 0L,
    public var pAlpn: Long = 0L,
    public var wPort: UShort = 0u,
    public var pUnknown: Long = 0L,
    public var pszDohPath: PSTR = 0L,
    public var pReserved: Long = 0L,
)

public data class DNS_SVCB_PARAM_ALPN(public var cIds: UShort = 0u, public var rgIds: List<DNS_SVCB_PARAM_ALPN_ID> = List(1) { DNS_SVCB_PARAM_ALPN_ID() })

public data class DNS_SVCB_PARAM_ALPN_ID(public var cBytes: UByte = 0u, public var pbId: Long = 0L)

public data class DNS_SVCB_PARAM_IPV4(public var cIps: UShort = 0u, public var rgIps: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_SVCB_PARAM_IPV4) return false
        if (this.cIps != other.cIps) return false
        if (!this.rgIps.contentEquals(other.rgIps)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIps.hashCode()
        result = 31 * result + this.rgIps.contentHashCode()
        return result
    }
}

public data class DNS_SVCB_PARAM_IPV6(public var cIps: UShort = 0u, public var rgIps: List<IP6_ADDRESS> = List(1) { IP6_ADDRESS() })

public data class DNS_SVCB_PARAM_MANDATORY(public var cMandatoryKeys: UShort = 0u, public var rgwMandatoryKeys: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_SVCB_PARAM_MANDATORY) return false
        if (this.cMandatoryKeys != other.cMandatoryKeys) return false
        if (!this.rgwMandatoryKeys.contentEquals(other.rgwMandatoryKeys)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cMandatoryKeys.hashCode()
        result = 31 * result + this.rgwMandatoryKeys.contentHashCode()
        return result
    }
}

public data class DNS_SVCB_PARAM_UNKNOWN(public var cBytes: UShort = 0u, public var pbSvcParamValue: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_SVCB_PARAM_UNKNOWN) return false
        if (this.cBytes != other.cBytes) return false
        if (!this.pbSvcParamValue.contentEquals(other.pbSvcParamValue)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cBytes.hashCode()
        result = 31 * result + this.pbSvcParamValue.contentHashCode()
        return result
    }
}

public data class DNS_TKEY_DATAA(
    public var pNameAlgorithm: PSTR = 0L,
    public var pAlgorithmPacket: Long = 0L,
    public var pKey: Long = 0L,
    public var pOtherData: Long = 0L,
    public var dwCreateTime: UInt = 0u,
    public var dwExpireTime: UInt = 0u,
    public var wMode: UShort = 0u,
    public var wError: UShort = 0u,
    public var wKeyLength: UShort = 0u,
    public var wOtherLength: UShort = 0u,
    public var cAlgNameLength: UByte = 0u,
    public var bPacketPointers: BOOL = 0,
)

public data class DNS_TKEY_DATAW(
    public var pNameAlgorithm: PWSTR = 0L,
    public var pAlgorithmPacket: Long = 0L,
    public var pKey: Long = 0L,
    public var pOtherData: Long = 0L,
    public var dwCreateTime: UInt = 0u,
    public var dwExpireTime: UInt = 0u,
    public var wMode: UShort = 0u,
    public var wError: UShort = 0u,
    public var wKeyLength: UShort = 0u,
    public var wOtherLength: UShort = 0u,
    public var cAlgNameLength: UByte = 0u,
    public var bPacketPointers: BOOL = 0,
)

public data class DNS_TLSA_DATA(
    public var bCertUsage: UByte = 0u,
    public var bSelector: UByte = 0u,
    public var bMatchingType: UByte = 0u,
    public var bCertificateAssociationDataLength: UShort = 0u,
    public var bPad: UByteArray = UByteArray(3),
    public var bCertificateAssociationData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_TLSA_DATA) return false
        if (this.bCertUsage != other.bCertUsage) return false
        if (this.bSelector != other.bSelector) return false
        if (this.bMatchingType != other.bMatchingType) return false
        if (this.bCertificateAssociationDataLength != other.bCertificateAssociationDataLength) return false
        if (!this.bPad.contentEquals(other.bPad)) return false
        if (!this.bCertificateAssociationData.contentEquals(other.bCertificateAssociationData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bCertUsage.hashCode()
        result = 31 * result + this.bSelector.hashCode()
        result = 31 * result + this.bMatchingType.hashCode()
        result = 31 * result + this.bCertificateAssociationDataLength.hashCode()
        result = 31 * result + this.bPad.contentHashCode()
        result = 31 * result + this.bCertificateAssociationData.contentHashCode()
        return result
    }
}

public data class DNS_TSIG_DATAA(
    public var pNameAlgorithm: PSTR = 0L,
    public var pAlgorithmPacket: Long = 0L,
    public var pSignature: Long = 0L,
    public var pOtherData: Long = 0L,
    public var i64CreateTime: Long = 0L,
    public var wFudgeTime: UShort = 0u,
    public var wOriginalXid: UShort = 0u,
    public var wError: UShort = 0u,
    public var wSigLength: UShort = 0u,
    public var wOtherLength: UShort = 0u,
    public var cAlgNameLength: UByte = 0u,
    public var bPacketPointers: BOOL = 0,
)

public data class DNS_TSIG_DATAW(
    public var pNameAlgorithm: PWSTR = 0L,
    public var pAlgorithmPacket: Long = 0L,
    public var pSignature: Long = 0L,
    public var pOtherData: Long = 0L,
    public var i64CreateTime: Long = 0L,
    public var wFudgeTime: UShort = 0u,
    public var wOriginalXid: UShort = 0u,
    public var wError: UShort = 0u,
    public var wSigLength: UShort = 0u,
    public var wOtherLength: UShort = 0u,
    public var cAlgNameLength: UByte = 0u,
    public var bPacketPointers: BOOL = 0,
)

public data class DNS_TXT_DATAA(public var dwStringCount: UInt = 0u, public var pStringArray: LongArray = LongArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_TXT_DATAA) return false
        if (this.dwStringCount != other.dwStringCount) return false
        if (!this.pStringArray.contentEquals(other.pStringArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStringCount.hashCode()
        result = 31 * result + this.pStringArray.contentHashCode()
        return result
    }
}

public data class DNS_TXT_DATAW(public var dwStringCount: UInt = 0u, public var pStringArray: LongArray = LongArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_TXT_DATAW) return false
        if (this.dwStringCount != other.dwStringCount) return false
        if (!this.pStringArray.contentEquals(other.pStringArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwStringCount.hashCode()
        result = 31 * result + this.pStringArray.contentHashCode()
        return result
    }
}

public data class DNS_UNKNOWN_DATA(public var dwByteCount: UInt = 0u, public var bData: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_UNKNOWN_DATA) return false
        if (this.dwByteCount != other.dwByteCount) return false
        if (!this.bData.contentEquals(other.bData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwByteCount.hashCode()
        result = 31 * result + this.bData.contentHashCode()
        return result
    }
}

public data class DNS_WINSR_DATAA(
    public var dwMappingFlag: UInt = 0u,
    public var dwLookupTimeout: UInt = 0u,
    public var dwCacheTimeout: UInt = 0u,
    public var pNameResultDomain: PSTR = 0L,
)

public data class DNS_WINSR_DATAW(
    public var dwMappingFlag: UInt = 0u,
    public var dwLookupTimeout: UInt = 0u,
    public var dwCacheTimeout: UInt = 0u,
    public var pNameResultDomain: PWSTR = 0L,
)

public data class DNS_WINS_DATA(
    public var dwMappingFlag: UInt = 0u,
    public var dwLookupTimeout: UInt = 0u,
    public var dwCacheTimeout: UInt = 0u,
    public var cWinsServerCount: UInt = 0u,
    public var WinsServers: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_WINS_DATA) return false
        if (this.dwMappingFlag != other.dwMappingFlag) return false
        if (this.dwLookupTimeout != other.dwLookupTimeout) return false
        if (this.dwCacheTimeout != other.dwCacheTimeout) return false
        if (this.cWinsServerCount != other.cWinsServerCount) return false
        if (!this.WinsServers.contentEquals(other.WinsServers)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMappingFlag.hashCode()
        result = 31 * result + this.dwLookupTimeout.hashCode()
        result = 31 * result + this.dwCacheTimeout.hashCode()
        result = 31 * result + this.cWinsServerCount.hashCode()
        result = 31 * result + this.WinsServers.contentHashCode()
        return result
    }
}

public data class DNS_WIRE_QUESTION(public var QuestionType: UShort = 0u, public var QuestionClass: UShort = 0u)

public data class DNS_WIRE_RECORD(
    public var RecordType: UShort = 0u,
    public var RecordClass: UShort = 0u,
    public var TimeToLive: UInt = 0u,
    public var DataLength: UShort = 0u,
)

public data class DNS_WKS_DATA(
    public var IpAddress: UInt = 0u,
    public var chProtocol: UByte = 0u,
    public var BitMask: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DNS_WKS_DATA) return false
        if (this.IpAddress != other.IpAddress) return false
        if (this.chProtocol != other.chProtocol) return false
        if (!this.BitMask.contentEquals(other.BitMask)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.IpAddress.hashCode()
        result = 31 * result + this.chProtocol.hashCode()
        result = 31 * result + this.BitMask.contentHashCode()
        return result
    }
}

public data class IP4_ARRAY(public var AddrCount: UInt = 0u, public var AddrArray: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IP4_ARRAY) return false
        if (this.AddrCount != other.AddrCount) return false
        if (!this.AddrArray.contentEquals(other.AddrArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.AddrCount.hashCode()
        result = 31 * result + this.AddrArray.contentHashCode()
        return result
    }
}

public data class IP6_ADDRESS(
    public var IP6Qword: ULongArray = ULongArray(2),
    public var IP6Dword: UIntArray = UIntArray(4),
    public var IP6Word: UShortArray = UShortArray(8),
    public var IP6Byte: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IP6_ADDRESS) return false
        if (!this.IP6Qword.contentEquals(other.IP6Qword)) return false
        if (!this.IP6Dword.contentEquals(other.IP6Dword)) return false
        if (!this.IP6Word.contentEquals(other.IP6Word)) return false
        if (!this.IP6Byte.contentEquals(other.IP6Byte)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.IP6Qword.contentHashCode()
        result = 31 * result + this.IP6Dword.contentHashCode()
        result = 31 * result + this.IP6Word.contentHashCode()
        result = 31 * result + this.IP6Byte.contentHashCode()
        return result
    }
}

public data class MDNS_QUERY_HANDLE(
    public var nameBuf: UShortArray = UShortArray(256),
    public var wType: UShort = 0u,
    public var pSubscription: Long = 0L,
    public var pWnfCallbackParams: Long = 0L,
    public var stateNameData: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MDNS_QUERY_HANDLE) return false
        if (!this.nameBuf.contentEquals(other.nameBuf)) return false
        if (this.wType != other.wType) return false
        if (this.pSubscription != other.pSubscription) return false
        if (this.pWnfCallbackParams != other.pWnfCallbackParams) return false
        if (!this.stateNameData.contentEquals(other.stateNameData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nameBuf.contentHashCode()
        result = 31 * result + this.wType.hashCode()
        result = 31 * result + this.pSubscription.hashCode()
        result = 31 * result + this.pWnfCallbackParams.hashCode()
        result = 31 * result + this.stateNameData.contentHashCode()
        return result
    }
}

public data class MDNS_QUERY_REQUEST(
    public var Version: UInt = 0u,
    public var ulRefCount: UInt = 0u,
    public var Query: PCWSTR = 0L,
    public var QueryType: UShort = 0u,
    public var QueryOptions: ULong = 0uL,
    public var InterfaceIndex: UInt = 0u,
    public var pQueryCallback: PMDNS_QUERY_CALLBACK = null,
    public var pQueryContext: Long = 0L,
    public var fAnswerReceived: BOOL = 0,
    public var ulResendCount: UInt = 0u,
)

public data class _DnsRecordOptA(
    public var pNext: Long = 0L,
    public var pName: PSTR = 0L,
    public var wType: UShort = 0u,
    public var wDataLength: UShort = 0u,
    public var Flags: _DnsRecordOptA_0 = _DnsRecordOptA_0(),
    public var ExtHeader: DNS_HEADER_EXT = DNS_HEADER_EXT(),
    public var wPayloadSize: UShort = 0u,
    public var wReserved: UShort = 0u,
    public var Data: _DnsRecordOptA_1 = _DnsRecordOptA_1(),
)

public data class _DnsRecordOptA_1(public var OPT: DNS_OPT_DATA = DNS_OPT_DATA(), public var Opt: DNS_OPT_DATA = DNS_OPT_DATA())

public data class _DnsRecordOptA_0(public var DW: UInt = 0u, public var S: DNS_RECORD_FLAGS = DNS_RECORD_FLAGS())
