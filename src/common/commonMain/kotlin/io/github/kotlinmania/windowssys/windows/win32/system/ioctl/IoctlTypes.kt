package io.github.kotlinmania.windowssys.windows.win32.system.ioctl

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias BinTypes = Int

public typealias ChangerDeviceProblemType = Int

public typealias ChangerElementStatusFlags = UInt

public typealias ChangerFeatures = UInt

public typealias CsvfsDiskConnectivity = Int

public typealias CsvControlOp = Int

public typealias DetectionType = Int

public typealias DevicedumpCollectionTypeideNotificationType = Int

public typealias DeviceInternalStatusDataRequestType = Int

public typealias DeviceInternalStatusDataSet = Int

public typealias DiskCacheRetentionPriority = Int

public typealias DuplicateExtentsState = Int

public typealias ElementType = Int

public typealias FilesystemStatisticsType = UShort

public typealias FileStorageTierClass = Int

public typealias FileStorageTierFlags = UInt

public typealias FileStorageTierMediaType = Int

public typealias FsBpioInflags = Int

public typealias FsBpioOperations = Int

public typealias FsBpioOutflags = Int

public typealias GetChangerParametersFeatures1 = UInt

public typealias GptAttributes = ULong

public typealias LmrQueryInfoClass = Int

public typealias MediaType = Int

public typealias PartitionStyle = Int

public fun interface PioIrpExtProcessTrackedOffsetCallbackFn {
    public operator fun invoke(sourcecontext: ConstPtr<IoIrpExtTrackOffsetHeader>, targetcontext: MutPtr<IoIrpExtTrackOffsetHeader>, relativeoffset: Long)
}

public typealias PioIrpExtProcessTrackedOffsetCallback = PioIrpExtProcessTrackedOffsetCallbackFn?

public typealias QueryFileLayoutFilterType = Int

public typealias RefsSmrVolumeGcAction = Int

public typealias RefsSmrVolumeGcMethod = Int

public typealias RefsSmrVolumeGcState = Int

public typealias ScmBusFirmwareActivationState = Int

public typealias ScmBusPropertyId = Int

public typealias ScmBusQueryType = Int

public typealias ScmBusSetType = Int

public typealias ScmPdFirmwareActivationState = Int

public typealias ScmPdHealthStatus = Int

public typealias ScmPdLastFwActivationStatus = Int

public typealias ScmPdMediaReinitializationStatus = Int

public typealias ScmPdOperationalStatus = Int

public typealias ScmPdOperationalStatusReason = Int

public typealias ScmPdPropertyId = Int

public typealias ScmPdQueryType = Int

public typealias ScmPdSetType = Int

public typealias ScmRegionFlag = Int

public typealias ShrinkVolumeRequestTypes = Int

public typealias StorageAssociationType = Int

public typealias StorageAttributeMgmtAction = Int

public typealias StorageComponentHealthStatus = Int

public typealias StorageCounterType = Int

public typealias StorageCryptoAlgorithmId = Int

public typealias StorageCryptoKeySize = Int

public typealias StorageDeviceFormFactor = Int

public typealias StorageDevicePowerCapUnits = Int

public typealias StorageDiagnosticLevel = Int

public typealias StorageDiagnosticTargetType = Int

public typealias StorageDiskHealthStatus = Int

public typealias StorageDiskOperationalStatus = Int

public typealias StorageEncryptionType = Int

public typealias StorageIdentifierCodeSet = Int

public typealias StorageIdentifierType = Int

public typealias StorageIdNaaFormat = Int

public typealias StorageMediaType = Int

public typealias StorageOperationalStatusReason = Int

public typealias StoragePortCodeSet = Int

public typealias StoragePowerupReasonType = Int

public typealias StoragePropertyId = Int

public typealias StorageProtocolAtaDataType = Int

public typealias StorageProtocolNvmeDataType = Int

public typealias StorageProtocolType = Int

public typealias StorageProtocolUfsDataType = Int

public typealias StorageQueryType = Int

public typealias StorageReserveId = Int

public typealias StorageRpmbCommandType = Int

public typealias StorageRpmbFrameType = Int

public typealias StorageSanitizeMethod = Int

public typealias StorageSetType = Int

public typealias StorageTierClass = Int

public typealias StorageTierMediaType = Int

public typealias StorageZonedDeviceTypes = Int

public typealias StorageZonesAttributes = Int

public typealias StorageZoneCondition = Int

public typealias StorageZoneTypes = Int

public typealias TxfsRmfLags = UInt

public typealias UsnDeleteFlags = UInt

public typealias UsnSourceInfoId = UInt

public typealias VirtualStorageBehaviorCode = Int

public typealias WriteCacheChange = Int

public typealias WriteCacheEnable = Int

public typealias WriteCacheType = Int

public typealias WriteThrough = Int
