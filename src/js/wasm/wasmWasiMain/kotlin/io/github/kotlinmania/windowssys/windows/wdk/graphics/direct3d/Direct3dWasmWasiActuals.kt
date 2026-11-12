@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.graphics.direct3d

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.windows.wdk.foundation.ObjectAttributes
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun d3DKMTAcquireKeyedMutex(param0: MutPtr<D3dkmtAcquirekeyedmutex>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTAcquireKeyedMutex")

public actual fun d3DKMTAcquireKeyedMutex2(param0: MutPtr<D3dkmtAcquirekeyedmutex2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTAcquireKeyedMutex2")

public actual fun d3DKMTAdjustFullscreenGamma(param0: ConstPtr<D3dkmtAdjustfullscreengamma>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTAdjustFullscreenGamma")

public actual fun d3DKMTCancelPresents(param0: ConstPtr<D3dkmtCancelPresents>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCancelPresents")

public actual fun d3DKMTChangeSurfacePointer(param0: ConstPtr<D3dkmtChangesurfacepointer>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTChangeSurfacePointer")

public actual fun d3DKMTChangeVideoMemoryReservation(param0: ConstPtr<D3dkmtChangevideomemoryreservation>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTChangeVideoMemoryReservation")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckExclusiveOwnership")
private external fun wasiWindowssysWindowsWdkGraphicsDirect3dD3DKMTCheckExclusiveOwnership(): Int

public actual fun d3DKMTCheckExclusiveOwnership(): Boolean =
    (wasiWindowssysWindowsWdkGraphicsDirect3dD3DKMTCheckExclusiveOwnership() != 0)

public actual fun d3DKMTCheckMonitorPowerState(param0: ConstPtr<D3dkmtCheckmonitorpowerstate>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMonitorPowerState")

public actual fun d3DKMTCheckMultiPlaneOverlaySupport(param0: MutPtr<D3dkmtCheckmultiplaneoverlaysupport>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMultiPlaneOverlaySupport")

public actual fun d3DKMTCheckMultiPlaneOverlaySupport2(param0: MutPtr<D3dkmtCheckmultiplaneoverlaysupport2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMultiPlaneOverlaySupport2")

public actual fun d3DKMTCheckMultiPlaneOverlaySupport3(param0: MutPtr<D3dkmtCheckmultiplaneoverlaysupport3>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckMultiPlaneOverlaySupport3")

public actual fun d3DKMTCheckOcclusion(param0: ConstPtr<D3dkmtCheckocclusion>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckOcclusion")

public actual fun d3DKMTCheckSharedResourceAccess(param0: ConstPtr<D3dkmtChecksharedresourceaccess>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckSharedResourceAccess")

public actual fun d3DKMTCheckVidPnExclusiveOwnership(param0: ConstPtr<D3dkmtCheckvidpnexclusiveownership>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCheckVidPnExclusiveOwnership")

public actual fun d3DKMTCloseAdapter(param0: ConstPtr<D3dkmtCloseadapter>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCloseAdapter")

public actual fun d3DKMTConfigureSharedResource(param0: ConstPtr<D3dkmtConfiguresharedresource>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTConfigureSharedResource")

public actual fun d3DKMTCreateAllocation(param0: MutPtr<D3dkmtCreateallocation>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateAllocation")

public actual fun d3DKMTCreateAllocation2(param0: MutPtr<D3dkmtCreateallocation>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateAllocation2")

public actual fun d3DKMTCreateContext(param0: MutPtr<D3dkmtCreatecontext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateContext")

public actual fun d3DKMTCreateContextVirtual(param0: ConstPtr<D3dkmtCreatecontextvirtual>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateContextVirtual")

public actual fun d3DKMTCreateDCFromMemory(param0: MutPtr<D3dkmtCreatedcfrommemory>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateDCFromMemory")

public actual fun d3DKMTCreateDevice(param0: MutPtr<D3dkmtCreatedevice>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateDevice")

public actual fun d3DKMTCreateHwContext(param0: MutPtr<D3dkmtCreatehwcontext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateHwContext")

public actual fun d3DKMTCreateHwQueue(param0: MutPtr<D3dkmtCreatehwqueue>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateHwQueue")

public actual fun d3DKMTCreateKeyedMutex(param0: MutPtr<D3dkmtCreatekeyedmutex>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateKeyedMutex")

public actual fun d3DKMTCreateKeyedMutex2(param0: MutPtr<D3dkmtCreatekeyedmutex2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateKeyedMutex2")

public actual fun d3DKMTCreateOutputDupl(param0: ConstPtr<D3dkmtCreateOutputdupl>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateOutputDupl")

public actual fun d3DKMTCreateOverlay(param0: MutPtr<D3dkmtCreateoverlay>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateOverlay")

public actual fun d3DKMTCreatePagingQueue(param0: MutPtr<D3dkmtCreatepagingqueue>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCreatePagingQueue")

public actual fun d3DKMTCreateProtectedSession(param0: MutPtr<D3dkmtCreateprotectedsession>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateProtectedSession")

public actual fun d3DKMTCreateSynchronizationObject(param0: MutPtr<D3dkmtCreatesynchronizationobject>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateSynchronizationObject")

public actual fun d3DKMTCreateSynchronizationObject2(param0: MutPtr<D3dkmtCreatesynchronizationobject2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTCreateSynchronizationObject2")

public actual fun d3DKMTDestroyAllocation(param0: ConstPtr<D3dkmtDestroyallocation>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyAllocation")

public actual fun d3DKMTDestroyAllocation2(param0: ConstPtr<D3dkmtDestroyallocation2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyAllocation2")

public actual fun d3DKMTDestroyContext(param0: ConstPtr<D3dkmtDestroycontext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyContext")

public actual fun d3DKMTDestroyDCFromMemory(param0: ConstPtr<D3dkmtDestroydcfrommemory>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyDCFromMemory")

public actual fun d3DKMTDestroyDevice(param0: ConstPtr<D3dkmtDestroydevice>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyDevice")

public actual fun d3DKMTDestroyHwContext(param0: ConstPtr<D3dkmtDestroyhwcontext>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyHwContext")

public actual fun d3DKMTDestroyHwQueue(param0: ConstPtr<D3dkmtDestroyhwqueue>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyHwQueue")

public actual fun d3DKMTDestroyKeyedMutex(param0: ConstPtr<D3dkmtDestroykeyedmutex>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyKeyedMutex")

public actual fun d3DKMTDestroyOutputDupl(param0: ConstPtr<D3dkmtDestroyOutputdupl>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyOutputDupl")

public actual fun d3DKMTDestroyOverlay(param0: ConstPtr<D3dkmtDestroyoverlay>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyOverlay")

public actual fun d3DKMTDestroyPagingQueue(param0: MutPtr<D3dddiDestroypagingqueue>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyPagingQueue")

public actual fun d3DKMTDestroyProtectedSession(param0: MutPtr<D3dkmtDestroyprotectedsession>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroyProtectedSession")

public actual fun d3DKMTDestroySynchronizationObject(param0: ConstPtr<D3dkmtDestroysynchronizationobject>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTDestroySynchronizationObject")

public actual fun d3DKMTEnumAdapters(param0: MutPtr<D3dkmtEnumadapters>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTEnumAdapters")

public actual fun d3DKMTEnumAdapters2(param0: MutPtr<D3dkmtEnumadapters2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTEnumAdapters2")

public actual fun d3DKMTEnumAdapters3(param0: MutPtr<D3dkmtEnumadapters3>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTEnumAdapters3")

public actual fun d3DKMTEscape(param0: ConstPtr<D3dkmtEscape>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTEscape")

public actual fun d3DKMTEvict(param0: MutPtr<D3dkmtEvict>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTEvict")

public actual fun d3DKMTFlipOverlay(param0: ConstPtr<D3dkmtFlipoverlay>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTFlipOverlay")

public actual fun d3DKMTFlushHeapTransitions(param0: ConstPtr<D3dkmtFlushheaptransitions>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTFlushHeapTransitions")

public actual fun d3DKMTFreeGpuVirtualAddress(param0: ConstPtr<D3dkmtFreegpuvirtualaddress>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTFreeGpuVirtualAddress")

public actual fun d3DKMTGetAllocationPriority(param0: ConstPtr<D3dkmtGetallocationpriority>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetAllocationPriority")

public actual fun d3DKMTGetContextInProcessSchedulingPriority(param0: MutPtr<D3dkmtGetcontextinprocessschedulingpriority>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetContextInProcessSchedulingPriority")

public actual fun d3DKMTGetContextSchedulingPriority(param0: MutPtr<D3dkmtGetcontextschedulingpriority>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetContextSchedulingPriority")

public actual fun d3DKMTGetDWMVerticalBlankEvent(param0: ConstPtr<D3dkmtGetverticalblankevent>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetDWMVerticalBlankEvent")

public actual fun d3DKMTGetDeviceState(param0: MutPtr<D3dkmtGetdevicestate>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetDeviceState")

public actual fun d3DKMTGetDisplayModeList(param0: MutPtr<D3dkmtGetdisplaymodelist>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetDisplayModeList")

public actual fun d3DKMTGetMultiPlaneOverlayCaps(param0: MutPtr<D3dkmtGetMultiplaneOverlayCaps>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetMultiPlaneOverlayCaps")

public actual fun d3DKMTGetMultisampleMethodList(param0: MutPtr<D3dkmtGetmultisamplemethodlist>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetMultisampleMethodList")

public actual fun d3DKMTGetOverlayState(param0: MutPtr<D3dkmtGetoverlaystate>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetOverlayState")

public actual fun d3DKMTGetPostCompositionCaps(param0: MutPtr<D3dkmtGetPostCompositionCaps>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetPostCompositionCaps")

public actual fun d3DKMTGetPresentHistory(param0: MutPtr<D3dkmtGetpresenthistory>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetPresentHistory")

public actual fun d3DKMTGetPresentQueueEvent(hadapter: UInt, param1: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetPresentQueueEvent")

public actual fun d3DKMTGetProcessDeviceRemovalSupport(param0: MutPtr<D3dkmtGetprocessdeviceremovalsupport>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetProcessDeviceRemovalSupport")

public actual fun d3DKMTGetProcessSchedulingPriorityClass(param0: Handle, param1: MutPtr<D3dkmtSchedulingpriorityclass>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetProcessSchedulingPriorityClass")

public actual fun d3DKMTGetResourcePresentPrivateDriverData(param0: MutPtr<D3dddiGetresourcepresentprivatedriverdata>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetResourcePresentPrivateDriverData")

public actual fun d3DKMTGetRuntimeData(param0: MutPtr<D3dkmtGetruntimedata>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetRuntimeData")

public actual fun d3DKMTGetScanLine(param0: MutPtr<D3dkmtGetscanline>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetScanLine")

public actual fun d3DKMTGetSharedPrimaryHandle(param0: MutPtr<D3dkmtGetsharedprimaryhandle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetSharedPrimaryHandle")

public actual fun d3DKMTGetSharedResourceAdapterLuid(param0: MutPtr<D3dkmtGetsharedresourceadapterluid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTGetSharedResourceAdapterLuid")

public actual fun d3DKMTInvalidateActiveVidPn(param0: ConstPtr<D3dkmtInvalidateactivevidpn>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTInvalidateActiveVidPn")

public actual fun d3DKMTInvalidateCache(param0: ConstPtr<D3dkmtInvalidatecache>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTInvalidateCache")

public actual fun d3DKMTLock(param0: MutPtr<D3dkmtLock>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTLock")

public actual fun d3DKMTLock2(param0: MutPtr<D3dkmtLock2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTLock2")

public actual fun d3DKMTMakeResident(param0: MutPtr<D3dddiMakeresident>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTMakeResident")

public actual fun d3DKMTMapGpuVirtualAddress(param0: MutPtr<D3dddiMapgpuvirtualaddress>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTMapGpuVirtualAddress")

public actual fun d3DKMTMarkDeviceAsError(param0: ConstPtr<D3dkmtMarkdeviceaserror>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTMarkDeviceAsError")

public actual fun d3DKMTOfferAllocations(param0: ConstPtr<D3dkmtOfferallocations>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOfferAllocations")

public actual fun d3DKMTOpenAdapterFromDeviceName(param0: MutPtr<D3dkmtOpenadapterfromdevicename>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromDeviceName")

public actual fun d3DKMTOpenAdapterFromGdiDisplayName(param0: MutPtr<D3dkmtOpenadapterfromgdidisplayname>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromGdiDisplayName")

public actual fun d3DKMTOpenAdapterFromHdc(param0: MutPtr<D3dkmtOpenadapterfromhdc>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromHdc")

public actual fun d3DKMTOpenAdapterFromLuid(param0: MutPtr<D3dkmtOpenadapterfromluid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenAdapterFromLuid")

public actual fun d3DKMTOpenKeyedMutex(param0: MutPtr<D3dkmtOpenkeyedmutex>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenKeyedMutex")

public actual fun d3DKMTOpenKeyedMutex2(param0: MutPtr<D3dkmtOpenkeyedmutex2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenKeyedMutex2")

public actual fun d3DKMTOpenKeyedMutexFromNtHandle(param0: MutPtr<D3dkmtOpenkeyedmutexfromnthandle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenKeyedMutexFromNtHandle")

public actual fun d3DKMTOpenNtHandleFromName(param0: MutPtr<D3dkmtOpennthandlefromname>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenNtHandleFromName")

public actual fun d3DKMTOpenProtectedSessionFromNtHandle(param0: MutPtr<D3dkmtOpenprotectedsessionfromnthandle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenProtectedSessionFromNtHandle")

public actual fun d3DKMTOpenResource(param0: MutPtr<D3dkmtOpenresource>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenResource")

public actual fun d3DKMTOpenResource2(param0: MutPtr<D3dkmtOpenresource>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenResource2")

public actual fun d3DKMTOpenResourceFromNtHandle(param0: MutPtr<D3dkmtOpenresourcefromnthandle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenResourceFromNtHandle")

public actual fun d3DKMTOpenSyncObjectFromNtHandle(param0: MutPtr<D3dkmtOpensyncobjectfromnthandle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSyncObjectFromNtHandle")

public actual fun d3DKMTOpenSyncObjectFromNtHandle2(param0: MutPtr<D3dkmtOpensyncobjectfromnthandle2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSyncObjectFromNtHandle2")

public actual fun d3DKMTOpenSyncObjectNtHandleFromName(param0: MutPtr<D3dkmtOpensyncobjectnthandlefromname>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSyncObjectNtHandleFromName")

public actual fun d3DKMTOpenSynchronizationObject(param0: MutPtr<D3dkmtOpensynchronizationobject>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOpenSynchronizationObject")

public actual fun d3DKMTOutputDuplGetFrameInfo(param0: MutPtr<D3dkmtOutputduplGetFrameinfo>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplGetFrameInfo")

public actual fun d3DKMTOutputDuplGetMetaData(param0: MutPtr<D3dkmtOutputduplMetadata>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplGetMetaData")

public actual fun d3DKMTOutputDuplGetPointerShapeData(param0: MutPtr<D3dkmtOutputduplGetPointerShapeData>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplGetPointerShapeData")

public actual fun d3DKMTOutputDuplPresent(param0: ConstPtr<D3dkmtOutputduplpresent>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplPresent")

public actual fun d3DKMTOutputDuplPresentToHwQueue(param0: ConstPtr<D3dkmtOutputduplpresenttohwqueue>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplPresentToHwQueue")

public actual fun d3DKMTOutputDuplReleaseFrame(param0: MutPtr<D3dkmtOutputduplReleaseFrame>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTOutputDuplReleaseFrame")

public actual fun d3DKMTPollDisplayChildren(param0: ConstPtr<D3dkmtPolldisplaychildren>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTPollDisplayChildren")

public actual fun d3DKMTPresent(param0: MutPtr<D3dkmtPresent>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTPresent")

public actual fun d3DKMTPresentMultiPlaneOverlay(param0: ConstPtr<D3dkmtPresentMultiplaneOverlay>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTPresentMultiPlaneOverlay")

public actual fun d3DKMTPresentMultiPlaneOverlay2(param0: ConstPtr<D3dkmtPresentMultiplaneOverlay2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTPresentMultiPlaneOverlay2")

public actual fun d3DKMTPresentMultiPlaneOverlay3(param0: ConstPtr<D3dkmtPresentMultiplaneOverlay3>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTPresentMultiPlaneOverlay3")

public actual fun d3DKMTPresentRedirected(param0: ConstPtr<D3dkmtPresentRedirected>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTPresentRedirected")

public actual fun d3DKMTQueryAdapterInfo(param0: MutPtr<D3dkmtQueryadapterinfo>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryAdapterInfo")

public actual fun d3DKMTQueryAllocationResidency(param0: ConstPtr<D3dkmtQueryallocationresidency>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryAllocationResidency")

public actual fun d3DKMTQueryClockCalibration(param0: MutPtr<D3dkmtQueryclockcalibration>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryClockCalibration")

public actual fun d3DKMTQueryFSEBlock(param0: MutPtr<D3dkmtQueryfseblock>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryFSEBlock")

public actual fun d3DKMTQueryProcessOfferInfo(param0: MutPtr<D3dkmtQueryprocessofferinfo>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryProcessOfferInfo")

public actual fun d3DKMTQueryProtectedSessionInfoFromNtHandle(param0: MutPtr<D3dkmtQueryprotectedsessioninfofromnthandle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryProtectedSessionInfoFromNtHandle")

public actual fun d3DKMTQueryProtectedSessionStatus(param0: MutPtr<D3dkmtQueryprotectedsessionstatus>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryProtectedSessionStatus")

public actual fun d3DKMTQueryRemoteVidPnSourceFromGdiDisplayName(param0: MutPtr<D3dkmtQueryremotevidpnsourcefromgdidisplayname>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryRemoteVidPnSourceFromGdiDisplayName")

public actual fun d3DKMTQueryResourceInfo(param0: MutPtr<D3dkmtQueryresourceinfo>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryResourceInfo")

public actual fun d3DKMTQueryResourceInfoFromNtHandle(param0: MutPtr<D3dkmtQueryresourceinfofromnthandle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryResourceInfoFromNtHandle")

public actual fun d3DKMTQueryStatistics(param0: ConstPtr<D3dkmtQuerystatistics>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryStatistics")

public actual fun d3DKMTQueryVidPnExclusiveOwnership(param0: MutPtr<D3dkmtQueryvidpnexclusiveownership>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryVidPnExclusiveOwnership")

public actual fun d3DKMTQueryVideoMemoryInfo(param0: MutPtr<D3dkmtQueryvideomemoryinfo>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTQueryVideoMemoryInfo")

public actual fun d3DKMTReclaimAllocations(param0: MutPtr<D3dkmtReclaimallocations>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTReclaimAllocations")

public actual fun d3DKMTReclaimAllocations2(param0: MutPtr<D3dkmtReclaimallocations2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTReclaimAllocations2")

public actual fun d3DKMTRegisterTrimNotification(param0: MutPtr<D3dkmtRegistertrimnotification>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTRegisterTrimNotification")

public actual fun d3DKMTRegisterVailProcess(param0: ConstPtr<Guid>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTRegisterVailProcess")

public actual fun d3DKMTReleaseKeyedMutex(param0: MutPtr<D3dkmtReleasekeyedmutex>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTReleaseKeyedMutex")

public actual fun d3DKMTReleaseKeyedMutex2(param0: MutPtr<D3dkmtReleasekeyedmutex2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTReleaseKeyedMutex2")

public actual fun d3DKMTReleaseProcessVidPnSourceOwners(param0: Handle): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTReleaseProcessVidPnSourceOwners")

public actual fun d3DKMTRender(param0: MutPtr<D3dkmtRender>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTRender")

public actual fun d3DKMTReserveGpuVirtualAddress(param0: MutPtr<D3dddiReservegpuvirtualaddress>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTReserveGpuVirtualAddress")

public actual fun d3DKMTSetAllocationPriority(param0: ConstPtr<D3dkmtSetallocationpriority>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSetAllocationPriority")

public actual fun d3DKMTSetContextInProcessSchedulingPriority(param0: ConstPtr<D3dkmtSetcontextinprocessschedulingpriority>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSetContextInProcessSchedulingPriority")

public actual fun d3DKMTSetContextSchedulingPriority(param0: ConstPtr<D3dkmtSetcontextschedulingpriority>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSetContextSchedulingPriority")

public actual fun d3DKMTSetDisplayMode(param0: MutPtr<D3dkmtSetdisplaymode>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSetDisplayMode")

public actual fun d3DKMTSetDisplayPrivateDriverFormat(param0: ConstPtr<D3dkmtSetdisplayprivatedriverformat>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSetDisplayPrivateDriverFormat")

public actual fun d3DKMTSetFSEBlock(param0: ConstPtr<D3dkmtSetfseblock>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSetFSEBlock")

public actual fun d3DKMTSetGammaRamp(param0: ConstPtr<D3dkmtSetgammaramp>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSetGammaRamp")

public actual fun d3DKMTSetHwProtectionTeardownRecovery(param0: ConstPtr<D3dkmtSethwprotectionteardownrecovery>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSetHwProtectionTeardownRecovery")

public actual fun d3DKMTSetMonitorColorSpaceTransform(param0: ConstPtr<D3dkmtSetColorspaceTransform>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSetMonitorColorSpaceTransform")

public actual fun d3DKMTSetProcessSchedulingPriorityClass(param0: Handle, param1: D3dkmtSchedulingpriorityclass): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSetProcessSchedulingPriorityClass")

public actual fun d3DKMTSetQueuedLimit(param0: ConstPtr<D3dkmtSetqueuedlimit>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSetQueuedLimit")

public actual fun d3DKMTSetStablePowerState(param0: ConstPtr<D3dkmtSetstablepowerstate>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSetStablePowerState")

public actual fun d3DKMTSetSyncRefreshCountWaitTarget(param0: ConstPtr<D3dkmtSetsyncrefreshcountwaittarget>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSetSyncRefreshCountWaitTarget")

public actual fun d3DKMTSetVidPnSourceHwProtection(param0: ConstPtr<D3dkmtSetvidpnsourcehwprotection>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceHwProtection")

public actual fun d3DKMTSetVidPnSourceOwner(param0: ConstPtr<D3dkmtSetvidpnsourceowner>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceOwner")

public actual fun d3DKMTSetVidPnSourceOwner1(param0: ConstPtr<D3dkmtSetvidpnsourceowner1>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceOwner1")

public actual fun d3DKMTSetVidPnSourceOwner2(param0: ConstPtr<D3dkmtSetvidpnsourceowner2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSetVidPnSourceOwner2")

public actual fun d3DKMTShareObjects(cobjects: UInt, hobjects: ConstPtr<UInt>, pobjectattributes: ConstPtr<ObjectAttributes>, dwdesiredaccess: UInt, phsharednthandle: MutPtr<Handle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTShareObjects")

public actual fun d3DKMTSharedPrimaryLockNotification(param0: ConstPtr<D3dkmtSharedprimarylocknotification>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSharedPrimaryLockNotification")

public actual fun d3DKMTSharedPrimaryUnLockNotification(param0: ConstPtr<D3dkmtSharedprimaryunlocknotification>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSharedPrimaryUnLockNotification")

public actual fun d3DKMTSignalSynchronizationObject(param0: ConstPtr<D3dkmtSignalsynchronizationobject>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObject")

public actual fun d3DKMTSignalSynchronizationObject2(param0: ConstPtr<D3dkmtSignalsynchronizationobject2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObject2")

public actual fun d3DKMTSignalSynchronizationObjectFromCpu(param0: ConstPtr<D3dkmtSignalsynchronizationobjectfromcpu>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObjectFromCpu")

public actual fun d3DKMTSignalSynchronizationObjectFromGpu(param0: ConstPtr<D3dkmtSignalsynchronizationobjectfromgpu>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObjectFromGpu")

public actual fun d3DKMTSignalSynchronizationObjectFromGpu2(param0: ConstPtr<D3dkmtSignalsynchronizationobjectfromgpu2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSignalSynchronizationObjectFromGpu2")

public actual fun d3DKMTSubmitCommand(param0: ConstPtr<D3dkmtSubmitcommand>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitCommand")

public actual fun d3DKMTSubmitCommandToHwQueue(param0: ConstPtr<D3dkmtSubmitcommandtohwqueue>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitCommandToHwQueue")

public actual fun d3DKMTSubmitPresentBltToHwQueue(param0: ConstPtr<D3dkmtSubmitpresentblttohwqueue>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitPresentBltToHwQueue")

public actual fun d3DKMTSubmitPresentToHwQueue(param0: MutPtr<D3dkmtSubmitpresenttohwqueue>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitPresentToHwQueue")

public actual fun d3DKMTSubmitSignalSyncObjectsToHwQueue(param0: ConstPtr<D3dkmtSubmitsignalsyncobjectstohwqueue>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitSignalSyncObjectsToHwQueue")

public actual fun d3DKMTSubmitWaitForSyncObjectsToHwQueue(param0: ConstPtr<D3dkmtSubmitwaitforsyncobjectstohwqueue>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTSubmitWaitForSyncObjectsToHwQueue")

public actual fun d3DKMTTrimProcessCommitment(param0: MutPtr<D3dkmtTrimprocesscommitment>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTTrimProcessCommitment")

public actual fun d3DKMTUnlock(param0: ConstPtr<D3dkmtUnlock>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTUnlock")

public actual fun d3DKMTUnlock2(param0: ConstPtr<D3dkmtUnlock2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTUnlock2")

public actual fun d3DKMTUnregisterTrimNotification(param0: MutPtr<D3dkmtUnregistertrimnotification>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTUnregisterTrimNotification")

public actual fun d3DKMTUpdateAllocationProperty(param0: MutPtr<D3dddiUpdateallocproperty>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTUpdateAllocationProperty")

public actual fun d3DKMTUpdateGpuVirtualAddress(param0: ConstPtr<D3dkmtUpdategpuvirtualaddress>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTUpdateGpuVirtualAddress")

public actual fun d3DKMTUpdateOverlay(param0: ConstPtr<D3dkmtUpdateoverlay>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTUpdateOverlay")

public actual fun d3DKMTWaitForIdle(param0: ConstPtr<D3dkmtWaitforidle>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForIdle")

public actual fun d3DKMTWaitForSynchronizationObject(param0: ConstPtr<D3dkmtWaitforsynchronizationobject>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObject")

public actual fun d3DKMTWaitForSynchronizationObject2(param0: ConstPtr<D3dkmtWaitforsynchronizationobject2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObject2")

public actual fun d3DKMTWaitForSynchronizationObjectFromCpu(param0: ConstPtr<D3dkmtWaitforsynchronizationobjectfromcpu>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObjectFromCpu")

public actual fun d3DKMTWaitForSynchronizationObjectFromGpu(param0: ConstPtr<D3dkmtWaitforsynchronizationobjectfromgpu>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForSynchronizationObjectFromGpu")

public actual fun d3DKMTWaitForVerticalBlankEvent(param0: ConstPtr<D3dkmtWaitforverticalblankevent>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForVerticalBlankEvent")

public actual fun d3DKMTWaitForVerticalBlankEvent2(param0: ConstPtr<D3dkmtWaitforverticalblankevent2>): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkGraphicsDirect3dD3DKMTWaitForVerticalBlankEvent2")
