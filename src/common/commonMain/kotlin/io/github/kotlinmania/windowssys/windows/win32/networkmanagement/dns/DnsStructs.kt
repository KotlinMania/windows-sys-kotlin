@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.dns

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public data class DnsAaaaData(public var ip6Address: Ip6Address = Ip6Address())

public data class DnsAddr(public var maxSa: ByteArray = ByteArray(32), public var data: DnsAddr0 = DnsAddr0()) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsAddr) return false
        if (!this.maxSa.contentEquals(other.maxSa)) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.maxSa.contentHashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }
}

public data class DnsAddr0(public var dnsAddrUserDword: UIntArray = UIntArray(8)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsAddr0) return false
        if (!this.dnsAddrUserDword.contentEquals(other.dnsAddrUserDword)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.dnsAddrUserDword.contentHashCode()
    }
}

public data class DnsAddrArray(
    public var maxCount: UInt = 0u,
    public var addrCount: UInt = 0u,
    public var tag: UInt = 0u,
    public var family: UShort = 0u,
    public var wordReserved: UShort = 0u,
    public var flags: UInt = 0u,
    public var matchFlag: UInt = 0u,
    public var reserved1: UInt = 0u,
    public var reserved2: UInt = 0u,
    public var addrArray: List<DnsAddr> = List(1) { DnsAddr() },
)

public data class DnsApplicationSettings(public var version: UInt = 0u, public var flags: ULong = 0uL)

public data class DnsAtmaData(public var addressType: UByte = 0u, public var address: UByteArray = UByteArray(20)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsAtmaData) return false
        if (this.addressType != other.addressType) return false
        if (!this.address.contentEquals(other.address)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addressType.hashCode()
        result = 31 * result + this.address.contentHashCode()
        return result
    }
}

public data class DnsAData(public var ipAddress: UInt = 0u)

public data class DnsConnectionIfindexEntry(public var pwszConnectionName: Pcwstr = null, public var dwIfIndex: UInt = 0u)

public data class DnsConnectionIfindexList(public var pConnectionIfIndexEntries: DnsConnectionIfindexEntry? = null, public var nEntries: UInt = 0u)

public data class DnsConnectionName(public var wszName: UShortArray = UShortArray(65)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsConnectionName) return false
        if (!this.wszName.contentEquals(other.wszName)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.wszName.contentHashCode()
    }
}

public data class DnsConnectionNameList(public var cNames: UInt = 0u, public var pNames: DnsConnectionName? = null)

public data class DnsConnectionPolicyEntry(
    public var pwszHost: Pcwstr = null,
    public var pwszAppId: Pcwstr = null,
    public var cbAppSid: UInt = 0u,
    public var pbAppSid: COpaquePointer? = null,
    public var nConnections: UInt = 0u,
    public var ppwszConnections: Pcwstr? = null,
    public var dwPolicyEntryFlags: UInt = 0u,
)

public data class DnsConnectionPolicyEntryList(public var pPolicyEntries: DnsConnectionPolicyEntry? = null, public var nEntries: UInt = 0u)

public data class DnsConnectionProxyElement(public var type: DnsConnectionProxyType = 0, public var info: DnsConnectionProxyInfo = DnsConnectionProxyInfo())

public data class DnsConnectionProxyInfo(
    public var version: UInt = 0u,
    public var pwszFriendlyName: Pwstr = null,
    public var flags: UInt = 0u,
    public var switch: DnsConnectionProxyInfoSwitch = 0,
    public var anonymous: DnsConnectionProxyInfo0 = DnsConnectionProxyInfo0(),
)

public data class DnsConnectionProxyInfo0(public var config: DnsConnectionProxyInfo00 = DnsConnectionProxyInfo00(), public var script: DnsConnectionProxyInfo01 = DnsConnectionProxyInfo01())

public data class DnsConnectionProxyInfo00(
    public var pwszServer: Pwstr = null,
    public var pwszUsername: Pwstr = null,
    public var pwszPassword: Pwstr = null,
    public var pwszException: Pwstr = null,
    public var pwszExtraInfo: Pwstr = null,
    public var port: UShort = 0u,
)

public data class DnsConnectionProxyInfo01(
    public var pwszScript: Pwstr = null,
    public var pwszUsername: Pwstr = null,
    public var pwszPassword: Pwstr = null,
)

public data class DnsConnectionProxyInfoEx(
    public var proxyInfo: DnsConnectionProxyInfo = DnsConnectionProxyInfo(),
    public var dwInterfaceIndex: UInt = 0u,
    public var pwszConnectionName: Pwstr = null,
    public var fDirectConfiguration: Bool = 0,
    public var hConnection: Handle = null,
)

public data class DnsConnectionProxyList(public var cProxies: UInt = 0u, public var pProxies: DnsConnectionProxyElement? = null)

public data class DnsCustomServer(
    public var dwServerType: UInt = 0u,
    public var ullFlags: ULong = 0uL,
    public var anonymous1: DnsCustomServer0 = DnsCustomServer0(),
    public var anonymous2: DnsCustomServer1 = DnsCustomServer1(),
)

public data class DnsCustomServer0(public var pwszTemplate: Pwstr = null)

