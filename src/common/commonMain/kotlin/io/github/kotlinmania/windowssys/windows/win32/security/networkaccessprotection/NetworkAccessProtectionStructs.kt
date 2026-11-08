@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.networkaccessprotection

import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME

public data class CorrelationId(public var connId: GUID = GUID(), public var timeStamp: FILETIME = FILETIME())

public data class CountedString(public var length: UShort = 0u, public var string: PWSTR = 0L)

public data class FailureCategoryMapping(public var mappingCompliance: IntArray = IntArray(5)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FailureCategoryMapping) return false
        if (!this.mappingCompliance.contentEquals(other.mappingCompliance)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.mappingCompliance.contentHashCode()
    }
}

public data class FixupInfo(
    public var state: FixupState = 0,
    public var percentage: UByte = 0u,
    public var resultCodes: ResultCodes = ResultCodes(),
    public var fixupMsgId: UInt = 0u,
)

public data class Ipv4Address(public var addr: UByteArray = UByteArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ipv4Address) return false
        if (!this.addr.contentEquals(other.addr)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.addr.contentHashCode()
    }
}

public data class Ipv6Address(public var addr: UByteArray = UByteArray(16)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ipv6Address) return false
        if (!this.addr.contentEquals(other.addr)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.addr.contentHashCode()
    }
}

public data class IsolationInfo(
    public var isolationState: IsolationState = 0,
    public var probEndTime: FILETIME = FILETIME(),
    public var failureUrl: CountedString = CountedString(),
)

public data class IsolationInfoEx(
    public var isolationState: IsolationState = 0,
    public var extendedIsolationState: ExtendedIsolationState = 0,
    public var probEndTime: FILETIME = FILETIME(),
    public var failureUrl: CountedString = CountedString(),
)

public data class NapComponentRegistrationInfo(
    public var id: UInt = 0u,
    public var friendlyName: CountedString = CountedString(),
    public var description: CountedString = CountedString(),
    public var version: CountedString = CountedString(),
    public var vendorName: CountedString = CountedString(),
    public var infoClsid: GUID = GUID(),
    public var configClsid: GUID = GUID(),
    public var registrationDate: FILETIME = FILETIME(),
    public var componentType: UInt = 0u,
)

public data class NetworkSoH(public var size: UShort = 0u, public var data: Long = 0L)

public data class PrivateData(public var size: UShort = 0u, public var data: Long = 0L)

public data class ResultCodes(public var count: UShort = 0u, public var results: Long = 0L)

public data class SoH(public var count: UShort = 0u, public var attributes: Long = 0L)

public data class SoHAttribute(
    public var type: UShort = 0u,
    public var size: UShort = 0u,
    public var value: Long = 0L,
)

public data class SystemHealthAgentState(
    public var id: UInt = 0u,
    public var shaResultCodes: ResultCodes = ResultCodes(),
    public var failureCategory: FailureCategory = 0,
    public var fixupInfo: FixupInfo = FixupInfo(),
)
