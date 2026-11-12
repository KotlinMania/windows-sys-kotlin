@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.diagnosticdataquery

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime

public class DiagnosticDataEventBinaryStats internal constructor(
    moduleNameCtorArg: Pwstr,
    friendlyModuleNameCtorArg: Pwstr,
    public var eventCount: UInt,
    public var uploadSizeBytes: ULong,
) {
    public var moduleName: Pwstr = moduleNameCtorArg
        internal set

    public var friendlyModuleName: Pwstr = friendlyModuleNameCtorArg
        internal set

    public constructor() : this(
        moduleNameCtorArg = MutPtr(0L),
        friendlyModuleNameCtorArg = MutPtr(0L),
        eventCount = 0u,
        uploadSizeBytes = 0uL,
    )

    public operator fun component1(): Pwstr = this.moduleName

    public operator fun component2(): Pwstr = this.friendlyModuleName

    public operator fun component3(): UInt = this.eventCount

    public operator fun component4(): ULong = this.uploadSizeBytes

    public fun copy(moduleName: Pwstr = this.moduleName, friendlyModuleName: Pwstr = this.friendlyModuleName, eventCount: UInt = this.eventCount, uploadSizeBytes: ULong = this.uploadSizeBytes): DiagnosticDataEventBinaryStats = DiagnosticDataEventBinaryStats(moduleNameCtorArg = moduleName, friendlyModuleNameCtorArg = friendlyModuleName, eventCount = eventCount, uploadSizeBytes = uploadSizeBytes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DiagnosticDataEventBinaryStats) return false
        if (this.moduleName != other.moduleName) return false
        if (this.friendlyModuleName != other.friendlyModuleName) return false
        if (this.eventCount != other.eventCount) return false
        if (this.uploadSizeBytes != other.uploadSizeBytes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.moduleName.hashCode()
        result = 31 * result + this.friendlyModuleName.hashCode()
        result = 31 * result + this.eventCount.hashCode()
        result = 31 * result + this.uploadSizeBytes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            moduleName: Pwstr = MutPtr(0L),
            friendlyModuleName: Pwstr = MutPtr(0L),
            eventCount: UInt = 0u,
            uploadSizeBytes: ULong = 0uL,
        ): DiagnosticDataEventBinaryStats =
            DiagnosticDataEventBinaryStats(
                moduleNameCtorArg = moduleName,
                friendlyModuleNameCtorArg = friendlyModuleName,
                eventCount = eventCount,
                uploadSizeBytes = uploadSizeBytes,
            )
    }
}

public class DiagnosticDataEventCategoryDescription internal constructor(
    public var id: Int,
    nameCtorArg: Pwstr,
) {
    public var name: Pwstr = nameCtorArg
        internal set

    public constructor() : this(
        id = 0,
        nameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.id

    public operator fun component2(): Pwstr = this.name

    public fun copy(id: Int = this.id, name: Pwstr = this.name): DiagnosticDataEventCategoryDescription = DiagnosticDataEventCategoryDescription(id = id, nameCtorArg = name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DiagnosticDataEventCategoryDescription) return false
        if (this.id != other.id) return false
        if (this.name != other.name) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.id.hashCode()
        result = 31 * result + this.name.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            id: Int = 0,
            name: Pwstr = MutPtr(0L),
        ): DiagnosticDataEventCategoryDescription =
            DiagnosticDataEventCategoryDescription(
                id = id,
                nameCtorArg = name,
            )
    }
}

public class DiagnosticDataEventProducerDescription internal constructor(
    nameCtorArg: Pwstr,
) {
    public var name: Pwstr = nameCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Pwstr = this.name

    public fun copy(name: Pwstr = this.name): DiagnosticDataEventProducerDescription = DiagnosticDataEventProducerDescription(nameCtorArg = name)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DiagnosticDataEventProducerDescription) return false
        if (this.name != other.name) return false
        return true
    }

    override fun hashCode(): Int = this.name.hashCode()

    public companion object {
        public operator fun invoke(
            name: Pwstr = MutPtr(0L),
        ): DiagnosticDataEventProducerDescription =
            DiagnosticDataEventProducerDescription(
                nameCtorArg = name,
            )
    }
}