public data class DnsCustomServer1(public var maxSa: ByteArray = ByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsCustomServer1) return false
        if (!this.maxSa.contentEquals(other.maxSa)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.maxSa.contentHashCode()
    }
}

public data class DnsDhcidData(public var dwByteCount: UInt = 0u, public var dhcid: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsDhcidData) return false
        if (this.dwByteCount != other.dwByteCount) return false
        if (!this.dhcid.contentEquals(other.dhcid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwByteCount.hashCode()
        result = 31 * result + this.dhcid.contentHashCode()
        return result
    }
}

public data class DnsDsData(
    public var wKeyTag: UShort = 0u,
    public var chAlgorithm: UByte = 0u,
    public var chDigestType: UByte = 0u,
    public var wDigestLength: UShort = 0u,
    public var wPad: UShort = 0u,
    public var digest: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsDsData) return false
        if (this.wKeyTag != other.wKeyTag) return false
        if (this.chAlgorithm != other.chAlgorithm) return false
        if (this.chDigestType != other.chDigestType) return false
        if (this.wDigestLength != other.wDigestLength) return false
        if (this.wPad != other.wPad) return false
        if (!this.digest.contentEquals(other.digest)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wKeyTag.hashCode()
        result = 31 * result + this.chAlgorithm.hashCode()
        result = 31 * result + this.chDigestType.hashCode()
        result = 31 * result + this.wDigestLength.hashCode()
        result = 31 * result + this.wPad.hashCode()
        result = 31 * result + this.digest.contentHashCode()
        return result
    }
}

public data class DnsHeader(
    public var xid: UShort = 0u,
    public var bitfield1: UByte = 0u,
    public var bitfield2: UByte = 0u,
    public var questionCount: UShort = 0u,
    public var answerCount: UShort = 0u,
    public var nameServerCount: UShort = 0u,
    public var additionalCount: UShort = 0u,
)

public data class DnsHeaderExt(
    public var bitfield: UShort = 0u,
    public var chRcode: UByte = 0u,
    public var chVersion: UByte = 0u,
)

public data class DnsKeyData(
    public var wFlags: UShort = 0u,
    public var chProtocol: UByte = 0u,
    public var chAlgorithm: UByte = 0u,
    public var wKeyLength: UShort = 0u,
    public var wPad: UShort = 0u,
    public var key: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsKeyData) return false
        if (this.wFlags != other.wFlags) return false
        if (this.chProtocol != other.chProtocol) return false
        if (this.chAlgorithm != other.chAlgorithm) return false
        if (this.wKeyLength != other.wKeyLength) return false
        if (this.wPad != other.wPad) return false
        if (!this.key.contentEquals(other.key)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wFlags.hashCode()
        result = 31 * result + this.chProtocol.hashCode()
        result = 31 * result + this.chAlgorithm.hashCode()
        result = 31 * result + this.wKeyLength.hashCode()
        result = 31 * result + this.wPad.hashCode()
        result = 31 * result + this.key.contentHashCode()
        return result
    }
}

public data class DnsLocData(
    public var wVersion: UShort = 0u,
    public var wSize: UShort = 0u,
    public var wHorPrec: UShort = 0u,
    public var wVerPrec: UShort = 0u,
    public var dwLatitude: UInt = 0u,
    public var dwLongitude: UInt = 0u,
    public var dwAltitude: UInt = 0u,
)

public data class DnsMessageBuffer(public var messageHead: DnsHeader = DnsHeader(), public var messageBody: ByteArray = ByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsMessageBuffer) return false
        if (this.messageHead != other.messageHead) return false
        if (!this.messageBody.contentEquals(other.messageBody)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.messageHead.hashCode()
        result = 31 * result + this.messageBody.contentHashCode()
        return result
    }
}

public data class DnsMinfoDataa(public var pNameMailbox: Pstr = null, public var pNameErrorsMailbox: Pstr = null)

public data class DnsMinfoDataw(public var pNameMailbox: Pwstr = null, public var pNameErrorsMailbox: Pwstr = null)

public data class DnsMxDataa(
    public var pNameExchange: Pstr = null,
    public var wPreference: UShort = 0u,
    public var pad: UShort = 0u,
)

public data class DnsMxDataw(
    public var pNameExchange: Pwstr = null,
    public var wPreference: UShort = 0u,
    public var pad: UShort = 0u,
)

public data class DnsNaptrDataa(
    public var wOrder: UShort = 0u,
    public var wPreference: UShort = 0u,
    public var pFlags: Pstr = null,
    public var pService: Pstr = null,
    public var pRegularExpression: Pstr = null,
    public var pReplacement: Pstr = null,
)

public data class DnsNaptrDataw(
    public var wOrder: UShort = 0u,
    public var wPreference: UShort = 0u,
    public var pFlags: Pwstr = null,
    public var pService: Pwstr = null,
    public var pRegularExpression: Pwstr = null,
    public var pReplacement: Pwstr = null,
)

public data class DnsNsec3paramData(
    public var chAlgorithm: UByte = 0u,
    public var bFlags: UByte = 0u,
    public var wIterations: UShort = 0u,
    public var bSaltLength: UByte = 0u,
    public var bPad: UByteArray = UByteArray(3),
    public var pbSalt: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsNsec3paramData) return false
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

