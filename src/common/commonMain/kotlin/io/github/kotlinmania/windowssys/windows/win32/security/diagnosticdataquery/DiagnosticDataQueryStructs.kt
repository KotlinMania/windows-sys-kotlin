@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.GUID
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME

public data class DIAGNOSTIC_DATA_EVENT_BINARY_STATS(
    public var moduleName: PWSTR = 0L,
    public var friendlyModuleName: PWSTR = 0L,
    public var eventCount: UInt = 0u,
    public var uploadSizeBytes: ULong = 0uL,
)

public data class DIAGNOSTIC_DATA_EVENT_CATEGORY_DESCRIPTION(public var id: Int = 0, public var name: PWSTR = 0L)

public data class DIAGNOSTIC_DATA_EVENT_PRODUCER_DESCRIPTION(public var name: PWSTR = 0L)

public data class DIAGNOSTIC_DATA_EVENT_TAG_DESCRIPTION(
    public var privacyTag: Int = 0,
    public var name: PWSTR = 0L,
    public var description: PWSTR = 0L,
)

public data class DIAGNOSTIC_DATA_EVENT_TAG_STATS(public var privacyTag: Int = 0, public var eventCount: UInt = 0u)

public data class DIAGNOSTIC_DATA_EVENT_TRANSCRIPT_CONFIGURATION(
    public var hoursOfHistoryToKeep: UInt = 0u,
    public var maxStoreMegabytes: UInt = 0u,
    public var requestedMaxStoreMegabytes: UInt = 0u,
)

public data class DIAGNOSTIC_DATA_GENERAL_STATS(
    public var optInLevel: UInt = 0u,
    public var transcriptSizeBytes: ULong = 0uL,
    public var oldestEventTimestamp: ULong = 0uL,
    public var totalEventCountLast24Hours: UInt = 0u,
    public var averageDailyEvents: Float = 0.0f,
)

public data class DIAGNOSTIC_DATA_RECORD(
    public var rowId: Long = 0L,
    public var timestamp: ULong = 0uL,
    public var eventKeywords: ULong = 0uL,
    public var fullEventName: PWSTR = 0L,
    public var providerGroupGuid: PWSTR = 0L,
    public var producerName: PWSTR = 0L,
    public var privacyTags: Long = 0L,
    public var privacyTagCount: UInt = 0u,
    public var categoryIds: Long = 0L,
    public var categoryIdCount: UInt = 0u,
    public var isCoreData: BOOL = 0,
    public var extra1: PWSTR = 0L,
    public var extra2: PWSTR = 0L,
    public var extra3: PWSTR = 0L,
)

public data class DIAGNOSTIC_DATA_SEARCH_CRITERIA(
    public var producerNames: Long = 0L,
    public var producerNameCount: UInt = 0u,
    public var textToMatch: PCWSTR = 0L,
    public var categoryIds: Long = 0L,
    public var categoryIdCount: UInt = 0u,
    public var privacyTags: Long = 0L,
    public var privacyTagCount: UInt = 0u,
    public var coreDataOnly: BOOL = 0,
)

public class DIAGNOSTIC_REPORT_DATA(
    public var signature: DIAGNOSTIC_REPORT_SIGNATURE = DIAGNOSTIC_REPORT_SIGNATURE(),
    public var bucketId: GUID = GUID(),
    public var reportId: GUID = GUID(),
    public var creationTime: FILETIME = FILETIME(),
    public var sizeInBytes: ULong = 0uL,
    public var cabId: PWSTR = 0L,
    public var reportStatus: UInt = 0u,
    public var reportIntegratorId: GUID = GUID(),
    public var fileNames: Long = 0L,
    public var fileCount: UInt = 0u,
    public var friendlyEventName: PWSTR = 0L,
    public var applicationName: PWSTR = 0L,
    public var applicationPath: PWSTR = 0L,
    public var description: PWSTR = 0L,
    public var bucketIdString: PWSTR = 0L,
    public var legacyBucketId: ULong = 0uL,
    public var reportKey: PWSTR = 0L,
)

public data class DIAGNOSTIC_REPORT_PARAMETER(public var name: UShortArray = UShortArray(129), public var value: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIAGNOSTIC_REPORT_PARAMETER) return false
        if (!this.name.contentEquals(other.name)) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.value.contentHashCode()
        return result
    }
}

public data class DIAGNOSTIC_REPORT_SIGNATURE(public var eventName: UShortArray = UShortArray(65), public var parameters: List<DIAGNOSTIC_REPORT_PARAMETER> = List(10) { DIAGNOSTIC_REPORT_PARAMETER() }) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DIAGNOSTIC_REPORT_SIGNATURE) return false
        if (!this.eventName.contentEquals(other.eventName)) return false
        if (this.parameters != other.parameters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eventName.contentHashCode()
        result = 31 * result + this.parameters.hashCode()
        return result
    }
}