public class DiagnosticDataEventTagDescription internal constructor(
    public var privacyTag: Int,
    nameCtorArg: Pwstr,
    descriptionCtorArg: Pwstr,
) {
    public var name: Pwstr = nameCtorArg
        internal set

    public var description: Pwstr = descriptionCtorArg
        internal set

    public constructor() : this(
        privacyTag = 0,
        nameCtorArg = MutPtr(0L),
        descriptionCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.privacyTag

    public operator fun component2(): Pwstr = this.name

    public operator fun component3(): Pwstr = this.description

    public fun copy(privacyTag: Int = this.privacyTag, name: Pwstr = this.name, description: Pwstr = this.description): DiagnosticDataEventTagDescription = DiagnosticDataEventTagDescription(privacyTag = privacyTag, nameCtorArg = name, descriptionCtorArg = description)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DiagnosticDataEventTagDescription) return false
        if (this.privacyTag != other.privacyTag) return false
        if (this.name != other.name) return false
        if (this.description != other.description) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.privacyTag.hashCode()
        result = 31 * result + this.name.hashCode()
        result = 31 * result + this.description.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            privacyTag: Int = 0,
            name: Pwstr = MutPtr(0L),
            description: Pwstr = MutPtr(0L),
        ): DiagnosticDataEventTagDescription =
            DiagnosticDataEventTagDescription(
                privacyTag = privacyTag,
                nameCtorArg = name,
                descriptionCtorArg = description,
            )
    }
}

public data class DiagnosticDataEventTagStats(
    public var privacyTag: Int = 0,
    public var eventCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiagnosticDataEventTagStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiagnosticDataEventTagStats> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DiagnosticDataEventTagStats =
                    DiagnosticDataEventTagStats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DiagnosticDataEventTagStats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.privacyTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.eventCount)
                }
            }
    }
}

public data class DiagnosticDataEventTranscriptConfiguration(
    public var hoursOfHistoryToKeep: UInt = 0u,
    public var maxStoreMegabytes: UInt = 0u,
    public var requestedMaxStoreMegabytes: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiagnosticDataEventTranscriptConfiguration> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiagnosticDataEventTranscriptConfiguration> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DiagnosticDataEventTranscriptConfiguration =
                    DiagnosticDataEventTranscriptConfiguration(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: DiagnosticDataEventTranscriptConfiguration) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.hoursOfHistoryToKeep)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.maxStoreMegabytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.requestedMaxStoreMegabytes)
                }
            }
    }
}

public data class DiagnosticDataGeneralStats(
    public var optInLevel: UInt = 0u,
    public var transcriptSizeBytes: ULong = 0uL,
    public var oldestEventTimestamp: ULong = 0uL,
    public var totalEventCountLast24Hours: UInt = 0u,
    public var averageDailyEvents: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiagnosticDataGeneralStats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiagnosticDataGeneralStats> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DiagnosticDataGeneralStats =
                    DiagnosticDataGeneralStats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: DiagnosticDataGeneralStats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.optInLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.transcriptSizeBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.oldestEventTimestamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.totalEventCountLast24Hours)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 28L, value.averageDailyEvents)
                }
            }
    }
}