public data class DnsNsec3Data(
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
        if (other !is DnsNsec3Data) return false
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

public data class DnsNsecDataa(
    public var pNextDomainName: Pstr = null,
    public var wTypeBitMapsLength: UShort = 0u,
    public var wPad: UShort = 0u,
    public var typeBitMaps: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsNsecDataa) return false
        if (this.pNextDomainName != other.pNextDomainName) return false
        if (this.wTypeBitMapsLength != other.wTypeBitMapsLength) return false
        if (this.wPad != other.wPad) return false
        if (!this.typeBitMaps.contentEquals(other.typeBitMaps)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNextDomainName.hashCode()
        result = 31 * result + this.wTypeBitMapsLength.hashCode()
        result = 31 * result + this.wPad.hashCode()
        result = 31 * result + this.typeBitMaps.contentHashCode()
        return result
    }
}

public data class DnsNsecDataw(
    public var pNextDomainName: Pwstr = null,
    public var wTypeBitMapsLength: UShort = 0u,
    public var wPad: UShort = 0u,
    public var typeBitMaps: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsNsecDataw) return false
        if (this.pNextDomainName != other.pNextDomainName) return false
        if (this.wTypeBitMapsLength != other.wTypeBitMapsLength) return false
        if (this.wPad != other.wPad) return false
        if (!this.typeBitMaps.contentEquals(other.typeBitMaps)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pNextDomainName.hashCode()
        result = 31 * result + this.wTypeBitMapsLength.hashCode()
        result = 31 * result + this.wPad.hashCode()
        result = 31 * result + this.typeBitMaps.contentHashCode()
        return result
    }
}

public data class DnsNullData(public var dwByteCount: UInt = 0u, public var data: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsNullData) return false
        if (this.dwByteCount != other.dwByteCount) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwByteCount.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class DnsNxtDataa(
    public var pNameNext: Pstr = null,
    public var wNumTypes: UShort = 0u,
    public var wTypes: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsNxtDataa) return false
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

public data class DnsNxtDataw(
    public var pNameNext: Pwstr = null,
    public var wNumTypes: UShort = 0u,
    public var wTypes: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsNxtDataw) return false
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

public data class DnsOptData(
    public var wDataLength: UShort = 0u,
    public var wPad: UShort = 0u,
    public var data: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsOptData) return false
        if (this.wDataLength != other.wDataLength) return false
        if (this.wPad != other.wPad) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.wDataLength.hashCode()
        result = 31 * result + this.wPad.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }
}

public data class DnsProxyInformation(
    public var version: UInt = 0u,
    public var proxyInformationType: DnsProxyInformationType = 0,
    public var proxyName: Pwstr = null,
)

public data class DnsPtrDataa(public var pNameHost: Pstr = null)

public data class DnsPtrDataw(public var pNameHost: Pwstr = null)

public data class DnsQueryCancel(public var reserved: ByteArray = ByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsQueryCancel) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.reserved.contentHashCode()
    }
}

public data class DnsQueryRawCancel(public var reserved: ByteArray = ByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsQueryRawCancel) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.reserved.contentHashCode()
    }
}

public data class DnsQueryRawRequest(
    public var version: UInt = 0u,
    public var resultsVersion: UInt = 0u,
    public var dnsQueryRawSize: UInt = 0u,
    public var dnsQueryRaw: COpaquePointer? = null,
    public var dnsQueryName: Pwstr = null,
    public var dnsQueryType: UShort = 0u,
    public var queryOptions: ULong = 0uL,
    public var interfaceIndex: UInt = 0u,
    public var queryCompletionCallback: DnsQueryRawCompletionRoutine = null,
    public var queryContext: COpaquePointer? = null,
    public var queryRawOptions: ULong = 0uL,
    public var customServersSize: UInt = 0u,
    public var customServers: DnsCustomServer? = null,
    public var protocol: UInt = 0u,
    public var anonymous: DnsQueryRawRequest0 = DnsQueryRawRequest0(),
)

public data class DnsQueryRawRequest0(public var maxSa: ByteArray = ByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsQueryRawRequest0) return false
        if (!this.maxSa.contentEquals(other.maxSa)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.maxSa.contentHashCode()
    }
}

public data class DnsQueryRawResult(
    public var version: UInt = 0u,
    public var queryStatus: Int = 0,
    public var queryOptions: ULong = 0uL,
    public var queryRawOptions: ULong = 0uL,
    public var responseFlags: ULong = 0uL,
    public var queryRawResponseSize: UInt = 0u,
    public var queryRawResponse: COpaquePointer? = null,
    public var queryRecords: DnsRecorda? = null,
    public var protocol: UInt = 0u,
    public var anonymous: DnsQueryRawResult0 = DnsQueryRawResult0(),
)

public data class DnsQueryRawResult0(public var maxSa: ByteArray = ByteArray(32)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsQueryRawResult0) return false
        if (!this.maxSa.contentEquals(other.maxSa)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.maxSa.contentHashCode()
    }
}

