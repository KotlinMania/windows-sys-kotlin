@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.HcsSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_applyGuestMemoryFix
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_applyPendingSavedStateFileReplayLog
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_callStackUnwind
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_findSavedStateSymbolFieldInType
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_forceActiveVirtualTrustLevel
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_forceArchitecture
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_forceNestedHostMode
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_forcePagingMode
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_getActiveVirtualTrustLevel
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_getArchitecture
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_getEnabledVirtualTrustLevels
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_getGuestEnabledVirtualTrustLevels
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_getGuestOsInfo
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_getGuestPhysicalMemoryChunks
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_getGuestRawSavedMemorySize
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_getMemoryBlockCacheLimit
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_getNestedVirtualizationMode
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_getPagingMode
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_getRegisterValue
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_getSavedStateSymbolFieldInfo
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_getSavedStateSymbolProviderHandle
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_getSavedStateSymbolTypeSize
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_getVpCount
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_guestPhysicalAddressToRawSavedMemoryOffset
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_guestVirtualAddressToPhysicalAddress
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_hdvCreateDeviceInstance
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_hdvCreateGuestMemoryAperture
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_hdvCreateSectionBackedMmioRange
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_hdvDeliverGuestInterrupt
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_hdvDestroyGuestMemoryAperture
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_hdvDestroySectionBackedMmioRange
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHost
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHostEx
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_hdvReadGuestMemory
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_hdvRegisterDoorbell
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_hdvTeardownDeviceHost
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_hdvUnregisterDoorbell
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_hdvWriteGuestMemory
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_inKernelSpace
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_isActiveVirtualTrustLevelEnabled
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_isNestedVirtualizationEnabled
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_loadSavedStateFile
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_loadSavedStateFiles
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbols
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbolsEx
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_loadSavedStateSymbolProvider
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_locateSavedStateFiles
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_readGuestPhysicalAddress
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_readGuestRawSavedMemory
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_readSavedStateGlobalVariable
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_releaseSavedStateFiles
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_releaseSavedStateSymbolProvider
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_resolveSavedStateGlobalVariableAddress
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_scanMemoryForDosImages
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_setMemoryBlockCacheLimit
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_setSavedStateSymbolProviderDebugInfoCallback
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvAcceptPartitionMigration
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvAdviseGpaRange
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvAllocateVpciResource
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvCancelPartitionMigration
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvCancelRunVirtualProcessor
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvCompletePartitionMigration
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvCreateNotificationPort
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvCreatePartition
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvCreateTrigger
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor2
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvCreateVpciDevice
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvDeleteNotificationPort
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvDeletePartition
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvDeleteTrigger
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvDeleteVirtualProcessor
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvDeleteVpciDevice
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvEmulatorCreateEmulator
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvEmulatorDestroyEmulator
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvEmulatorTryIoEmulation
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvEmulatorTryMmioEmulation
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvGetCapability
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvGetInterruptTargetVpSet
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvGetPartitionCounters
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvGetPartitionProperty
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCounters
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCpuidOutput
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState2
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorRegisters
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorState
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorXsaveState
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceInterruptTarget
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceNotification
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceProperty
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvMapGpaRange
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvMapGpaRange2
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceInterrupt
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceMmioRanges
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvPostVirtualProcessorSynicMessage
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvQueryGpaRangeDirtyBitmap
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvReadVpciDeviceRegister
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvRegisterPartitionDoorbellEvent
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvRequestInterrupt
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvRequestVpciDeviceInterrupt
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvResetPartition
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvResumePartitionTime
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvRetargetVpciDeviceInterrupt
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvRunVirtualProcessor
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvSetNotificationPortProperty
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvSetPartitionProperty
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState2
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorRegisters
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorState
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorXsaveState
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvSetVpciDevicePowerState
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvSetupPartition
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvStartPartitionMigration
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvSuspendPartitionTime
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvTranslateGva
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvUnmapGpaRange
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceInterrupt
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceMmioRanges
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvUnregisterPartitionDoorbellEvent
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvUpdateTriggerParameters
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssys_windows_win32_system_hypervisor_wHvWriteVpciDeviceRegister
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerState
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun applyGuestMemoryFix(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualaddress: ULong, fixbuffer: COpaquePointer?, fixbuffersize: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_applyGuestMemoryFix(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, virtualaddress, fixbuffer?.value?.toCPointer<ByteVar>(), fixbuffersize)

public actual fun applyPendingSavedStateFileReplayLog(vmrsfile: Pcwstr): Hresult =
    windowssys_windows_win32_system_hypervisor_applyPendingSavedStateFileReplayLog(vmrsfile?.value?.toCPointer<ByteVar>())

public actual fun callStackUnwind(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, imageinfo: COpaquePointer?, imageinfocount: UInt, framecount: UInt, callstack: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_callStackUnwind(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, imageinfo?.value?.toCPointer<ByteVar>(), imageinfocount, framecount, callstack?.value?.toCPointer<ByteVar>())

public actual fun findSavedStateSymbolFieldInType(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, typename: Pcstr, fieldname: Pcwstr, offset: COpaquePointer?, found: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_findSavedStateSymbolFieldInType(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, typename?.value?.toCPointer<ByteVar>(), fieldname?.value?.toCPointer<ByteVar>(), offset?.value?.toCPointer<ByteVar>(), found?.value?.toCPointer<ByteVar>())

public actual fun forceActiveVirtualTrustLevel(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualtrustlevel: UByte): Hresult =
    windowssys_windows_win32_system_hypervisor_forceActiveVirtualTrustLevel(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, virtualtrustlevel)

public actual fun forceArchitecture(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, architecture: VirtualProcessorArch): Hresult =
    windowssys_windows_win32_system_hypervisor_forceArchitecture(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, architecture)

public actual fun forceNestedHostMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, hostmode: Bool, oldmode: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_forceNestedHostMode(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, hostmode, oldmode?.value?.toCPointer<ByteVar>())

public actual fun forcePagingMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, pagingmode: PagingMode): Hresult =
    windowssys_windows_win32_system_hypervisor_forcePagingMode(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, pagingmode)

public actual fun getActiveVirtualTrustLevel(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualtrustlevel: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_getActiveVirtualTrustLevel(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, virtualtrustlevel?.value?.toCPointer<ByteVar>())

public actual fun getArchitecture(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, architecture: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_getArchitecture(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, architecture?.value?.toCPointer<ByteVar>())

public actual fun getEnabledVirtualTrustLevels(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualtrustlevels: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_getEnabledVirtualTrustLevels(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, virtualtrustlevels?.value?.toCPointer<ByteVar>())

public actual fun getGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: COpaquePointer?, virtualtrustlevels: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_getGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), virtualtrustlevels?.value?.toCPointer<ByteVar>())

public actual fun getGuestOsInfo(vmsavedstatedumphandle: COpaquePointer?, virtualtrustlevel: UByte, guestosinfo: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_getGuestOsInfo(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), virtualtrustlevel, guestosinfo?.value?.toCPointer<ByteVar>())

public actual fun getGuestPhysicalMemoryChunks(vmsavedstatedumphandle: COpaquePointer?, memorychunkpagesize: COpaquePointer?, memorychunks: COpaquePointer?, memorychunkcount: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_getGuestPhysicalMemoryChunks(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), memorychunkpagesize?.value?.toCPointer<ByteVar>(), memorychunks?.value?.toCPointer<ByteVar>(), memorychunkcount?.value?.toCPointer<ByteVar>())

public actual fun getGuestRawSavedMemorySize(vmsavedstatedumphandle: COpaquePointer?, guestrawsavedmemorysize: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_getGuestRawSavedMemorySize(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), guestrawsavedmemorysize?.value?.toCPointer<ByteVar>())

public actual fun getMemoryBlockCacheLimit(vmsavedstatedumphandle: COpaquePointer?, memoryblockcachelimit: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_getMemoryBlockCacheLimit(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), memoryblockcachelimit?.value?.toCPointer<ByteVar>())

public actual fun getNestedVirtualizationMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, enabled: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_getNestedVirtualizationMode(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, enabled?.value?.toCPointer<ByteVar>())

public actual fun getPagingMode(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, pagingmode: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_getPagingMode(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, pagingmode?.value?.toCPointer<ByteVar>())

public actual fun getRegisterValue(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, registerid: UInt, registervalue: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_getRegisterValue(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, registerid, registervalue?.value?.toCPointer<ByteVar>())

public actual fun getSavedStateSymbolFieldInfo(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, typename: Pcstr, typefieldinfomap: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_getSavedStateSymbolFieldInfo(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, typename?.value?.toCPointer<ByteVar>(), typefieldinfomap?.value?.toCPointer<ByteVar>())

public actual fun getSavedStateSymbolProviderHandle(vmsavedstatedumphandle: COpaquePointer?): Handle =
    windowssys_windows_win32_system_hypervisor_getSavedStateSymbolProviderHandle(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getSavedStateSymbolTypeSize(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, typename: Pcstr, size: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_getSavedStateSymbolTypeSize(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, typename?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun getVpCount(vmsavedstatedumphandle: COpaquePointer?, vpcount: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_getVpCount(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpcount?.value?.toCPointer<ByteVar>())

public actual fun guestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: COpaquePointer?, physicaladdress: ULong, rawsavedmemoryoffset: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_guestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), physicaladdress, rawsavedmemoryoffset?.value?.toCPointer<ByteVar>())

public actual fun guestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, virtualaddress: ULong, physicaladdress: COpaquePointer?, unmappedregionsize: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_guestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, virtualaddress, physicaladdress?.value?.toCPointer<ByteVar>(), unmappedregionsize?.value?.toCPointer<ByteVar>())

public actual fun hdvCreateDeviceInstance(devicehosthandle: COpaquePointer?, devicetype: HdvDeviceType, deviceclassid: COpaquePointer?, deviceinstanceid: COpaquePointer?, deviceinterface: COpaquePointer?, devicecontext: COpaquePointer?, devicehandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_hdvCreateDeviceInstance(devicehosthandle?.value?.toCPointer<ByteVar>(), devicetype, deviceclassid?.value?.toCPointer<ByteVar>(), deviceinstanceid?.value?.toCPointer<ByteVar>(), deviceinterface?.value?.toCPointer<ByteVar>(), devicecontext?.value?.toCPointer<ByteVar>(), devicehandle?.value?.toCPointer<ByteVar>())

public actual fun hdvCreateGuestMemoryAperture(requestor: COpaquePointer?, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: Bool, mappedaddress: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_hdvCreateGuestMemoryAperture(requestor?.value?.toCPointer<ByteVar>(), guestphysicaladdress, bytecount, writeprotected, mappedaddress?.value?.toCPointer<ByteVar>())

public actual fun hdvCreateSectionBackedMmioRange(requestor: COpaquePointer?, barindex: HdvPciBarSelector, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HdvMmioMappingFlags, sectionhandle: Handle, sectionoffsetinpages: ULong): Hresult =
    windowssys_windows_win32_system_hypervisor_hdvCreateSectionBackedMmioRange(requestor?.value?.toCPointer<ByteVar>(), barindex, offsetinpages, lengthinpages, mappingflags, sectionhandle?.value?.toCPointer<ByteVar>(), sectionoffsetinpages)

public actual fun hdvDeliverGuestInterrupt(requestor: COpaquePointer?, msiaddress: ULong, msidata: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_hdvDeliverGuestInterrupt(requestor?.value?.toCPointer<ByteVar>(), msiaddress, msidata)

public actual fun hdvDestroyGuestMemoryAperture(requestor: COpaquePointer?, mappedaddress: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_hdvDestroyGuestMemoryAperture(requestor?.value?.toCPointer<ByteVar>(), mappedaddress?.value?.toCPointer<ByteVar>())

public actual fun hdvDestroySectionBackedMmioRange(requestor: COpaquePointer?, barindex: HdvPciBarSelector, offsetinpages: ULong): Hresult =
    windowssys_windows_win32_system_hypervisor_hdvDestroySectionBackedMmioRange(requestor?.value?.toCPointer<ByteVar>(), barindex, offsetinpages)

public actual fun hdvInitializeDeviceHost(computesystem: HcsSystem, devicehosthandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHost(computesystem?.value?.toCPointer<ByteVar>(), devicehosthandle?.value?.toCPointer<ByteVar>())

public actual fun hdvInitializeDeviceHostEx(computesystem: HcsSystem, flags: HdvDeviceHostFlags, devicehosthandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_hdvInitializeDeviceHostEx(computesystem?.value?.toCPointer<ByteVar>(), flags, devicehosthandle?.value?.toCPointer<ByteVar>())

public actual fun hdvReadGuestMemory(requestor: COpaquePointer?, guestphysicaladdress: ULong, bytecount: UInt, buffer: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_hdvReadGuestMemory(requestor?.value?.toCPointer<ByteVar>(), guestphysicaladdress, bytecount, buffer?.value?.toCPointer<ByteVar>())

public actual fun hdvRegisterDoorbell(requestor: COpaquePointer?, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: Handle): Hresult =
    windowssys_windows_win32_system_hypervisor_hdvRegisterDoorbell(requestor?.value?.toCPointer<ByteVar>(), barindex, baroffset, triggervalue, flags, doorbellevent?.value?.toCPointer<ByteVar>())

public actual fun hdvTeardownDeviceHost(devicehosthandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_hdvTeardownDeviceHost(devicehosthandle?.value?.toCPointer<ByteVar>())

public actual fun hdvUnregisterDoorbell(requestor: COpaquePointer?, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong): Hresult =
    windowssys_windows_win32_system_hypervisor_hdvUnregisterDoorbell(requestor?.value?.toCPointer<ByteVar>(), barindex, baroffset, triggervalue, flags)

public actual fun hdvWriteGuestMemory(requestor: COpaquePointer?, guestphysicaladdress: ULong, bytecount: UInt, buffer: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_hdvWriteGuestMemory(requestor?.value?.toCPointer<ByteVar>(), guestphysicaladdress, bytecount, buffer?.value?.toCPointer<ByteVar>())

public actual fun inKernelSpace(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, inkernelspace: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_inKernelSpace(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, inkernelspace?.value?.toCPointer<ByteVar>())

public actual fun isActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, activevirtualtrustlevelenabled: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_isActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, activevirtualtrustlevelenabled?.value?.toCPointer<ByteVar>())

public actual fun isNestedVirtualizationEnabled(vmsavedstatedumphandle: COpaquePointer?, enabled: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_isNestedVirtualizationEnabled(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), enabled?.value?.toCPointer<ByteVar>())

public actual fun loadSavedStateFile(vmrsfile: Pcwstr, vmsavedstatedumphandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_loadSavedStateFile(vmrsfile?.value?.toCPointer<ByteVar>(), vmsavedstatedumphandle?.value?.toCPointer<ByteVar>())

public actual fun loadSavedStateFiles(binfile: Pcwstr, vsvfile: Pcwstr, vmsavedstatedumphandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_loadSavedStateFiles(binfile?.value?.toCPointer<ByteVar>(), vsvfile?.value?.toCPointer<ByteVar>(), vmsavedstatedumphandle?.value?.toCPointer<ByteVar>())

public actual fun loadSavedStateModuleSymbols(vmsavedstatedumphandle: COpaquePointer?, imagename: Pcstr, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbols(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), imagename?.value?.toCPointer<ByteVar>(), modulename?.value?.toCPointer<ByteVar>(), baseaddress, sizeofbase)

public actual fun loadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: COpaquePointer?, imagename: Pcstr, imagetimestamp: UInt, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_loadSavedStateModuleSymbolsEx(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), imagename?.value?.toCPointer<ByteVar>(), imagetimestamp, modulename?.value?.toCPointer<ByteVar>(), baseaddress, sizeofbase)

public actual fun loadSavedStateSymbolProvider(vmsavedstatedumphandle: COpaquePointer?, usersymbols: Pcwstr, force: Bool): Hresult =
    windowssys_windows_win32_system_hypervisor_loadSavedStateSymbolProvider(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), usersymbols?.value?.toCPointer<ByteVar>(), force)

public actual fun locateSavedStateFiles(vmname: Pcwstr, snapshotname: Pcwstr, binpath: COpaquePointer?, vsvpath: COpaquePointer?, vmrspath: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_locateSavedStateFiles(vmname?.value?.toCPointer<ByteVar>(), snapshotname?.value?.toCPointer<ByteVar>(), binpath?.value?.toCPointer<ByteVar>(), vsvpath?.value?.toCPointer<ByteVar>(), vmrspath?.value?.toCPointer<ByteVar>())

public actual fun readGuestPhysicalAddress(vmsavedstatedumphandle: COpaquePointer?, physicaladdress: ULong, buffer: COpaquePointer?, buffersize: UInt, bytesread: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_readGuestPhysicalAddress(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), physicaladdress, buffer?.value?.toCPointer<ByteVar>(), buffersize, bytesread?.value?.toCPointer<ByteVar>())

public actual fun readGuestRawSavedMemory(vmsavedstatedumphandle: COpaquePointer?, rawsavedmemoryoffset: ULong, buffer: COpaquePointer?, buffersize: UInt, bytesread: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_readGuestRawSavedMemory(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), rawsavedmemoryoffset, buffer?.value?.toCPointer<ByteVar>(), buffersize, bytesread?.value?.toCPointer<ByteVar>())

public actual fun readSavedStateGlobalVariable(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, globalname: Pcstr, buffer: COpaquePointer?, buffersize: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_readSavedStateGlobalVariable(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, globalname?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), buffersize)

public actual fun releaseSavedStateFiles(vmsavedstatedumphandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_releaseSavedStateFiles(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>())

public actual fun releaseSavedStateSymbolProvider(vmsavedstatedumphandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_releaseSavedStateSymbolProvider(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>())

public actual fun resolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, globalname: Pcstr, virtualaddress: COpaquePointer?, size: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_resolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, globalname?.value?.toCPointer<ByteVar>(), virtualaddress?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun scanMemoryForDosImages(vmsavedstatedumphandle: COpaquePointer?, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: COpaquePointer?, foundimagecallback: FoundImageCallback, standaloneaddress: COpaquePointer?, standaloneaddresscount: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_scanMemoryForDosImages(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), vpid, startaddress, endaddress, callbackcontext?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), standaloneaddress?.value?.toCPointer<ByteVar>(), standaloneaddresscount)

public actual fun setMemoryBlockCacheLimit(vmsavedstatedumphandle: COpaquePointer?, memoryblockcachelimit: ULong): Hresult =
    windowssys_windows_win32_system_hypervisor_setMemoryBlockCacheLimit(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), memoryblockcachelimit)

public actual fun setSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: COpaquePointer?, callback: GuestSymbolsProviderDebugInfoCallback): Hresult =
    windowssys_windows_win32_system_hypervisor_setSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wHvAcceptPartitionMigration(migrationhandle: Handle, partition: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvAcceptPartitionMigration(migrationhandle?.value?.toCPointer<ByteVar>(), partition?.value?.toCPointer<ByteVar>())

public actual fun wHvAdviseGpaRange(partition: WhvPartitionHandle, gparanges: COpaquePointer?, gparangescount: UInt, advice: WhvAdviseGpaRangeCode, advicebuffer: COpaquePointer?, advicebuffersizeinbytes: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvAdviseGpaRange(partition, gparanges?.value?.toCPointer<ByteVar>(), gparangescount, advice, advicebuffer?.value?.toCPointer<ByteVar>(), advicebuffersizeinbytes)

public actual fun wHvAllocateVpciResource(providerid: COpaquePointer?, flags: WhvAllocateVpciResourceFlags, resourcedescriptor: COpaquePointer?, resourcedescriptorsizeinbytes: UInt, vpciresource: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvAllocateVpciResource(providerid?.value?.toCPointer<ByteVar>(), flags, resourcedescriptor?.value?.toCPointer<ByteVar>(), resourcedescriptorsizeinbytes, vpciresource?.value?.toCPointer<ByteVar>())

public actual fun wHvCancelPartitionMigration(partition: WhvPartitionHandle): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvCancelPartitionMigration(partition)

public actual fun wHvCancelRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvCancelRunVirtualProcessor(partition, vpindex, flags)

public actual fun wHvCompletePartitionMigration(partition: WhvPartitionHandle): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvCompletePartitionMigration(partition)

public actual fun wHvCreateNotificationPort(partition: WhvPartitionHandle, parameters: COpaquePointer?, eventhandle: Handle, porthandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvCreateNotificationPort(partition, parameters?.value?.toCPointer<ByteVar>(), eventhandle?.value?.toCPointer<ByteVar>(), porthandle?.value?.toCPointer<ByteVar>())

public actual fun wHvCreatePartition(partition: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvCreatePartition(partition?.value?.toCPointer<ByteVar>())

public actual fun wHvCreateTrigger(partition: WhvPartitionHandle, parameters: COpaquePointer?, triggerhandle: COpaquePointer?, eventhandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvCreateTrigger(partition, parameters?.value?.toCPointer<ByteVar>(), triggerhandle?.value?.toCPointer<ByteVar>(), eventhandle?.value?.toCPointer<ByteVar>())

public actual fun wHvCreateVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor(partition, vpindex, flags)

public actual fun wHvCreateVirtualProcessor2(partition: WhvPartitionHandle, vpindex: UInt, properties: COpaquePointer?, propertycount: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvCreateVirtualProcessor2(partition, vpindex, properties?.value?.toCPointer<ByteVar>(), propertycount)

public actual fun wHvCreateVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong, vpciresource: Handle, flags: WhvCreateVpciDeviceFlags, notificationeventhandle: Handle): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvCreateVpciDevice(partition, logicaldeviceid, vpciresource?.value?.toCPointer<ByteVar>(), flags, notificationeventhandle?.value?.toCPointer<ByteVar>())

public actual fun wHvDeleteNotificationPort(partition: WhvPartitionHandle, porthandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvDeleteNotificationPort(partition, porthandle?.value?.toCPointer<ByteVar>())

public actual fun wHvDeletePartition(partition: WhvPartitionHandle): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvDeletePartition(partition)

public actual fun wHvDeleteTrigger(partition: WhvPartitionHandle, triggerhandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvDeleteTrigger(partition, triggerhandle?.value?.toCPointer<ByteVar>())

public actual fun wHvDeleteVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvDeleteVirtualProcessor(partition, vpindex)

public actual fun wHvDeleteVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvDeleteVpciDevice(partition, logicaldeviceid)

public actual fun wHvEmulatorCreateEmulator(callbacks: COpaquePointer?, emulator: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvEmulatorCreateEmulator(callbacks?.value?.toCPointer<ByteVar>(), emulator?.value?.toCPointer<ByteVar>())

public actual fun wHvEmulatorDestroyEmulator(emulator: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvEmulatorDestroyEmulator(emulator?.value?.toCPointer<ByteVar>())

public actual fun wHvEmulatorTryIoEmulation(emulator: COpaquePointer?, context: COpaquePointer?, vpcontext: COpaquePointer?, ioinstructioncontext: COpaquePointer?, emulatorreturnstatus: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvEmulatorTryIoEmulation(emulator?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), vpcontext?.value?.toCPointer<ByteVar>(), ioinstructioncontext?.value?.toCPointer<ByteVar>(), emulatorreturnstatus?.value?.toCPointer<ByteVar>())

public actual fun wHvEmulatorTryMmioEmulation(emulator: COpaquePointer?, context: COpaquePointer?, vpcontext: COpaquePointer?, mmioinstructioncontext: COpaquePointer?, emulatorreturnstatus: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvEmulatorTryMmioEmulation(emulator?.value?.toCPointer<ByteVar>(), context?.value?.toCPointer<ByteVar>(), vpcontext?.value?.toCPointer<ByteVar>(), mmioinstructioncontext?.value?.toCPointer<ByteVar>(), emulatorreturnstatus?.value?.toCPointer<ByteVar>())

public actual fun wHvGetCapability(capabilitycode: WhvCapabilityCode, capabilitybuffer: COpaquePointer?, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvGetCapability(capabilitycode, capabilitybuffer?.value?.toCPointer<ByteVar>(), capabilitybuffersizeinbytes, writtensizeinbytes?.value?.toCPointer<ByteVar>())

public actual fun wHvGetInterruptTargetVpSet(partition: WhvPartitionHandle, destination: ULong, destinationmode: WhvInterruptDestinationMode, targetvps: COpaquePointer?, vpcount: UInt, targetvpcount: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvGetInterruptTargetVpSet(partition, destination, destinationmode, targetvps?.value?.toCPointer<ByteVar>(), vpcount, targetvpcount?.value?.toCPointer<ByteVar>())

public actual fun wHvGetPartitionCounters(partition: WhvPartitionHandle, counterset: WhvPartitionCounterSet, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvGetPartitionCounters(partition, counterset, buffer?.value?.toCPointer<ByteVar>(), buffersizeinbytes, byteswritten?.value?.toCPointer<ByteVar>())

public actual fun wHvGetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: COpaquePointer?, propertybuffersizeinbytes: UInt, writtensizeinbytes: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvGetPartitionProperty(partition, propertycode, propertybuffer?.value?.toCPointer<ByteVar>(), propertybuffersizeinbytes, writtensizeinbytes?.value?.toCPointer<ByteVar>())

public actual fun wHvGetVirtualProcessorCounters(partition: WhvPartitionHandle, vpindex: UInt, counterset: WhvProcessorCounterSet, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCounters(partition, vpindex, counterset, buffer?.value?.toCPointer<ByteVar>(), buffersizeinbytes, byteswritten?.value?.toCPointer<ByteVar>())

public actual fun wHvGetVirtualProcessorCpuidOutput(partition: WhvPartitionHandle, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorCpuidOutput(partition, vpindex, eax, ecx, cpuidoutput?.value?.toCPointer<ByteVar>())

public actual fun wHvGetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt, writtensize: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState(partition, vpindex, state?.value?.toCPointer<ByteVar>(), statesize, writtensize?.value?.toCPointer<ByteVar>())

public actual fun wHvGetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt, writtensize: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorInterruptControllerState2(partition, vpindex, state?.value?.toCPointer<ByteVar>(), statesize, writtensize?.value?.toCPointer<ByteVar>())

public actual fun wHvGetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: COpaquePointer?, registercount: UInt, registervalues: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorRegisters(partition, vpindex, registernames?.value?.toCPointer<ByteVar>(), registercount, registervalues?.value?.toCPointer<ByteVar>())

public actual fun wHvGetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorState(partition, vpindex, statetype, buffer?.value?.toCPointer<ByteVar>(), buffersizeinbytes, byteswritten?.value?.toCPointer<ByteVar>())

public actual fun wHvGetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: COpaquePointer?, buffersizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvGetVirtualProcessorXsaveState(partition, vpindex, buffer?.value?.toCPointer<ByteVar>(), buffersizeinbytes, byteswritten?.value?.toCPointer<ByteVar>())

public actual fun wHvGetVpciDeviceInterruptTarget(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: COpaquePointer?, targetsizeinbytes: UInt, byteswritten: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceInterruptTarget(partition, logicaldeviceid, index, multimessagenumber, target?.value?.toCPointer<ByteVar>(), targetsizeinbytes, byteswritten?.value?.toCPointer<ByteVar>())

public actual fun wHvGetVpciDeviceNotification(partition: WhvPartitionHandle, logicaldeviceid: ULong, notification: COpaquePointer?, notificationsizeinbytes: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceNotification(partition, logicaldeviceid, notification?.value?.toCPointer<ByteVar>(), notificationsizeinbytes)

public actual fun wHvGetVpciDeviceProperty(partition: WhvPartitionHandle, logicaldeviceid: ULong, propertycode: WhvVpciDevicePropertyCode, propertybuffer: COpaquePointer?, propertybuffersizeinbytes: UInt, writtensizeinbytes: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvGetVpciDeviceProperty(partition, logicaldeviceid, propertycode, propertybuffer?.value?.toCPointer<ByteVar>(), propertybuffersizeinbytes, writtensizeinbytes?.value?.toCPointer<ByteVar>())

public actual fun wHvMapGpaRange(partition: WhvPartitionHandle, sourceaddress: COpaquePointer?, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvMapGpaRange(partition, sourceaddress?.value?.toCPointer<ByteVar>(), guestaddress, sizeinbytes, flags)

public actual fun wHvMapGpaRange2(partition: WhvPartitionHandle, process: Handle, sourceaddress: COpaquePointer?, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvMapGpaRange2(partition, process?.value?.toCPointer<ByteVar>(), sourceaddress?.value?.toCPointer<ByteVar>(), guestaddress, sizeinbytes, flags)

public actual fun wHvMapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: COpaquePointer?, msiaddress: COpaquePointer?, msidata: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceInterrupt(partition, logicaldeviceid, index, messagecount, target?.value?.toCPointer<ByteVar>(), msiaddress?.value?.toCPointer<ByteVar>(), msidata?.value?.toCPointer<ByteVar>())

public actual fun wHvMapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong, mappingcount: COpaquePointer?, mappings: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvMapVpciDeviceMmioRanges(partition, logicaldeviceid, mappingcount?.value?.toCPointer<ByteVar>(), mappings?.value?.toCPointer<ByteVar>())

public actual fun wHvPostVirtualProcessorSynicMessage(partition: WhvPartitionHandle, vpindex: UInt, sintindex: UInt, message: COpaquePointer?, messagesizeinbytes: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvPostVirtualProcessorSynicMessage(partition, vpindex, sintindex, message?.value?.toCPointer<ByteVar>(), messagesizeinbytes)

public actual fun wHvQueryGpaRangeDirtyBitmap(partition: WhvPartitionHandle, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: COpaquePointer?, bitmapsizeinbytes: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvQueryGpaRangeDirtyBitmap(partition, guestaddress, rangesizeinbytes, bitmap?.value?.toCPointer<ByteVar>(), bitmapsizeinbytes)

public actual fun wHvReadGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: COpaquePointer?, datasizeinbytes: UInt): Hresult =
    0

public actual fun wHvReadVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: COpaquePointer?, data: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvReadVpciDeviceRegister(partition, logicaldeviceid, register?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())

public actual fun wHvRegisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: COpaquePointer?, eventhandle: Handle): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvRegisterPartitionDoorbellEvent(partition, matchdata?.value?.toCPointer<ByteVar>(), eventhandle?.value?.toCPointer<ByteVar>())

public actual fun wHvRequestInterrupt(partition: WhvPartitionHandle, interrupt: COpaquePointer?, interruptcontrolsize: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvRequestInterrupt(partition, interrupt?.value?.toCPointer<ByteVar>(), interruptcontrolsize)

public actual fun wHvRequestVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvRequestVpciDeviceInterrupt(partition, logicaldeviceid, msiaddress, msidata)

public actual fun wHvResetPartition(partition: WhvPartitionHandle): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvResetPartition(partition)

public actual fun wHvResumePartitionTime(partition: WhvPartitionHandle): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvResumePartitionTime(partition)

public actual fun wHvRetargetVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvRetargetVpciDeviceInterrupt(partition, logicaldeviceid, msiaddress, msidata, target?.value?.toCPointer<ByteVar>())

public actual fun wHvRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, exitcontext: COpaquePointer?, exitcontextsizeinbytes: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvRunVirtualProcessor(partition, vpindex, exitcontext?.value?.toCPointer<ByteVar>(), exitcontextsizeinbytes)

public actual fun wHvSetNotificationPortProperty(partition: WhvPartitionHandle, porthandle: COpaquePointer?, propertycode: WhvNotificationPortPropertyCode, propertyvalue: ULong): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvSetNotificationPortProperty(partition, porthandle?.value?.toCPointer<ByteVar>(), propertycode, propertyvalue)

public actual fun wHvSetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: COpaquePointer?, propertybuffersizeinbytes: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvSetPartitionProperty(partition, propertycode, propertybuffer?.value?.toCPointer<ByteVar>(), propertybuffersizeinbytes)

public actual fun wHvSetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState(partition, vpindex, state?.value?.toCPointer<ByteVar>(), statesize)

public actual fun wHvSetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: COpaquePointer?, statesize: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorInterruptControllerState2(partition, vpindex, state?.value?.toCPointer<ByteVar>(), statesize)

public actual fun wHvSetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: COpaquePointer?, registercount: UInt, registervalues: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorRegisters(partition, vpindex, registernames?.value?.toCPointer<ByteVar>(), registercount, registervalues?.value?.toCPointer<ByteVar>())

public actual fun wHvSetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: COpaquePointer?, buffersizeinbytes: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorState(partition, vpindex, statetype, buffer?.value?.toCPointer<ByteVar>(), buffersizeinbytes)

public actual fun wHvSetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: COpaquePointer?, buffersizeinbytes: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvSetVirtualProcessorXsaveState(partition, vpindex, buffer?.value?.toCPointer<ByteVar>(), buffersizeinbytes)

public actual fun wHvSetVpciDevicePowerState(partition: WhvPartitionHandle, logicaldeviceid: ULong, powerstate: DevicePowerState): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvSetVpciDevicePowerState(partition, logicaldeviceid, powerstate)

public actual fun wHvSetupPartition(partition: WhvPartitionHandle): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvSetupPartition(partition)

public actual fun wHvSignalVirtualProcessorSynicEvent(partition: WhvPartitionHandle, synicevent: WhvSynicEventParameters, newlysignaled: COpaquePointer?): Hresult =
    0

public actual fun wHvStartPartitionMigration(partition: WhvPartitionHandle, migrationhandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvStartPartitionMigration(partition, migrationhandle?.value?.toCPointer<ByteVar>())

public actual fun wHvSuspendPartitionTime(partition: WhvPartitionHandle): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvSuspendPartitionTime(partition)

public actual fun wHvTranslateGva(partition: WhvPartitionHandle, vpindex: UInt, gva: ULong, translateflags: WhvTranslateGvaFlags, translationresult: COpaquePointer?, gpa: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvTranslateGva(partition, vpindex, gva, translateflags, translationresult?.value?.toCPointer<ByteVar>(), gpa?.value?.toCPointer<ByteVar>())

public actual fun wHvUnmapGpaRange(partition: WhvPartitionHandle, guestaddress: ULong, sizeinbytes: ULong): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvUnmapGpaRange(partition, guestaddress, sizeinbytes)

public actual fun wHvUnmapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceInterrupt(partition, logicaldeviceid, index)

public actual fun wHvUnmapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvUnmapVpciDeviceMmioRanges(partition, logicaldeviceid)

public actual fun wHvUnregisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvUnregisterPartitionDoorbellEvent(partition, matchdata?.value?.toCPointer<ByteVar>())

public actual fun wHvUpdateTriggerParameters(partition: WhvPartitionHandle, parameters: COpaquePointer?, triggerhandle: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvUpdateTriggerParameters(partition, parameters?.value?.toCPointer<ByteVar>(), triggerhandle?.value?.toCPointer<ByteVar>())

public actual fun wHvWriteGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: COpaquePointer?, datasizeinbytes: UInt): Hresult =
    0

public actual fun wHvWriteVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: COpaquePointer?, data: COpaquePointer?): Hresult =
    windowssys_windows_win32_system_hypervisor_wHvWriteVpciDeviceRegister(partition, logicaldeviceid, register?.value?.toCPointer<ByteVar>(), data?.value?.toCPointer<ByteVar>())