public class DiagnosticDataRecord internal constructor(
    public var rowId: Long,
    public var timestamp: ULong,
    public var eventKeywords: ULong,
    fullEventNameCtorArg: Pwstr,
    providerGroupGuidCtorArg: Pwstr,
    producerNameCtorArg: Pwstr,
    privacyTagsCtorArg: MutPtr<Int>,
    public var privacyTagCount: UInt,
    categoryIdsCtorArg: MutPtr<Int>,
    public var categoryIdCount: UInt,
    public var isCoreData: Bool,
    extra1CtorArg: Pwstr,
    extra2CtorArg: Pwstr,
    extra3CtorArg: Pwstr,
) {
    public var fullEventName: Pwstr = fullEventNameCtorArg
        internal set

    public var providerGroupGuid: Pwstr = providerGroupGuidCtorArg
        internal set

    public var producerName: Pwstr = producerNameCtorArg
        internal set

    public var privacyTags: MutPtr<Int> = privacyTagsCtorArg
        internal set

    public var categoryIds: MutPtr<Int> = categoryIdsCtorArg
        internal set

    public var extra1: Pwstr = extra1CtorArg
        internal set

    public var extra2: Pwstr = extra2CtorArg
        internal set

    public var extra3: Pwstr = extra3CtorArg
        internal set

    public constructor() : this(
        rowId = 0L,
        timestamp = 0uL,
        eventKeywords = 0uL,
        fullEventNameCtorArg = MutPtr(0L),
        providerGroupGuidCtorArg = MutPtr(0L),
        producerNameCtorArg = MutPtr(0L),
        privacyTagsCtorArg = MutPtr(0L),
        privacyTagCount = 0u,
        categoryIdsCtorArg = MutPtr(0L),
        categoryIdCount = 0u,
        isCoreData = 0,
        extra1CtorArg = MutPtr(0L),
        extra2CtorArg = MutPtr(0L),
        extra3CtorArg = MutPtr(0L),
    )

    public operator fun component1(): Long = this.rowId

    public operator fun component2(): ULong = this.timestamp

    public operator fun component3(): ULong = this.eventKeywords

    public operator fun component4(): Pwstr = this.fullEventName

    public operator fun component5(): Pwstr = this.providerGroupGuid

    public operator fun component6(): Pwstr = this.producerName

    public operator fun component7(): MutPtr<Int> = this.privacyTags

    public operator fun component8(): UInt = this.privacyTagCount

    public operator fun component9(): MutPtr<Int> = this.categoryIds

    public operator fun component10(): UInt = this.categoryIdCount

    public operator fun component11(): Bool = this.isCoreData

    public operator fun component12(): Pwstr = this.extra1

    public operator fun component13(): Pwstr = this.extra2

    public operator fun component14(): Pwstr = this.extra3

    public fun copy(rowId: Long = this.rowId, timestamp: ULong = this.timestamp, eventKeywords: ULong = this.eventKeywords, fullEventName: Pwstr = this.fullEventName, providerGroupGuid: Pwstr = this.providerGroupGuid, producerName: Pwstr = this.producerName, privacyTags: MutPtr<Int> = this.privacyTags, privacyTagCount: UInt = this.privacyTagCount, categoryIds: MutPtr<Int> = this.categoryIds, categoryIdCount: UInt = this.categoryIdCount, isCoreData: Bool = this.isCoreData, extra1: Pwstr = this.extra1, extra2: Pwstr = this.extra2, extra3: Pwstr = this.extra3): DiagnosticDataRecord = DiagnosticDataRecord(rowId = rowId, timestamp = timestamp, eventKeywords = eventKeywords, fullEventNameCtorArg = fullEventName, providerGroupGuidCtorArg = providerGroupGuid, producerNameCtorArg = producerName, privacyTagsCtorArg = privacyTags, privacyTagCount = privacyTagCount, categoryIdsCtorArg = categoryIds, categoryIdCount = categoryIdCount, isCoreData = isCoreData, extra1CtorArg = extra1, extra2CtorArg = extra2, extra3CtorArg = extra3)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DiagnosticDataRecord) return false
        if (this.rowId != other.rowId) return false
        if (this.timestamp != other.timestamp) return false
        if (this.eventKeywords != other.eventKeywords) return false
        if (this.fullEventName != other.fullEventName) return false
        if (this.providerGroupGuid != other.providerGroupGuid) return false
        if (this.producerName != other.producerName) return false
        if (this.privacyTags != other.privacyTags) return false
        if (this.privacyTagCount != other.privacyTagCount) return false
        if (this.categoryIds != other.categoryIds) return false
        if (this.categoryIdCount != other.categoryIdCount) return false
        if (this.isCoreData != other.isCoreData) return false
        if (this.extra1 != other.extra1) return false
        if (this.extra2 != other.extra2) return false
        if (this.extra3 != other.extra3) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rowId.hashCode()
        result = 31 * result + this.timestamp.hashCode()
        result = 31 * result + this.eventKeywords.hashCode()
        result = 31 * result + this.fullEventName.hashCode()
        result = 31 * result + this.providerGroupGuid.hashCode()
        result = 31 * result + this.producerName.hashCode()
        result = 31 * result + this.privacyTags.hashCode()
        result = 31 * result + this.privacyTagCount.hashCode()
        result = 31 * result + this.categoryIds.hashCode()
        result = 31 * result + this.categoryIdCount.hashCode()
        result = 31 * result + this.isCoreData.hashCode()
        result = 31 * result + this.extra1.hashCode()
        result = 31 * result + this.extra2.hashCode()
        result = 31 * result + this.extra3.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            rowId: Long = 0L,
            timestamp: ULong = 0uL,
            eventKeywords: ULong = 0uL,
            fullEventName: Pwstr = MutPtr(0L),
            providerGroupGuid: Pwstr = MutPtr(0L),
            producerName: Pwstr = MutPtr(0L),
            privacyTags: MutPtr<Int> = MutPtr(0L),
            privacyTagCount: UInt = 0u,
            categoryIds: MutPtr<Int> = MutPtr(0L),
            categoryIdCount: UInt = 0u,
            isCoreData: Bool = 0,
            extra1: Pwstr = MutPtr(0L),
            extra2: Pwstr = MutPtr(0L),
            extra3: Pwstr = MutPtr(0L),
        ): DiagnosticDataRecord =
            DiagnosticDataRecord(
                rowId = rowId,
                timestamp = timestamp,
                eventKeywords = eventKeywords,
                fullEventNameCtorArg = fullEventName,
                providerGroupGuidCtorArg = providerGroupGuid,
                producerNameCtorArg = producerName,
                privacyTagsCtorArg = privacyTags,
                privacyTagCount = privacyTagCount,
                categoryIdsCtorArg = categoryIds,
                categoryIdCount = categoryIdCount,
                isCoreData = isCoreData,
                extra1CtorArg = extra1,
                extra2CtorArg = extra2,
                extra3CtorArg = extra3,
            )
    }
}