public data class DnsQueryRequest(
    public var version: UInt = 0u,
    public var queryName: Pcwstr = null,
    public var queryType: UShort = 0u,
    public var queryOptions: ULong = 0uL,
    public var pDnsServerList: DnsAddrArray? = null,
    public var interfaceIndex: UInt = 0u,
    public var pQueryCompletionCallback: PdnsQueryCompletionRoutine = null,
    public var pQueryContext: COpaquePointer? = null,
)

public data class DnsQueryRequest3(
    public var version: UInt = 0u,
    public var queryName: Pcwstr = null,
    public var queryType: UShort = 0u,
    public var queryOptions: ULong = 0uL,
    public var pDnsServerList: DnsAddrArray? = null,
    public var interfaceIndex: UInt = 0u,
    public var pQueryCompletionCallback: PdnsQueryCompletionRoutine = null,
    public var pQueryContext: COpaquePointer? = null,
    public var isNetworkQueryRequired: Bool = 0,
    public var requiredNetworkIndex: UInt = 0u,
    public var cCustomServers: UInt = 0u,
    public var pCustomServers: DnsCustomServer? = null,
)

public data class DnsQueryResult(
    public var version: UInt = 0u,
    public var queryStatus: Int = 0,
    public var queryOptions: ULong = 0uL,
    public var pQueryRecords: DnsRecorda? = null,
    public var reserved: COpaquePointer? = null,
)

public data class DnsRecorda(
    public var pNext: DnsRecorda? = null,
    public var pName: Pstr = null,
    public var wType: UShort = 0u,
    public var wDataLength: UShort = 0u,
    public var flags: DnsRecorda0 = DnsRecorda0(),
    public var dwTtl: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var data: DnsRecorda1 = DnsRecorda1(),
)

public class DnsRecorda1(
    public var a: DnsAData = DnsAData(),
    public var soa: DnsSoaDataa = DnsSoaDataa(),
    public var ptr: DnsPtrDataa = DnsPtrDataa(),
    public var ns: DnsPtrDataa = DnsPtrDataa(),
    public var cname: DnsPtrDataa = DnsPtrDataa(),
    public var dname: DnsPtrDataa = DnsPtrDataa(),
    public var mb: DnsPtrDataa = DnsPtrDataa(),
    public var md: DnsPtrDataa = DnsPtrDataa(),
    public var mf: DnsPtrDataa = DnsPtrDataa(),
    public var mg: DnsPtrDataa = DnsPtrDataa(),
    public var mr: DnsPtrDataa = DnsPtrDataa(),
    public var minfo: DnsMinfoDataa = DnsMinfoDataa(),
    public var rp: DnsMinfoDataa = DnsMinfoDataa(),
    public var mx: DnsMxDataa = DnsMxDataa(),
    public var afsdb: DnsMxDataa = DnsMxDataa(),
    public var rt: DnsMxDataa = DnsMxDataa(),
    public var hinfo: DnsTxtDataa = DnsTxtDataa(),
    public var isdn: DnsTxtDataa = DnsTxtDataa(),
    public var txt: DnsTxtDataa = DnsTxtDataa(),
    public var x25: DnsTxtDataa = DnsTxtDataa(),
    public var nullVal: DnsNullData = DnsNullData(),
    public var wks: DnsWksData = DnsWksData(),
    public var aaaa: DnsAaaaData = DnsAaaaData(),
    public var key: DnsKeyData = DnsKeyData(),
    public var sig: DnsSigDataa = DnsSigDataa(),
    public var atma: DnsAtmaData = DnsAtmaData(),
    public var nxt: DnsNxtDataa = DnsNxtDataa(),
    public var srv: DnsSrvDataa = DnsSrvDataa(),
    public var naptr: DnsNaptrDataa = DnsNaptrDataa(),
    public var opt: DnsOptData = DnsOptData(),
    public var ds: DnsDsData = DnsDsData(),
    public var rrsig: DnsSigDataa = DnsSigDataa(),
    public var nsec: DnsNsecDataa = DnsNsecDataa(),
    public var dnskey: DnsKeyData = DnsKeyData(),
    public var tkey: DnsTkeyDataa = DnsTkeyDataa(),
    public var tsig: DnsTsigDataa = DnsTsigDataa(),
    public var wins: DnsWinsData = DnsWinsData(),
    public var winsr: DnsWinsrDataa = DnsWinsrDataa(),
    public var winsR: DnsWinsrDataa = DnsWinsrDataa(),
    public var nbstat: DnsWinsrDataa = DnsWinsrDataa(),
    public var dhcid: DnsDhcidData = DnsDhcidData(),
    public var nsec3: DnsNsec3Data = DnsNsec3Data(),
    public var nsec3param: DnsNsec3paramData = DnsNsec3paramData(),
    public var nsec3Param: DnsNsec3paramData = DnsNsec3paramData(),
    public var tlsa: DnsTlsaData = DnsTlsaData(),
    public var svcb: DnsSvcbData = DnsSvcbData(),
    public var unknown: DnsUnknownData = DnsUnknownData(),
    public var pDataPtr: COpaquePointer? = null,
)

public data class DnsRecorda0(public var dw: UInt = 0u, public var s: DnsRecordFlags = DnsRecordFlags())

