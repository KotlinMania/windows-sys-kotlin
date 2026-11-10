@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime

public data class DiagnosticDataEventBinaryStats(
    public var moduleName: Pwstr = null,
    public var friendlyModuleName: Pwstr = null,
    public var eventCount: UInt = 0u,
    public var uploadSizeBytes: ULong = 0uL,
)

public data class DiagnosticDataEventCategoryDescription(public var id: Int = 0, public var name: Pwstr = null)

public data class DiagnosticDataEventProducerDescription(public var name: Pwstr = null)

public data class DiagnosticDataEventTagDescription(
    public var privacyTag: Int = 0,
    public var name: Pwstr = null,
    public var description: Pwstr = null,
)

public data class DiagnosticDataEventTagStats(public var privacyTag: Int = 0, public var eventCount: UInt = 0u)

public data class DiagnosticDataEventTranscriptConfiguration(
    public var hoursOfHistoryToKeep: UInt = 0u,
    public var maxStoreMegabytes: UInt = 0u,
    public var requestedMaxStoreMegabytes: UInt = 0u,
)

public data class DiagnosticDataGeneralStats(
    public var optInLevel: UInt = 0u,
    public var transcriptSizeBytes: ULong = 0uL,
    public var oldestEventTimestamp: ULong = 0uL,
    public var totalEventCountLast24Hours: UInt = 0u,
    public var averageDailyEvents: Float = 0.0f,
)

public data class DiagnosticDataRecord(
    public var rowId: Long = 0L,
    public var timestamp: ULong = 0uL,
    public var eventKeywords: ULong = 0uL,
    public var fullEventName: Pwstr = null,
    public var providerGroupGuid: Pwstr = null,
    public var producerName: Pwstr = null,
    public var privacyTags: Int? = null,
    public var privacyTagCount: UInt = 0u,
    public var categoryIds: Int? = null,
    public var categoryIdCount: UInt = 0u,
    public var isCoreData: Bool = 0,
    public var extra1: Pwstr = null,
    public var extra2: Pwstr = null,
    public var extra3: Pwstr = null,
)

public data class DiagnosticDataSearchCriteria(
    public var producerNames: Pcwstr? = null,
    public var producerNameCount: UInt = 0u,
    public var textToMatch: Pcwstr = null,
    public var categoryIds: Int? = null,
    public var categoryIdCount: UInt = 0u,
    public var privacyTags: Int? = null,
    public var privacyTagCount: UInt = 0u,
    public var coreDataOnly: Bool = 0,
)

public class DiagnosticReportData(
    public var signature: DiagnosticReportSignature = DiagnosticReportSignature(),
    public var bucketId: Guid = Guid(),
    public var reportId: Guid = Guid(),
    public var creationTime: Filetime = Filetime(),
    public var sizeInBytes: ULong = 0uL,
    public var cabId: Pwstr = null,
    public var reportStatus: UInt = 0u,
    public var reportIntegratorId: Guid = Guid(),
    public var fileNames: Pwstr? = null,
    public var fileCount: UInt = 0u,
    public var friendlyEventName: Pwstr = null,
    public var applicationName: Pwstr = null,
    public var applicationPath: Pwstr = null,
    public var description: Pwstr = null,
    public var bucketIdString: Pwstr = null,
    public var legacyBucketId: ULong = 0uL,
    public var reportKey: Pwstr = null,
)

public data class DiagnosticReportParameter(public var name: UShortArray = UShortArray(129), public var value: UShortArray = UShortArray(260)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DiagnosticReportParameter) return false
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

public data class DiagnosticReportSignature(public var eventName: UShortArray = UShortArray(65), public var parameters: List<DiagnosticReportParameter> = List(10) { DiagnosticReportParameter() }) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DiagnosticReportSignature) return false
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