public class DiagnosticDataSearchCriteria internal constructor(
    producerNamesCtorArg: ConstPtr<Pcwstr>,
    public var producerNameCount: UInt,
    textToMatchCtorArg: Pcwstr,
    categoryIdsCtorArg: ConstPtr<Int>,
    public var categoryIdCount: UInt,
    privacyTagsCtorArg: ConstPtr<Int>,
    public var privacyTagCount: UInt,
    public var coreDataOnly: Bool,
) {
    public var producerNames: ConstPtr<Pcwstr> = producerNamesCtorArg
        internal set

    public var textToMatch: Pcwstr = textToMatchCtorArg
        internal set

    public var categoryIds: ConstPtr<Int> = categoryIdsCtorArg
        internal set

    public var privacyTags: ConstPtr<Int> = privacyTagsCtorArg
        internal set

    public constructor() : this(
        producerNamesCtorArg = ConstPtr(0L),
        producerNameCount = 0u,
        textToMatchCtorArg = ConstPtr(0L),
        categoryIdsCtorArg = ConstPtr(0L),
        categoryIdCount = 0u,
        privacyTagsCtorArg = ConstPtr(0L),
        privacyTagCount = 0u,
        coreDataOnly = 0,
    )

    public operator fun component1(): ConstPtr<Pcwstr> = this.producerNames

    public operator fun component2(): UInt = this.producerNameCount

    public operator fun component3(): Pcwstr = this.textToMatch

    public operator fun component4(): ConstPtr<Int> = this.categoryIds

    public operator fun component5(): UInt = this.categoryIdCount

    public operator fun component6(): ConstPtr<Int> = this.privacyTags

    public operator fun component7(): UInt = this.privacyTagCount

    public operator fun component8(): Bool = this.coreDataOnly

    public fun copy(producerNames: ConstPtr<Pcwstr> = this.producerNames, producerNameCount: UInt = this.producerNameCount, textToMatch: Pcwstr = this.textToMatch, categoryIds: ConstPtr<Int> = this.categoryIds, categoryIdCount: UInt = this.categoryIdCount, privacyTags: ConstPtr<Int> = this.privacyTags, privacyTagCount: UInt = this.privacyTagCount, coreDataOnly: Bool = this.coreDataOnly): DiagnosticDataSearchCriteria = DiagnosticDataSearchCriteria(producerNamesCtorArg = producerNames, producerNameCount = producerNameCount, textToMatchCtorArg = textToMatch, categoryIdsCtorArg = categoryIds, categoryIdCount = categoryIdCount, privacyTagsCtorArg = privacyTags, privacyTagCount = privacyTagCount, coreDataOnly = coreDataOnly)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DiagnosticDataSearchCriteria) return false
        if (this.producerNames != other.producerNames) return false
        if (this.producerNameCount != other.producerNameCount) return false
        if (this.textToMatch != other.textToMatch) return false
        if (this.categoryIds != other.categoryIds) return false
        if (this.categoryIdCount != other.categoryIdCount) return false
        if (this.privacyTags != other.privacyTags) return false
        if (this.privacyTagCount != other.privacyTagCount) return false
        if (this.coreDataOnly != other.coreDataOnly) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.producerNames.hashCode()
        result = 31 * result + this.producerNameCount.hashCode()
        result = 31 * result + this.textToMatch.hashCode()
        result = 31 * result + this.categoryIds.hashCode()
        result = 31 * result + this.categoryIdCount.hashCode()
        result = 31 * result + this.privacyTags.hashCode()
        result = 31 * result + this.privacyTagCount.hashCode()
        result = 31 * result + this.coreDataOnly.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            producerNames: ConstPtr<Pcwstr> = ConstPtr(0L),
            producerNameCount: UInt = 0u,
            textToMatch: Pcwstr = ConstPtr(0L),
            categoryIds: ConstPtr<Int> = ConstPtr(0L),
            categoryIdCount: UInt = 0u,
            privacyTags: ConstPtr<Int> = ConstPtr(0L),
            privacyTagCount: UInt = 0u,
            coreDataOnly: Bool = 0,
        ): DiagnosticDataSearchCriteria =
            DiagnosticDataSearchCriteria(
                producerNamesCtorArg = producerNames,
                producerNameCount = producerNameCount,
                textToMatchCtorArg = textToMatch,
                categoryIdsCtorArg = categoryIds,
                categoryIdCount = categoryIdCount,
                privacyTagsCtorArg = privacyTags,
                privacyTagCount = privacyTagCount,
                coreDataOnly = coreDataOnly,
            )
    }
}