public data class DnsRecordw(
    public var pNext: DnsRecordw? = null,
    public var pName: Pwstr = null,
    public var wType: UShort = 0u,
    public var wDataLength: UShort = 0u,
    public var flags: DnsRecordw0 = DnsRecordw0(),
    public var dwTtl: UInt = 0u,
    public var dwReserved: UInt = 0u,
    public var data: DnsRecordw1 = DnsRecordw1(),
)

public class DnsRecordw1(
    public var a: DnsAData = DnsAData(),
    public var soa: DnsSoaDataw = DnsSoaDataw(),
    public var ptr: DnsPtrDataw = DnsPtrDataw(),
    public var ns: DnsPtrDataw = DnsPtrDataw(),
    public var cname: DnsPtrDataw = DnsPtrDataw(),
    public var dname: DnsPtrDataw = DnsPtrDataw(),
    public var mb: DnsPtrDataw = DnsPtrDataw(),
    public var md: DnsPtrDataw = DnsPtrDataw(),
    public var mf: DnsPtrDataw = DnsPtrDataw(),
    public var mg: DnsPtrDataw = DnsPtrDataw(),
    public var mr: DnsPtrDataw = DnsPtrDataw(),
    public var minfo: DnsMinfoDataw = DnsMinfoDataw(),
    public var rp: DnsMinfoDataw = DnsMinfoDataw(),
    public var mx: DnsMxDataw = DnsMxDataw(),
    public var afsdb: DnsMxDataw = DnsMxDataw(),
    public var rt: DnsMxDataw = DnsMxDataw(),
    public var hinfo: DnsTxtDataw = DnsTxtDataw(),
    public var isdn: DnsTxtDataw = DnsTxtDataw(),
    public var txt: DnsTxtDataw = DnsTxtDataw(),
    public var x25: DnsTxtDataw = DnsTxtDataw(),
    public var nullVal: DnsNullData = DnsNullData(),
    public var wks: DnsWksData = DnsWksData(),
    public var aaaa: DnsAaaaData = DnsAaaaData(),
    public var key: DnsKeyData = DnsKeyData(),
    public var sig: DnsSigDataw = DnsSigDataw(),
    public var atma: DnsAtmaData = DnsAtmaData(),
    public var nxt: DnsNxtDataw = DnsNxtDataw(),
    public var srv: DnsSrvDataw = DnsSrvDataw(),
    public var naptr: DnsNaptrDataw = DnsNaptrDataw(),
    public var opt: DnsOptData = DnsOptData(),
    public var ds: DnsDsData = DnsDsData(),
    public var rrsig: DnsSigDataw = DnsSigDataw(),
    public var nsec: DnsNsecDataw = DnsNsecDataw(),
    public var dnskey: DnsKeyData = DnsKeyData(),
    public var tkey: DnsTkeyDataw = DnsTkeyDataw(),
    public var tsig: DnsTsigDataw = DnsTsigDataw(),
    public var wins: DnsWinsData = DnsWinsData(),
    public var winsr: DnsWinsrDataw = DnsWinsrDataw(),
    public var winsR: DnsWinsrDataw = DnsWinsrDataw(),
    public var nbstat: DnsWinsrDataw = DnsWinsrDataw(),
    public var dhcid: DnsDhcidData = DnsDhcidData(),
    public var nsec3: DnsNsec3Data = DnsNsec3Data(),
    public var nsec3param: DnsNsec3paramData = DnsNsec3paramData(),
    public var nsec3Param: DnsNsec3paramData = DnsNsec3paramData(),
    public var tlsa: DnsTlsaData = DnsTlsaData(),
    public var svcb: DnsSvcbData = DnsSvcbData(),
    public var unknown: DnsUnknownData = DnsUnknownData(),
    public var pDataPtr: COpaquePointer? = null,
)

public data class DnsRecordw0(public var dw: UInt = 0u, public var s: DnsRecordFlags = DnsRecordFlags())

public data class DnsRecordFlags(public var bitfield: UInt = 0u)

public data class DnsRecordOptw(
    public var pNext: DnsRecordw? = null,
    public var pName: Pwstr = null,
    public var wType: UShort = 0u,
    public var wDataLength: UShort = 0u,
    public var flags: DnsRecordOptw0 = DnsRecordOptw0(),
    public var extHeader: DnsHeaderExt = DnsHeaderExt(),
    public var wPayloadSize: UShort = 0u,
    public var wReserved: UShort = 0u,
    public var data: DnsRecordOptw1 = DnsRecordOptw1(),
)

public data class DnsRecordOptw1(public var opt: DnsOptData = DnsOptData())

public data class DnsRecordOptw0(public var dw: UInt = 0u, public var s: DnsRecordFlags = DnsRecordFlags())

public data class DnsRrset(public var pFirstRR: DnsRecorda? = null, public var pLastRR: DnsRecorda? = null)

public data class DnsServiceBrowseRequest(
    public var version: UInt = 0u,
    public var interfaceIndex: UInt = 0u,
    public var queryName: Pcwstr = null,
    public var anonymous: DnsServiceBrowseRequest0 = DnsServiceBrowseRequest0(),
    public var pQueryContext: COpaquePointer? = null,
)

public data class DnsServiceBrowseRequest0(public var pBrowseCallback: PdnsServiceBrowseCallback = null, public var pBrowseCallbackV2: PdnsQueryCompletionRoutine = null)

