@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hypervisor

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.hostcomputesystem.HcsSystem
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorApplyGuestMemoryFix
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorApplyPendingSavedStateFileReplayLog
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorCallStackUnwind
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorFindSavedStateSymbolFieldInType
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorForceActiveVirtualTrustLevel
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorForceArchitecture
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorForceNestedHostMode
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorForcePagingMode
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorGetActiveVirtualTrustLevel
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorGetArchitecture
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorGetEnabledVirtualTrustLevels
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorGetGuestEnabledVirtualTrustLevels
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorGetGuestOsInfo
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorGetGuestPhysicalMemoryChunks
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorGetGuestRawSavedMemorySize
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorGetMemoryBlockCacheLimit
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorGetNestedVirtualizationMode
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorGetPagingMode
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorGetRegisterValue
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolFieldInfo
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolProviderHandle
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolTypeSize
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorGetVpCount
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorGuestPhysicalAddressToRawSavedMemoryOffset
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorGuestVirtualAddressToPhysicalAddress
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorHdvCreateDeviceInstance
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorHdvCreateGuestMemoryAperture
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorHdvCreateSectionBackedMmioRange
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorHdvDeliverGuestInterrupt
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorHdvDestroyGuestMemoryAperture
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorHdvDestroySectionBackedMmioRange
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHost
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHostEx
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorHdvReadGuestMemory
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorHdvRegisterDoorbell
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorHdvTeardownDeviceHost
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorHdvUnregisterDoorbell
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorHdvWriteGuestMemory
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorInKernelSpace
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorIsActiveVirtualTrustLevelEnabled
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorIsNestedVirtualizationEnabled
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorLoadSavedStateFile
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorLoadSavedStateFiles
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbols
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbolsEx
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorLoadSavedStateSymbolProvider
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorLocateSavedStateFiles
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorReadGuestPhysicalAddress
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorReadGuestRawSavedMemory
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorReadSavedStateGlobalVariable
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorReleaseSavedStateFiles
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorReleaseSavedStateSymbolProvider
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorResolveSavedStateGlobalVariableAddress
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorScanMemoryForDosImages
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorSetMemoryBlockCacheLimit
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorSetSavedStateSymbolProviderDebugInfoCallback
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvAcceptPartitionMigration
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvAdviseGpaRange
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvAllocateVpciResource
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvCancelPartitionMigration
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvCancelRunVirtualProcessor
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvCompletePartitionMigration
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvCreateNotificationPort
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvCreatePartition
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvCreateTrigger
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor2
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvCreateVpciDevice
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvDeleteNotificationPort
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvDeletePartition
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvDeleteTrigger
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvEmulatorCreateEmulator
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvEmulatorDestroyEmulator
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvEmulatorTryIoEmulation
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvEmulatorTryMmioEmulation
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvGetCapability
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvGetInterruptTargetVpSet
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvGetPartitionCounters
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvGetPartitionProperty
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCounters
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCpuidOutput
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState2
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorRegisters
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorState
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorXsaveState
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceInterruptTarget
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceNotification
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceProperty
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvMapGpaRange
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvMapGpaRange2
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceInterrupt
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceMmioRanges
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvPostVirtualProcessorSynicMessage
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvQueryGpaRangeDirtyBitmap
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvReadVpciDeviceRegister
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvRegisterPartitionDoorbellEvent
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvRequestInterrupt
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvRequestVpciDeviceInterrupt
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvResetPartition
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvResumePartitionTime
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvRetargetVpciDeviceInterrupt
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvRunVirtualProcessor
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvSetNotificationPortProperty
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvSetPartitionProperty
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState2
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorRegisters
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorState
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorXsaveState
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvSetupPartition
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvStartPartitionMigration
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvTranslateGva
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvUnmapGpaRange
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceInterrupt
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceMmioRanges
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvUnregisterPartitionDoorbellEvent
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvUpdateTriggerParameters
import io.github.kotlinmania.windowssys.windows.win32.system.hypervisor.cinterop.windowssysWindowsWin32SystemHypervisorWHvWriteVpciDeviceRegister
import io.github.kotlinmania.windowssys.windows.win32.system.power.DevicePowerState
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun applyGuestMemoryFix(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualaddress: ULong, fixbuffer: ConstPtr, fixbuffersize: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorApplyGuestMemoryFix(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, virtualaddress, fixbuffer.rawAddress.toCPointer<ByteVar>(), fixbuffersize)

public actual fun applyPendingSavedStateFileReplayLog(vmrsfile: Pcwstr): Hresult =
    windowssysWindowsWin32SystemHypervisorApplyPendingSavedStateFileReplayLog(vmrsfile.rawAddress.toCPointer<ByteVar>())

public actual fun callStackUnwind(vmsavedstatedumphandle: MutPtr, vpid: UInt, imageinfo: ConstPtr, imageinfocount: UInt, framecount: UInt, callstack: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorCallStackUnwind(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, imageinfo.rawAddress.toCPointer<ByteVar>(), imageinfocount, framecount, callstack.rawAddress.toCPointer<ByteVar>())

public actual fun findSavedStateSymbolFieldInType(vmsavedstatedumphandle: MutPtr, vpid: UInt, typename: Pcstr, fieldname: Pcwstr, offset: MutPtr, found: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorFindSavedStateSymbolFieldInType(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, typename.rawAddress.toCPointer<ByteVar>(), fieldname.rawAddress.toCPointer<ByteVar>(), offset.rawAddress.toCPointer<ByteVar>(), found.rawAddress.toCPointer<ByteVar>())

public actual fun forceActiveVirtualTrustLevel(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualtrustlevel: UByte): Hresult =
    windowssysWindowsWin32SystemHypervisorForceActiveVirtualTrustLevel(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, virtualtrustlevel)

public actual fun forceArchitecture(vmsavedstatedumphandle: MutPtr, vpid: UInt, architecture: VirtualProcessorArch): Hresult =
    windowssysWindowsWin32SystemHypervisorForceArchitecture(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, architecture)

public actual fun forceNestedHostMode(vmsavedstatedumphandle: MutPtr, vpid: UInt, hostmode: Bool, oldmode: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorForceNestedHostMode(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, hostmode, oldmode.rawAddress.toCPointer<ByteVar>())

public actual fun forcePagingMode(vmsavedstatedumphandle: MutPtr, vpid: UInt, pagingmode: PagingMode): Hresult =
    windowssysWindowsWin32SystemHypervisorForcePagingMode(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, pagingmode)

public actual fun getActiveVirtualTrustLevel(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualtrustlevel: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorGetActiveVirtualTrustLevel(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, virtualtrustlevel.rawAddress.toCPointer<ByteVar>())

public actual fun getArchitecture(vmsavedstatedumphandle: MutPtr, vpid: UInt, architecture: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorGetArchitecture(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, architecture.rawAddress.toCPointer<ByteVar>())

public actual fun getEnabledVirtualTrustLevels(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualtrustlevels: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorGetEnabledVirtualTrustLevels(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, virtualtrustlevels.rawAddress.toCPointer<ByteVar>())

public actual fun getGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle: MutPtr, virtualtrustlevels: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorGetGuestEnabledVirtualTrustLevels(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), virtualtrustlevels.rawAddress.toCPointer<ByteVar>())

public actual fun getGuestOsInfo(vmsavedstatedumphandle: MutPtr, virtualtrustlevel: UByte, guestosinfo: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorGetGuestOsInfo(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), virtualtrustlevel, guestosinfo.rawAddress.toCPointer<ByteVar>())

public actual fun getGuestPhysicalMemoryChunks(vmsavedstatedumphandle: MutPtr, memorychunkpagesize: MutPtr, memorychunks: MutPtr, memorychunkcount: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorGetGuestPhysicalMemoryChunks(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), memorychunkpagesize.rawAddress.toCPointer<ByteVar>(), memorychunks.rawAddress.toCPointer<ByteVar>(), memorychunkcount.rawAddress.toCPointer<ByteVar>())

public actual fun getGuestRawSavedMemorySize(vmsavedstatedumphandle: MutPtr, guestrawsavedmemorysize: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorGetGuestRawSavedMemorySize(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), guestrawsavedmemorysize.rawAddress.toCPointer<ByteVar>())

public actual fun getMemoryBlockCacheLimit(vmsavedstatedumphandle: MutPtr, memoryblockcachelimit: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorGetMemoryBlockCacheLimit(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), memoryblockcachelimit.rawAddress.toCPointer<ByteVar>())

public actual fun getNestedVirtualizationMode(vmsavedstatedumphandle: MutPtr, vpid: UInt, enabled: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorGetNestedVirtualizationMode(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, enabled.rawAddress.toCPointer<ByteVar>())

public actual fun getPagingMode(vmsavedstatedumphandle: MutPtr, vpid: UInt, pagingmode: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorGetPagingMode(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, pagingmode.rawAddress.toCPointer<ByteVar>())

public actual fun getRegisterValue(vmsavedstatedumphandle: MutPtr, vpid: UInt, registerid: UInt, registervalue: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorGetRegisterValue(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, registerid, registervalue.rawAddress.toCPointer<ByteVar>())

public actual fun getSavedStateSymbolFieldInfo(vmsavedstatedumphandle: MutPtr, vpid: UInt, typename: Pcstr, typefieldinfomap: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolFieldInfo(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, typename.rawAddress.toCPointer<ByteVar>(), typefieldinfomap.rawAddress.toCPointer<ByteVar>())

public actual fun getSavedStateSymbolProviderHandle(vmsavedstatedumphandle: MutPtr): Handle =
    MutPtr(windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolProviderHandle(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getSavedStateSymbolTypeSize(vmsavedstatedumphandle: MutPtr, vpid: UInt, typename: Pcstr, size: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorGetSavedStateSymbolTypeSize(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, typename.rawAddress.toCPointer<ByteVar>(), size.rawAddress.toCPointer<ByteVar>())

public actual fun getVpCount(vmsavedstatedumphandle: MutPtr, vpcount: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorGetVpCount(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpcount.rawAddress.toCPointer<ByteVar>())

public actual fun guestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle: MutPtr, physicaladdress: ULong, rawsavedmemoryoffset: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorGuestPhysicalAddressToRawSavedMemoryOffset(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), physicaladdress, rawsavedmemoryoffset.rawAddress.toCPointer<ByteVar>())

public actual fun guestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle: MutPtr, vpid: UInt, virtualaddress: ULong, physicaladdress: MutPtr, unmappedregionsize: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorGuestVirtualAddressToPhysicalAddress(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, virtualaddress, physicaladdress.rawAddress.toCPointer<ByteVar>(), unmappedregionsize.rawAddress.toCPointer<ByteVar>())

public actual fun hdvCreateDeviceInstance(devicehosthandle: ConstPtr, devicetype: HdvDeviceType, deviceclassid: ConstPtr, deviceinstanceid: ConstPtr, deviceinterface: ConstPtr, devicecontext: ConstPtr, devicehandle: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorHdvCreateDeviceInstance(devicehosthandle.rawAddress.toCPointer<ByteVar>(), devicetype, deviceclassid.rawAddress.toCPointer<ByteVar>(), deviceinstanceid.rawAddress.toCPointer<ByteVar>(), deviceinterface.rawAddress.toCPointer<ByteVar>(), devicecontext.rawAddress.toCPointer<ByteVar>(), devicehandle.rawAddress.toCPointer<ByteVar>())

public actual fun hdvCreateGuestMemoryAperture(requestor: ConstPtr, guestphysicaladdress: ULong, bytecount: UInt, writeprotected: Bool, mappedaddress: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorHdvCreateGuestMemoryAperture(requestor.rawAddress.toCPointer<ByteVar>(), guestphysicaladdress, bytecount, writeprotected, mappedaddress.rawAddress.toCPointer<ByteVar>())

public actual fun hdvCreateSectionBackedMmioRange(requestor: ConstPtr, barindex: HdvPciBarSelector, offsetinpages: ULong, lengthinpages: ULong, mappingflags: HdvMmioMappingFlags, sectionhandle: Handle, sectionoffsetinpages: ULong): Hresult =
    windowssysWindowsWin32SystemHypervisorHdvCreateSectionBackedMmioRange(requestor.rawAddress.toCPointer<ByteVar>(), barindex, offsetinpages, lengthinpages, mappingflags, sectionhandle.rawAddress.toCPointer<ByteVar>(), sectionoffsetinpages)

public actual fun hdvDeliverGuestInterrupt(requestor: ConstPtr, msiaddress: ULong, msidata: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorHdvDeliverGuestInterrupt(requestor.rawAddress.toCPointer<ByteVar>(), msiaddress, msidata)

public actual fun hdvDestroyGuestMemoryAperture(requestor: ConstPtr, mappedaddress: ConstPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorHdvDestroyGuestMemoryAperture(requestor.rawAddress.toCPointer<ByteVar>(), mappedaddress.rawAddress.toCPointer<ByteVar>())

public actual fun hdvDestroySectionBackedMmioRange(requestor: ConstPtr, barindex: HdvPciBarSelector, offsetinpages: ULong): Hresult =
    windowssysWindowsWin32SystemHypervisorHdvDestroySectionBackedMmioRange(requestor.rawAddress.toCPointer<ByteVar>(), barindex, offsetinpages)

public actual fun hdvInitializeDeviceHost(computesystem: HcsSystem, devicehosthandle: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHost(computesystem.rawAddress.toCPointer<ByteVar>(), devicehosthandle.rawAddress.toCPointer<ByteVar>())

public actual fun hdvInitializeDeviceHostEx(computesystem: HcsSystem, flags: HdvDeviceHostFlags, devicehosthandle: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorHdvInitializeDeviceHostEx(computesystem.rawAddress.toCPointer<ByteVar>(), flags, devicehosthandle.rawAddress.toCPointer<ByteVar>())

public actual fun hdvReadGuestMemory(requestor: ConstPtr, guestphysicaladdress: ULong, bytecount: UInt, buffer: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorHdvReadGuestMemory(requestor.rawAddress.toCPointer<ByteVar>(), guestphysicaladdress, bytecount, buffer.rawAddress.toCPointer<ByteVar>())

public actual fun hdvRegisterDoorbell(requestor: ConstPtr, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong, doorbellevent: Handle): Hresult =
    windowssysWindowsWin32SystemHypervisorHdvRegisterDoorbell(requestor.rawAddress.toCPointer<ByteVar>(), barindex, baroffset, triggervalue, flags, doorbellevent.rawAddress.toCPointer<ByteVar>())

public actual fun hdvTeardownDeviceHost(devicehosthandle: ConstPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorHdvTeardownDeviceHost(devicehosthandle.rawAddress.toCPointer<ByteVar>())

public actual fun hdvUnregisterDoorbell(requestor: ConstPtr, barindex: HdvPciBarSelector, baroffset: ULong, triggervalue: ULong, flags: ULong): Hresult =
    windowssysWindowsWin32SystemHypervisorHdvUnregisterDoorbell(requestor.rawAddress.toCPointer<ByteVar>(), barindex, baroffset, triggervalue, flags)

public actual fun hdvWriteGuestMemory(requestor: ConstPtr, guestphysicaladdress: ULong, bytecount: UInt, buffer: ConstPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorHdvWriteGuestMemory(requestor.rawAddress.toCPointer<ByteVar>(), guestphysicaladdress, bytecount, buffer.rawAddress.toCPointer<ByteVar>())

public actual fun inKernelSpace(vmsavedstatedumphandle: MutPtr, vpid: UInt, inkernelspace: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorInKernelSpace(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, inkernelspace.rawAddress.toCPointer<ByteVar>())

public actual fun isActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle: MutPtr, vpid: UInt, activevirtualtrustlevelenabled: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorIsActiveVirtualTrustLevelEnabled(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, activevirtualtrustlevelenabled.rawAddress.toCPointer<ByteVar>())

public actual fun isNestedVirtualizationEnabled(vmsavedstatedumphandle: MutPtr, enabled: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorIsNestedVirtualizationEnabled(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), enabled.rawAddress.toCPointer<ByteVar>())

public actual fun loadSavedStateFile(vmrsfile: Pcwstr, vmsavedstatedumphandle: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorLoadSavedStateFile(vmrsfile.rawAddress.toCPointer<ByteVar>(), vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>())

public actual fun loadSavedStateFiles(binfile: Pcwstr, vsvfile: Pcwstr, vmsavedstatedumphandle: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorLoadSavedStateFiles(binfile.rawAddress.toCPointer<ByteVar>(), vsvfile.rawAddress.toCPointer<ByteVar>(), vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>())

public actual fun loadSavedStateModuleSymbols(vmsavedstatedumphandle: MutPtr, imagename: Pcstr, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbols(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), imagename.rawAddress.toCPointer<ByteVar>(), modulename.rawAddress.toCPointer<ByteVar>(), baseaddress, sizeofbase)

public actual fun loadSavedStateModuleSymbolsEx(vmsavedstatedumphandle: MutPtr, imagename: Pcstr, imagetimestamp: UInt, modulename: Pcstr, baseaddress: ULong, sizeofbase: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorLoadSavedStateModuleSymbolsEx(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), imagename.rawAddress.toCPointer<ByteVar>(), imagetimestamp, modulename.rawAddress.toCPointer<ByteVar>(), baseaddress, sizeofbase)

public actual fun loadSavedStateSymbolProvider(vmsavedstatedumphandle: MutPtr, usersymbols: Pcwstr, force: Bool): Hresult =
    windowssysWindowsWin32SystemHypervisorLoadSavedStateSymbolProvider(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), usersymbols.rawAddress.toCPointer<ByteVar>(), force)

public actual fun locateSavedStateFiles(vmname: Pcwstr, snapshotname: Pcwstr, binpath: MutPtr, vsvpath: MutPtr, vmrspath: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorLocateSavedStateFiles(vmname.rawAddress.toCPointer<ByteVar>(), snapshotname.rawAddress.toCPointer<ByteVar>(), binpath.rawAddress.toCPointer<ByteVar>(), vsvpath.rawAddress.toCPointer<ByteVar>(), vmrspath.rawAddress.toCPointer<ByteVar>())

public actual fun readGuestPhysicalAddress(vmsavedstatedumphandle: MutPtr, physicaladdress: ULong, buffer: MutPtr, buffersize: UInt, bytesread: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorReadGuestPhysicalAddress(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), physicaladdress, buffer.rawAddress.toCPointer<ByteVar>(), buffersize, bytesread.rawAddress.toCPointer<ByteVar>())

public actual fun readGuestRawSavedMemory(vmsavedstatedumphandle: MutPtr, rawsavedmemoryoffset: ULong, buffer: MutPtr, buffersize: UInt, bytesread: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorReadGuestRawSavedMemory(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), rawsavedmemoryoffset, buffer.rawAddress.toCPointer<ByteVar>(), buffersize, bytesread.rawAddress.toCPointer<ByteVar>())

public actual fun readSavedStateGlobalVariable(vmsavedstatedumphandle: MutPtr, vpid: UInt, globalname: Pcstr, buffer: MutPtr, buffersize: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorReadSavedStateGlobalVariable(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, globalname.rawAddress.toCPointer<ByteVar>(), buffer.rawAddress.toCPointer<ByteVar>(), buffersize)

public actual fun releaseSavedStateFiles(vmsavedstatedumphandle: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorReleaseSavedStateFiles(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>())

public actual fun releaseSavedStateSymbolProvider(vmsavedstatedumphandle: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorReleaseSavedStateSymbolProvider(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>())

public actual fun resolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle: MutPtr, vpid: UInt, globalname: Pcstr, virtualaddress: MutPtr, size: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorResolveSavedStateGlobalVariableAddress(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, globalname.rawAddress.toCPointer<ByteVar>(), virtualaddress.rawAddress.toCPointer<ByteVar>(), size.rawAddress.toCPointer<ByteVar>())

public actual fun scanMemoryForDosImages(vmsavedstatedumphandle: MutPtr, vpid: UInt, startaddress: ULong, endaddress: ULong, callbackcontext: MutPtr, foundimagecallback: FoundImageCallback, standaloneaddress: ConstPtr, standaloneaddresscount: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorScanMemoryForDosImages(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), vpid, startaddress, endaddress, callbackcontext.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), standaloneaddress.rawAddress.toCPointer<ByteVar>(), standaloneaddresscount)

public actual fun setMemoryBlockCacheLimit(vmsavedstatedumphandle: MutPtr, memoryblockcachelimit: ULong): Hresult =
    windowssysWindowsWin32SystemHypervisorSetMemoryBlockCacheLimit(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), memoryblockcachelimit)

public actual fun setSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle: MutPtr, callback: GuestSymbolsProviderDebugInfoCallback): Hresult =
    windowssysWindowsWin32SystemHypervisorSetSavedStateSymbolProviderDebugInfoCallback(vmsavedstatedumphandle.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun wHvAcceptPartitionMigration(migrationhandle: Handle, partition: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvAcceptPartitionMigration(migrationhandle.rawAddress.toCPointer<ByteVar>(), partition.rawAddress.toCPointer<ByteVar>())

public actual fun wHvAdviseGpaRange(partition: WhvPartitionHandle, gparanges: ConstPtr, gparangescount: UInt, advice: WhvAdviseGpaRangeCode, advicebuffer: ConstPtr, advicebuffersizeinbytes: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvAdviseGpaRange(partition, gparanges.rawAddress.toCPointer<ByteVar>(), gparangescount, advice, advicebuffer.rawAddress.toCPointer<ByteVar>(), advicebuffersizeinbytes)

public actual fun wHvAllocateVpciResource(providerid: ConstPtr, flags: WhvAllocateVpciResourceFlags, resourcedescriptor: ConstPtr, resourcedescriptorsizeinbytes: UInt, vpciresource: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvAllocateVpciResource(providerid.rawAddress.toCPointer<ByteVar>(), flags, resourcedescriptor.rawAddress.toCPointer<ByteVar>(), resourcedescriptorsizeinbytes, vpciresource.rawAddress.toCPointer<ByteVar>())

public actual fun wHvCancelPartitionMigration(partition: WhvPartitionHandle): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvCancelPartitionMigration(partition)

public actual fun wHvCancelRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvCancelRunVirtualProcessor(partition, vpindex, flags)

public actual fun wHvCompletePartitionMigration(partition: WhvPartitionHandle): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvCompletePartitionMigration(partition)

public actual fun wHvCreateNotificationPort(partition: WhvPartitionHandle, parameters: ConstPtr, eventhandle: Handle, porthandle: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvCreateNotificationPort(partition, parameters.rawAddress.toCPointer<ByteVar>(), eventhandle.rawAddress.toCPointer<ByteVar>(), porthandle.rawAddress.toCPointer<ByteVar>())

public actual fun wHvCreatePartition(partition: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvCreatePartition(partition.rawAddress.toCPointer<ByteVar>())

public actual fun wHvCreateTrigger(partition: WhvPartitionHandle, parameters: ConstPtr, triggerhandle: MutPtr, eventhandle: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvCreateTrigger(partition, parameters.rawAddress.toCPointer<ByteVar>(), triggerhandle.rawAddress.toCPointer<ByteVar>(), eventhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wHvCreateVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, flags: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor(partition, vpindex, flags)

public actual fun wHvCreateVirtualProcessor2(partition: WhvPartitionHandle, vpindex: UInt, properties: ConstPtr, propertycount: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvCreateVirtualProcessor2(partition, vpindex, properties.rawAddress.toCPointer<ByteVar>(), propertycount)

public actual fun wHvCreateVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong, vpciresource: Handle, flags: WhvCreateVpciDeviceFlags, notificationeventhandle: Handle): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvCreateVpciDevice(partition, logicaldeviceid, vpciresource.rawAddress.toCPointer<ByteVar>(), flags, notificationeventhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wHvDeleteNotificationPort(partition: WhvPartitionHandle, porthandle: ConstPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvDeleteNotificationPort(partition, porthandle.rawAddress.toCPointer<ByteVar>())

public actual fun wHvDeletePartition(partition: WhvPartitionHandle): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvDeletePartition(partition)

public actual fun wHvDeleteTrigger(partition: WhvPartitionHandle, triggerhandle: ConstPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvDeleteTrigger(partition, triggerhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wHvDeleteVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvDeleteVirtualProcessor(partition, vpindex)

public actual fun wHvDeleteVpciDevice(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvDeleteVpciDevice(partition, logicaldeviceid)

public actual fun wHvEmulatorCreateEmulator(callbacks: ConstPtr, emulator: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvEmulatorCreateEmulator(callbacks.rawAddress.toCPointer<ByteVar>(), emulator.rawAddress.toCPointer<ByteVar>())

public actual fun wHvEmulatorDestroyEmulator(emulator: ConstPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvEmulatorDestroyEmulator(emulator.rawAddress.toCPointer<ByteVar>())

public actual fun wHvEmulatorTryIoEmulation(emulator: ConstPtr, context: ConstPtr, vpcontext: ConstPtr, ioinstructioncontext: ConstPtr, emulatorreturnstatus: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvEmulatorTryIoEmulation(emulator.rawAddress.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>(), vpcontext.rawAddress.toCPointer<ByteVar>(), ioinstructioncontext.rawAddress.toCPointer<ByteVar>(), emulatorreturnstatus.rawAddress.toCPointer<ByteVar>())

public actual fun wHvEmulatorTryMmioEmulation(emulator: ConstPtr, context: ConstPtr, vpcontext: ConstPtr, mmioinstructioncontext: ConstPtr, emulatorreturnstatus: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvEmulatorTryMmioEmulation(emulator.rawAddress.toCPointer<ByteVar>(), context.rawAddress.toCPointer<ByteVar>(), vpcontext.rawAddress.toCPointer<ByteVar>(), mmioinstructioncontext.rawAddress.toCPointer<ByteVar>(), emulatorreturnstatus.rawAddress.toCPointer<ByteVar>())

public actual fun wHvGetCapability(capabilitycode: WhvCapabilityCode, capabilitybuffer: MutPtr, capabilitybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvGetCapability(capabilitycode, capabilitybuffer.rawAddress.toCPointer<ByteVar>(), capabilitybuffersizeinbytes, writtensizeinbytes.rawAddress.toCPointer<ByteVar>())

public actual fun wHvGetInterruptTargetVpSet(partition: WhvPartitionHandle, destination: ULong, destinationmode: WhvInterruptDestinationMode, targetvps: MutPtr, vpcount: UInt, targetvpcount: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvGetInterruptTargetVpSet(partition, destination, destinationmode, targetvps.rawAddress.toCPointer<ByteVar>(), vpcount, targetvpcount.rawAddress.toCPointer<ByteVar>())

public actual fun wHvGetPartitionCounters(partition: WhvPartitionHandle, counterset: WhvPartitionCounterSet, buffer: MutPtr, buffersizeinbytes: UInt, byteswritten: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvGetPartitionCounters(partition, counterset, buffer.rawAddress.toCPointer<ByteVar>(), buffersizeinbytes, byteswritten.rawAddress.toCPointer<ByteVar>())

public actual fun wHvGetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: MutPtr, propertybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvGetPartitionProperty(partition, propertycode, propertybuffer.rawAddress.toCPointer<ByteVar>(), propertybuffersizeinbytes, writtensizeinbytes.rawAddress.toCPointer<ByteVar>())

public actual fun wHvGetVirtualProcessorCounters(partition: WhvPartitionHandle, vpindex: UInt, counterset: WhvProcessorCounterSet, buffer: MutPtr, buffersizeinbytes: UInt, byteswritten: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCounters(partition, vpindex, counterset, buffer.rawAddress.toCPointer<ByteVar>(), buffersizeinbytes, byteswritten.rawAddress.toCPointer<ByteVar>())

public actual fun wHvGetVirtualProcessorCpuidOutput(partition: WhvPartitionHandle, vpindex: UInt, eax: UInt, ecx: UInt, cpuidoutput: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorCpuidOutput(partition, vpindex, eax, ecx, cpuidoutput.rawAddress.toCPointer<ByteVar>())

public actual fun wHvGetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: MutPtr, statesize: UInt, writtensize: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState(partition, vpindex, state.rawAddress.toCPointer<ByteVar>(), statesize, writtensize.rawAddress.toCPointer<ByteVar>())

public actual fun wHvGetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: MutPtr, statesize: UInt, writtensize: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorInterruptControllerState2(partition, vpindex, state.rawAddress.toCPointer<ByteVar>(), statesize, writtensize.rawAddress.toCPointer<ByteVar>())

public actual fun wHvGetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: ConstPtr, registercount: UInt, registervalues: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorRegisters(partition, vpindex, registernames.rawAddress.toCPointer<ByteVar>(), registercount, registervalues.rawAddress.toCPointer<ByteVar>())

public actual fun wHvGetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: MutPtr, buffersizeinbytes: UInt, byteswritten: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorState(partition, vpindex, statetype, buffer.rawAddress.toCPointer<ByteVar>(), buffersizeinbytes, byteswritten.rawAddress.toCPointer<ByteVar>())

public actual fun wHvGetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: MutPtr, buffersizeinbytes: UInt, byteswritten: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvGetVirtualProcessorXsaveState(partition, vpindex, buffer.rawAddress.toCPointer<ByteVar>(), buffersizeinbytes, byteswritten.rawAddress.toCPointer<ByteVar>())

public actual fun wHvGetVpciDeviceInterruptTarget(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, multimessagenumber: UInt, target: MutPtr, targetsizeinbytes: UInt, byteswritten: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceInterruptTarget(partition, logicaldeviceid, index, multimessagenumber, target.rawAddress.toCPointer<ByteVar>(), targetsizeinbytes, byteswritten.rawAddress.toCPointer<ByteVar>())

public actual fun wHvGetVpciDeviceNotification(partition: WhvPartitionHandle, logicaldeviceid: ULong, notification: MutPtr, notificationsizeinbytes: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceNotification(partition, logicaldeviceid, notification.rawAddress.toCPointer<ByteVar>(), notificationsizeinbytes)

public actual fun wHvGetVpciDeviceProperty(partition: WhvPartitionHandle, logicaldeviceid: ULong, propertycode: WhvVpciDevicePropertyCode, propertybuffer: MutPtr, propertybuffersizeinbytes: UInt, writtensizeinbytes: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvGetVpciDeviceProperty(partition, logicaldeviceid, propertycode, propertybuffer.rawAddress.toCPointer<ByteVar>(), propertybuffersizeinbytes, writtensizeinbytes.rawAddress.toCPointer<ByteVar>())

public actual fun wHvMapGpaRange(partition: WhvPartitionHandle, sourceaddress: ConstPtr, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvMapGpaRange(partition, sourceaddress.rawAddress.toCPointer<ByteVar>(), guestaddress, sizeinbytes, flags)

public actual fun wHvMapGpaRange2(partition: WhvPartitionHandle, process: Handle, sourceaddress: ConstPtr, guestaddress: ULong, sizeinbytes: ULong, flags: WhvMapGpaRangeFlags): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvMapGpaRange2(partition, process.rawAddress.toCPointer<ByteVar>(), sourceaddress.rawAddress.toCPointer<ByteVar>(), guestaddress, sizeinbytes, flags)

public actual fun wHvMapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt, messagecount: UInt, target: ConstPtr, msiaddress: MutPtr, msidata: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceInterrupt(partition, logicaldeviceid, index, messagecount, target.rawAddress.toCPointer<ByteVar>(), msiaddress.rawAddress.toCPointer<ByteVar>(), msidata.rawAddress.toCPointer<ByteVar>())

public actual fun wHvMapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong, mappingcount: MutPtr, mappings: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvMapVpciDeviceMmioRanges(partition, logicaldeviceid, mappingcount.rawAddress.toCPointer<ByteVar>(), mappings.rawAddress.toCPointer<ByteVar>())

public actual fun wHvPostVirtualProcessorSynicMessage(partition: WhvPartitionHandle, vpindex: UInt, sintindex: UInt, message: ConstPtr, messagesizeinbytes: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvPostVirtualProcessorSynicMessage(partition, vpindex, sintindex, message.rawAddress.toCPointer<ByteVar>(), messagesizeinbytes)

public actual fun wHvQueryGpaRangeDirtyBitmap(partition: WhvPartitionHandle, guestaddress: ULong, rangesizeinbytes: ULong, bitmap: MutPtr, bitmapsizeinbytes: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvQueryGpaRangeDirtyBitmap(partition, guestaddress, rangesizeinbytes, bitmap.rawAddress.toCPointer<ByteVar>(), bitmapsizeinbytes)

public actual fun wHvReadGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: MutPtr, datasizeinbytes: UInt): Hresult =
    0

public actual fun wHvReadVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: ConstPtr, data: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvReadVpciDeviceRegister(partition, logicaldeviceid, register.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>())

public actual fun wHvRegisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: ConstPtr, eventhandle: Handle): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvRegisterPartitionDoorbellEvent(partition, matchdata.rawAddress.toCPointer<ByteVar>(), eventhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wHvRequestInterrupt(partition: WhvPartitionHandle, interrupt: ConstPtr, interruptcontrolsize: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvRequestInterrupt(partition, interrupt.rawAddress.toCPointer<ByteVar>(), interruptcontrolsize)

public actual fun wHvRequestVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvRequestVpciDeviceInterrupt(partition, logicaldeviceid, msiaddress, msidata)

public actual fun wHvResetPartition(partition: WhvPartitionHandle): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvResetPartition(partition)

public actual fun wHvResumePartitionTime(partition: WhvPartitionHandle): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvResumePartitionTime(partition)

public actual fun wHvRetargetVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, msiaddress: ULong, msidata: UInt, target: ConstPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvRetargetVpciDeviceInterrupt(partition, logicaldeviceid, msiaddress, msidata, target.rawAddress.toCPointer<ByteVar>())

public actual fun wHvRunVirtualProcessor(partition: WhvPartitionHandle, vpindex: UInt, exitcontext: MutPtr, exitcontextsizeinbytes: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvRunVirtualProcessor(partition, vpindex, exitcontext.rawAddress.toCPointer<ByteVar>(), exitcontextsizeinbytes)

public actual fun wHvSetNotificationPortProperty(partition: WhvPartitionHandle, porthandle: ConstPtr, propertycode: WhvNotificationPortPropertyCode, propertyvalue: ULong): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvSetNotificationPortProperty(partition, porthandle.rawAddress.toCPointer<ByteVar>(), propertycode, propertyvalue)

public actual fun wHvSetPartitionProperty(partition: WhvPartitionHandle, propertycode: WhvPartitionPropertyCode, propertybuffer: ConstPtr, propertybuffersizeinbytes: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvSetPartitionProperty(partition, propertycode, propertybuffer.rawAddress.toCPointer<ByteVar>(), propertybuffersizeinbytes)

public actual fun wHvSetVirtualProcessorInterruptControllerState(partition: WhvPartitionHandle, vpindex: UInt, state: ConstPtr, statesize: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState(partition, vpindex, state.rawAddress.toCPointer<ByteVar>(), statesize)

public actual fun wHvSetVirtualProcessorInterruptControllerState2(partition: WhvPartitionHandle, vpindex: UInt, state: ConstPtr, statesize: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorInterruptControllerState2(partition, vpindex, state.rawAddress.toCPointer<ByteVar>(), statesize)

public actual fun wHvSetVirtualProcessorRegisters(partition: WhvPartitionHandle, vpindex: UInt, registernames: ConstPtr, registercount: UInt, registervalues: ConstPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorRegisters(partition, vpindex, registernames.rawAddress.toCPointer<ByteVar>(), registercount, registervalues.rawAddress.toCPointer<ByteVar>())

public actual fun wHvSetVirtualProcessorState(partition: WhvPartitionHandle, vpindex: UInt, statetype: WhvVirtualProcessorStateType, buffer: ConstPtr, buffersizeinbytes: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorState(partition, vpindex, statetype, buffer.rawAddress.toCPointer<ByteVar>(), buffersizeinbytes)

public actual fun wHvSetVirtualProcessorXsaveState(partition: WhvPartitionHandle, vpindex: UInt, buffer: ConstPtr, buffersizeinbytes: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvSetVirtualProcessorXsaveState(partition, vpindex, buffer.rawAddress.toCPointer<ByteVar>(), buffersizeinbytes)

public actual fun wHvSetVpciDevicePowerState(partition: WhvPartitionHandle, logicaldeviceid: ULong, powerstate: DevicePowerState): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvSetVpciDevicePowerState(partition, logicaldeviceid, powerstate)

public actual fun wHvSetupPartition(partition: WhvPartitionHandle): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvSetupPartition(partition)

public actual fun wHvSignalVirtualProcessorSynicEvent(partition: WhvPartitionHandle, synicevent: WhvSynicEventParameters, newlysignaled: MutPtr): Hresult =
    0

public actual fun wHvStartPartitionMigration(partition: WhvPartitionHandle, migrationhandle: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvStartPartitionMigration(partition, migrationhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wHvSuspendPartitionTime(partition: WhvPartitionHandle): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvSuspendPartitionTime(partition)

public actual fun wHvTranslateGva(partition: WhvPartitionHandle, vpindex: UInt, gva: ULong, translateflags: WhvTranslateGvaFlags, translationresult: MutPtr, gpa: MutPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvTranslateGva(partition, vpindex, gva, translateflags, translationresult.rawAddress.toCPointer<ByteVar>(), gpa.rawAddress.toCPointer<ByteVar>())

public actual fun wHvUnmapGpaRange(partition: WhvPartitionHandle, guestaddress: ULong, sizeinbytes: ULong): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvUnmapGpaRange(partition, guestaddress, sizeinbytes)

public actual fun wHvUnmapVpciDeviceInterrupt(partition: WhvPartitionHandle, logicaldeviceid: ULong, index: UInt): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceInterrupt(partition, logicaldeviceid, index)

public actual fun wHvUnmapVpciDeviceMmioRanges(partition: WhvPartitionHandle, logicaldeviceid: ULong): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvUnmapVpciDeviceMmioRanges(partition, logicaldeviceid)

public actual fun wHvUnregisterPartitionDoorbellEvent(partition: WhvPartitionHandle, matchdata: ConstPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvUnregisterPartitionDoorbellEvent(partition, matchdata.rawAddress.toCPointer<ByteVar>())

public actual fun wHvUpdateTriggerParameters(partition: WhvPartitionHandle, parameters: ConstPtr, triggerhandle: ConstPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvUpdateTriggerParameters(partition, parameters.rawAddress.toCPointer<ByteVar>(), triggerhandle.rawAddress.toCPointer<ByteVar>())

public actual fun wHvWriteGpaRange(partition: WhvPartitionHandle, vpindex: UInt, guestaddress: ULong, controls: WhvAccessGpaControls, data: ConstPtr, datasizeinbytes: UInt): Hresult =
    0

public actual fun wHvWriteVpciDeviceRegister(partition: WhvPartitionHandle, logicaldeviceid: ULong, register: ConstPtr, data: ConstPtr): Hresult =
    windowssysWindowsWin32SystemHypervisorWHvWriteVpciDeviceRegister(partition, logicaldeviceid, register.rawAddress.toCPointer<ByteVar>(), data.rawAddress.toCPointer<ByteVar>())