public class DiagnosticReportData internal constructor(
    public var signature: DiagnosticReportSignature,
    public var bucketId: Guid,
    public var reportId: Guid,
    public var creationTime: Filetime,
    public var sizeInBytes: ULong,
    cabIdCtorArg: Pwstr,
    public var reportStatus: UInt,
    public var reportIntegratorId: Guid,
    fileNamesCtorArg: MutPtr<Pwstr>,
    public var fileCount: UInt,
    friendlyEventNameCtorArg: Pwstr,
    applicationNameCtorArg: Pwstr,
    applicationPathCtorArg: Pwstr,
    descriptionCtorArg: Pwstr,
    bucketIdStringCtorArg: Pwstr,
    public var legacyBucketId: ULong,
    reportKeyCtorArg: Pwstr,
) {
    public var cabId: Pwstr = cabIdCtorArg
        internal set

    public var fileNames: MutPtr<Pwstr> = fileNamesCtorArg
        internal set

    public var friendlyEventName: Pwstr = friendlyEventNameCtorArg
        internal set

    public var applicationName: Pwstr = applicationNameCtorArg
        internal set

    public var applicationPath: Pwstr = applicationPathCtorArg
        internal set

    public var description: Pwstr = descriptionCtorArg
        internal set

    public var bucketIdString: Pwstr = bucketIdStringCtorArg
        internal set

    public var reportKey: Pwstr = reportKeyCtorArg
        internal set

    public constructor() : this(
        signature = DiagnosticReportSignature(),
        bucketId = Guid(),
        reportId = Guid(),
        creationTime = Filetime(),
        sizeInBytes = 0uL,
        cabIdCtorArg = MutPtr(0L),
        reportStatus = 0u,
        reportIntegratorId = Guid(),
        fileNamesCtorArg = MutPtr(0L),
        fileCount = 0u,
        friendlyEventNameCtorArg = MutPtr(0L),
        applicationNameCtorArg = MutPtr(0L),
        applicationPathCtorArg = MutPtr(0L),
        descriptionCtorArg = MutPtr(0L),
        bucketIdStringCtorArg = MutPtr(0L),
        legacyBucketId = 0uL,
        reportKeyCtorArg = MutPtr(0L),
    )

    public companion object {
        public operator fun invoke(
            signature: DiagnosticReportSignature = DiagnosticReportSignature(),
            bucketId: Guid = Guid(),
            reportId: Guid = Guid(),
            creationTime: Filetime = Filetime(),
            sizeInBytes: ULong = 0uL,
            cabId: Pwstr = MutPtr(0L),
            reportStatus: UInt = 0u,
            reportIntegratorId: Guid = Guid(),
            fileNames: MutPtr<Pwstr> = MutPtr(0L),
            fileCount: UInt = 0u,
            friendlyEventName: Pwstr = MutPtr(0L),
            applicationName: Pwstr = MutPtr(0L),
            applicationPath: Pwstr = MutPtr(0L),
            description: Pwstr = MutPtr(0L),
            bucketIdString: Pwstr = MutPtr(0L),
            legacyBucketId: ULong = 0uL,
            reportKey: Pwstr = MutPtr(0L),
        ): DiagnosticReportData =
            DiagnosticReportData(
                signature = signature,
                bucketId = bucketId,
                reportId = reportId,
                creationTime = creationTime,
                sizeInBytes = sizeInBytes,
                cabIdCtorArg = cabId,
                reportStatus = reportStatus,
                reportIntegratorId = reportIntegratorId,
                fileNamesCtorArg = fileNames,
                fileCount = fileCount,
                friendlyEventNameCtorArg = friendlyEventName,
                applicationNameCtorArg = applicationName,
                applicationPathCtorArg = applicationPath,
                descriptionCtorArg = description,
                bucketIdStringCtorArg = bucketIdString,
                legacyBucketId = legacyBucketId,
                reportKeyCtorArg = reportKey,
            )
    }
}