public data class DnsServiceCancel(public var reserved: COpaquePointer? = null)

public data class DnsServiceInstance(
    public var pszInstanceName: Pwstr = null,
    public var pszHostName: Pwstr = null,
    public var ip4Address: UInt? = null,
    public var ip6Address: Ip6Address? = null,
    public var wPort: UShort = 0u,
    public var wPriority: UShort = 0u,
    public var wWeight: UShort = 0u,
    public var dwPropertyCount: UInt = 0u,
    public var keys: Pwstr? = null,
    public var values: Pwstr? = null,
    public var dwInterfaceIndex: UInt = 0u,
)

public data class DnsServiceRegisterRequest(
    public var version: UInt = 0u,
    public var interfaceIndex: UInt = 0u,
    public var pServiceInstance: DnsServiceInstance? = null,
    public var pRegisterCompletionCallback: PdnsServiceRegisterComplete = null,
    public var pQueryContext: COpaquePointer? = null,
    public var hCredentials: Handle = null,
    public var unicastEnabled: Bool = 0,
)

public data class DnsServiceResolveRequest(
    public var version: UInt = 0u,
    public var interfaceIndex: UInt = 0u,
    public var queryName: Pwstr = null,
    public var pResolveCompletionCallback: PdnsServiceResolveComplete = null,
    public var pQueryContext: COpaquePointer? = null,
)

public data class DnsSigDataa(
    public var wTypeCovered: UShort = 0u,
    public var chAlgorithm: UByte = 0u,
    public var chLabelCount: UByte = 0u,
    public var dwOriginalTtl: UInt = 0u,
    public var dwExpiration: UInt = 0u,
    public var dwTimeSigned: UInt = 0u,
    public var wKeyTag: UShort = 0u,
    public var wSignatureLength: UShort = 0u,
    public var pNameSigner: Pstr = null,
    public var signature: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSigDataa) return false
        if (this.wTypeCovered != other.wTypeCovered) return false
        if (this.chAlgorithm != other.chAlgorithm) return false
        if (this.chLabelCount != other.chLabelCount) return false
        if (this.dwOriginalTtl != other.dwOriginalTtl) return false
        if (this.dwExpiration != other.dwExpiration) return false
        if (this.dwTimeSigned != other.dwTimeSigned) return false
        if (this.wKeyTag != other.wKeyTag) return false
        if (this.wSignatureLength != other.wSignatureLength) return false
        if (this.pNameSigner != other.pNameSigner) return false
        if (!this.signature.contentEquals(other.signature)) return false
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
        result = 31 * result + this.signature.contentHashCode()
        return result
    }
}

public data class DnsSigDataw(
    public var wTypeCovered: UShort = 0u,
    public var chAlgorithm: UByte = 0u,
    public var chLabelCount: UByte = 0u,
    public var dwOriginalTtl: UInt = 0u,
    public var dwExpiration: UInt = 0u,
    public var dwTimeSigned: UInt = 0u,
    public var wKeyTag: UShort = 0u,
    public var wSignatureLength: UShort = 0u,
    public var pNameSigner: Pwstr = null,
    public var signature: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSigDataw) return false
        if (this.wTypeCovered != other.wTypeCovered) return false
        if (this.chAlgorithm != other.chAlgorithm) return false
        if (this.chLabelCount != other.chLabelCount) return false
        if (this.dwOriginalTtl != other.dwOriginalTtl) return false
        if (this.dwExpiration != other.dwExpiration) return false
        if (this.dwTimeSigned != other.dwTimeSigned) return false
        if (this.wKeyTag != other.wKeyTag) return false
        if (this.wSignatureLength != other.wSignatureLength) return false
        if (this.pNameSigner != other.pNameSigner) return false
        if (!this.signature.contentEquals(other.signature)) return false
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
        result = 31 * result + this.signature.contentHashCode()
        return result
    }
}

public data class DnsSoaDataa(
    public var pNamePrimaryServer: Pstr = null,
    public var pNameAdministrator: Pstr = null,
    public var dwSerialNo: UInt = 0u,
    public var dwRefresh: UInt = 0u,
    public var dwRetry: UInt = 0u,
    public var dwExpire: UInt = 0u,
    public var dwDefaultTtl: UInt = 0u,
)

public data class DnsSoaDataw(
    public var pNamePrimaryServer: Pwstr = null,
    public var pNameAdministrator: Pwstr = null,
    public var dwSerialNo: UInt = 0u,
    public var dwRefresh: UInt = 0u,
    public var dwRetry: UInt = 0u,
    public var dwExpire: UInt = 0u,
    public var dwDefaultTtl: UInt = 0u,
)

public data class DnsSrvDataa(
    public var pNameTarget: Pstr = null,
    public var wPriority: UShort = 0u,
    public var wWeight: UShort = 0u,
    public var wPort: UShort = 0u,
    public var pad: UShort = 0u,
)

public data class DnsSrvDataw(
    public var pNameTarget: Pwstr = null,
    public var wPriority: UShort = 0u,
    public var wWeight: UShort = 0u,
    public var wPort: UShort = 0u,
    public var pad: UShort = 0u,
)

public data class DnsSvcbData(
    public var wSvcPriority: UShort = 0u,
    public var pszTargetName: Pstr = null,
    public var cSvcParams: UShort = 0u,
    public var pSvcParams: DnsSvcbParam? = null,
)

public data class DnsSvcbParam(public var wSvcParamKey: UShort = 0u, public var anonymous: DnsSvcbParam0 = DnsSvcbParam0())

public data class DnsSvcbParam0(
    public var pIpv4Hints: DnsSvcbParamIpv4? = null,
    public var pIpv6Hints: DnsSvcbParamIpv6? = null,
    public var pMandatory: DnsSvcbParamMandatory? = null,
    public var pAlpn: DnsSvcbParamAlpn? = null,
    public var wPort: UShort = 0u,
    public var pUnknown: DnsSvcbParamUnknown? = null,
    public var pszDohPath: Pstr = null,
    public var pReserved: COpaquePointer? = null,
)

public data class DnsSvcbParamAlpn(public var cIds: UShort = 0u, public var rgIds: List<DnsSvcbParamAlpnId> = List(1) { DnsSvcbParamAlpnId() })

public data class DnsSvcbParamAlpnId(public var cBytes: UByte = 0u, public var pbId: COpaquePointer? = null)

public data class DnsSvcbParamIpv4(public var cIps: UShort = 0u, public var rgIps: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSvcbParamIpv4) return false
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

public data class DnsSvcbParamIpv6(public var cIps: UShort = 0u, public var rgIps: List<Ip6Address> = List(1) { Ip6Address() })

public data class DnsSvcbParamMandatory(public var cMandatoryKeys: UShort = 0u, public var rgwMandatoryKeys: UShortArray = UShortArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSvcbParamMandatory) return false
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

public data class DnsSvcbParamUnknown(public var cBytes: UShort = 0u, public var pbSvcParamValue: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsSvcbParamUnknown) return false
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

public data class DnsTkeyDataa(
    public var pNameAlgorithm: Pstr = null,
    public var pAlgorithmPacket: COpaquePointer? = null,
    public var pKey: COpaquePointer? = null,
    public var pOtherData: COpaquePointer? = null,
    public var dwCreateTime: UInt = 0u,
    public var dwExpireTime: UInt = 0u,
    public var wMode: UShort = 0u,
    public var wError: UShort = 0u,
    public var wKeyLength: UShort = 0u,
    public var wOtherLength: UShort = 0u,
    public var cAlgNameLength: UByte = 0u,
    public var bPacketPointers: Bool = 0,
)

public data class DnsTkeyDataw(
    public var pNameAlgorithm: Pwstr = null,
    public var pAlgorithmPacket: COpaquePointer? = null,
    public var pKey: COpaquePointer? = null,
    public var pOtherData: COpaquePointer? = null,
    public var dwCreateTime: UInt = 0u,
    public var dwExpireTime: UInt = 0u,
    public var wMode: UShort = 0u,
    public var wError: UShort = 0u,
    public var wKeyLength: UShort = 0u,
    public var wOtherLength: UShort = 0u,
    public var cAlgNameLength: UByte = 0u,
    public var bPacketPointers: Bool = 0,
)

public data class DnsTlsaData(
    public var bCertUsage: UByte = 0u,
    public var bSelector: UByte = 0u,
    public var bMatchingType: UByte = 0u,
    public var bCertificateAssociationDataLength: UShort = 0u,
    public var bPad: UByteArray = UByteArray(3),
    public var bCertificateAssociationData: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsTlsaData) return false
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

public data class DnsTsigDataa(
    public var pNameAlgorithm: Pstr = null,
    public var pAlgorithmPacket: COpaquePointer? = null,
    public var pSignature: COpaquePointer? = null,
    public var pOtherData: COpaquePointer? = null,
    public var i64CreateTime: Long = 0L,
    public var wFudgeTime: UShort = 0u,
    public var wOriginalXid: UShort = 0u,
    public var wError: UShort = 0u,
    public var wSigLength: UShort = 0u,
    public var wOtherLength: UShort = 0u,
    public var cAlgNameLength: UByte = 0u,
    public var bPacketPointers: Bool = 0,
)

public data class DnsTsigDataw(
    public var pNameAlgorithm: Pwstr = null,
    public var pAlgorithmPacket: COpaquePointer? = null,
    public var pSignature: COpaquePointer? = null,
    public var pOtherData: COpaquePointer? = null,
    public var i64CreateTime: Long = 0L,
    public var wFudgeTime: UShort = 0u,
    public var wOriginalXid: UShort = 0u,
    public var wError: UShort = 0u,
    public var wSigLength: UShort = 0u,
    public var wOtherLength: UShort = 0u,
    public var cAlgNameLength: UByte = 0u,
    public var bPacketPointers: Bool = 0,
)

public data class DnsTxtDataa(public var dwStringCount: UInt = 0u, public var pStringArray: List<COpaquePointer> = List(1) { COpaquePointer(0L) })

public data class DnsTxtDataw(public var dwStringCount: UInt = 0u, public var pStringArray: List<COpaquePointer> = List(1) { COpaquePointer(0L) })