public data class DiagnosticReportParameter(
    public var name: UShortArray = UShortArray(129),
    public var value: UShortArray = UShortArray(260),
) {
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiagnosticReportParameter> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiagnosticReportParameter> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 778L
                override fun readNative(addr: Long): DiagnosticReportParameter =
                    DiagnosticReportParameter(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (129).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                        ).readNative(addr + 258L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: DiagnosticReportParameter) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (129).toInt())
                    ).writeNative(addr, value.name.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (260).toInt())
                    ).writeNative(addr + 258L, value.value.toList())
                }
            }
    }
}

public data class DiagnosticReportSignature(
    public var eventName: UShortArray = UShortArray(65),
    public var parameters: List<DiagnosticReportParameter> = List(10) { DiagnosticReportParameter() },
) {
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiagnosticReportSignature> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DiagnosticReportSignature> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 7910L
                override fun readNative(addr: Long): DiagnosticReportSignature =
                    DiagnosticReportSignature(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (65).toInt())
                        ).readNative(addr).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(DiagnosticReportParameter.typeLayout(), (10).toInt())
                        ).readNative(addr + 130L),
                    )
                override fun writeNative(addr: Long, value: DiagnosticReportSignature) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (65).toInt())
                    ).writeNative(addr, value.eventName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(DiagnosticReportParameter.typeLayout(), (10).toInt())
                    ).writeNative(addr + 130L, value.parameters)
                }
            }
    }
}