public data class DnsUnknownData(public var dwByteCount: UInt = 0u, public var bData: UByteArray = UByteArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsUnknownData) return false
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

public data class DnsWinsrDataa(
    public var dwMappingFlag: UInt = 0u,
    public var dwLookupTimeout: UInt = 0u,
    public var dwCacheTimeout: UInt = 0u,
    public var pNameResultDomain: Pstr = null,
)

public data class DnsWinsrDataw(
    public var dwMappingFlag: UInt = 0u,
    public var dwLookupTimeout: UInt = 0u,
    public var dwCacheTimeout: UInt = 0u,
    public var pNameResultDomain: Pwstr = null,
)

public data class DnsWinsData(
    public var dwMappingFlag: UInt = 0u,
    public var dwLookupTimeout: UInt = 0u,
    public var dwCacheTimeout: UInt = 0u,
    public var cWinsServerCount: UInt = 0u,
    public var winsServers: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsWinsData) return false
        if (this.dwMappingFlag != other.dwMappingFlag) return false
        if (this.dwLookupTimeout != other.dwLookupTimeout) return false
        if (this.dwCacheTimeout != other.dwCacheTimeout) return false
        if (this.cWinsServerCount != other.cWinsServerCount) return false
        if (!this.winsServers.contentEquals(other.winsServers)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dwMappingFlag.hashCode()
        result = 31 * result + this.dwLookupTimeout.hashCode()
        result = 31 * result + this.dwCacheTimeout.hashCode()
        result = 31 * result + this.cWinsServerCount.hashCode()
        result = 31 * result + this.winsServers.contentHashCode()
        return result
    }
}

public data class DnsWireQuestion(public var questionType: UShort = 0u, public var questionClass: UShort = 0u)

public data class DnsWireRecord(
    public var recordType: UShort = 0u,
    public var recordClass: UShort = 0u,
    public var timeToLive: UInt = 0u,
    public var dataLength: UShort = 0u,
)

public data class DnsWksData(
    public var ipAddress: UInt = 0u,
    public var chProtocol: UByte = 0u,
    public var bitMask: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DnsWksData) return false
        if (this.ipAddress != other.ipAddress) return false
        if (this.chProtocol != other.chProtocol) return false
        if (!this.bitMask.contentEquals(other.bitMask)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ipAddress.hashCode()
        result = 31 * result + this.chProtocol.hashCode()
        result = 31 * result + this.bitMask.contentHashCode()
        return result
    }
}

public data class Ip4Array(public var addrCount: UInt = 0u, public var addrArray: UIntArray = UIntArray(1)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ip4Array) return false
        if (this.addrCount != other.addrCount) return false
        if (!this.addrArray.contentEquals(other.addrArray)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addrCount.hashCode()
        result = 31 * result + this.addrArray.contentHashCode()
        return result
    }
}

public data class Ip6Address(
    public var iP6Qword: ULongArray = ULongArray(2),
    public var iP6Dword: UIntArray = UIntArray(4),
    public var iP6Word: UShortArray = UShortArray(8),
    public var iP6Byte: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ip6Address) return false
        if (!this.iP6Qword.contentEquals(other.iP6Qword)) return false
        if (!this.iP6Dword.contentEquals(other.iP6Dword)) return false
        if (!this.iP6Word.contentEquals(other.iP6Word)) return false
        if (!this.iP6Byte.contentEquals(other.iP6Byte)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iP6Qword.contentHashCode()
        result = 31 * result + this.iP6Dword.contentHashCode()
        result = 31 * result + this.iP6Word.contentHashCode()
        result = 31 * result + this.iP6Byte.contentHashCode()
        return result
    }
}

public data class MdnsQueryHandle(
    public var nameBuf: UShortArray = UShortArray(256),
    public var wType: UShort = 0u,
    public var pSubscription: COpaquePointer? = null,
    public var pWnfCallbackParams: COpaquePointer? = null,
    public var stateNameData: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MdnsQueryHandle) return false
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

public data class MdnsQueryRequest(
    public var version: UInt = 0u,
    public var ulRefCount: UInt = 0u,
    public var query: Pcwstr = null,
    public var queryType: UShort = 0u,
    public var queryOptions: ULong = 0uL,
    public var interfaceIndex: UInt = 0u,
    public var pQueryCallback: PmdnsQueryCallback = null,
    public var pQueryContext: COpaquePointer? = null,
    public var fAnswerReceived: Bool = 0,
    public var ulResendCount: UInt = 0u,
)

public data class DnsRecordOptA(
    public var pNext: DnsRecorda? = null,
    public var pName: Pstr = null,
    public var wType: UShort = 0u,
    public var wDataLength: UShort = 0u,
    public var flags: DnsRecordOptA0 = DnsRecordOptA0(),
    public var extHeader: DnsHeaderExt = DnsHeaderExt(),
    public var wPayloadSize: UShort = 0u,
    public var wReserved: UShort = 0u,
    public var data: DnsRecordOptA1 = DnsRecordOptA1(),
)

public data class DnsRecordOptA1(public var opt: DnsOptData = DnsOptData())

public data class DnsRecordOptA0(public var dw: UInt = 0u, public var s: DnsRecordFlags = DnsRecordFlags())
