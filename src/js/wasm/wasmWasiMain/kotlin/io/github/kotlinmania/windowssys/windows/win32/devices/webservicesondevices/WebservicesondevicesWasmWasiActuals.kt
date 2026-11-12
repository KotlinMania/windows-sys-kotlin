@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun wSDAllocateLinkedMemory(pparent: MutPtr, cbsize: ULong): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDAllocateLinkedMemory")

public actual fun wSDAttachLinkedMemory(pparent: MutPtr, pchild: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDAttachLinkedMemory")

public actual fun wSDCreateDeviceHost(pszlocalid: Pcwstr, pcontext: MutPtr, ppdevicehost: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost")

public actual fun wSDCreateDeviceHost2(pszlocalid: Pcwstr, pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, ppdevicehost: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost2")

public actual fun wSDCreateDeviceHostAdvanced(pszlocalid: Pcwstr, pcontext: MutPtr, pphostaddresses: ConstPtr, dwhostaddresscount: UInt, ppdevicehost: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHostAdvanced")

public actual fun wSDCreateDeviceProxy(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: MutPtr, ppdeviceproxy: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy")

public actual fun wSDCreateDeviceProxy2(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, ppdeviceproxy: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy2")

public actual fun wSDCreateDeviceProxyAdvanced(pszdeviceid: Pcwstr, pdeviceaddress: MutPtr, pszlocalid: Pcwstr, pcontext: MutPtr, ppdeviceproxy: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxyAdvanced")

public actual fun wSDCreateDiscoveryProvider(pcontext: MutPtr, ppprovider: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider")

public actual fun wSDCreateDiscoveryProvider2(pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, ppprovider: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider2")

public actual fun wSDCreateDiscoveryPublisher(pcontext: MutPtr, pppublisher: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher")

public actual fun wSDCreateDiscoveryPublisher2(pcontext: MutPtr, pconfigparams: ConstPtr, dwconfigparamcount: UInt, pppublisher: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher2")

public actual fun wSDCreateHttpAddress(ppaddress: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpAddress")

public actual fun wSDCreateHttpMessageParameters(pptxparams: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpMessageParameters")

public actual fun wSDCreateOutboundAttachment(ppattachment: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateOutboundAttachment")

public actual fun wSDCreateUdpAddress(ppaddress: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpAddress")

public actual fun wSDCreateUdpMessageParameters(pptxparams: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpMessageParameters")

public actual fun wSDDetachLinkedMemory(pvoid: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDDetachLinkedMemory")

public actual fun wSDFreeLinkedMemory(pvoid: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDFreeLinkedMemory")

public actual fun wSDGenerateFault(pszcode: Pcwstr, pszsubcode: Pcwstr, pszreason: Pcwstr, pszdetail: Pcwstr, pcontext: MutPtr, ppfault: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFault")

public actual fun wSDGenerateFaultEx(pcode: ConstPtr, psubcode: ConstPtr, preasons: ConstPtr, pszdetail: Pcwstr, ppfault: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFaultEx")

public actual fun wSDGetConfigurationOption(dwoption: UInt, pvoid: MutPtr, cboutbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDGetConfigurationOption")

public actual fun wSDSetConfigurationOption(dwoption: UInt, pvoid: ConstPtr, cbinbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDSetConfigurationOption")

public actual fun wSDUriDecode(source: Pcwstr, cchsource: UInt, destout: MutPtr, cchdestout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDUriDecode")

public actual fun wSDUriEncode(source: Pcwstr, cchsource: UInt, destout: MutPtr, cchdestout: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDUriEncode")

public actual fun wSDXMLAddChild(pparent: MutPtr, pchild: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddChild")

public actual fun wSDXMLAddSibling(pfirst: MutPtr, psecond: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddSibling")

public actual fun wSDXMLBuildAnyForSingleElement(pelementname: MutPtr, psztext: Pcwstr, ppany: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLBuildAnyForSingleElement")

public actual fun wSDXMLCleanupElement(pany: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCleanupElement")

public actual fun wSDXMLCreateContext(ppcontext: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCreateContext")

public actual fun wSDXMLGetNameFromBuiltinNamespace(psznamespace: Pcwstr, pszname: Pcwstr, ppname: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetNameFromBuiltinNamespace")

public actual fun wSDXMLGetValueFromAny(psznamespace: Pcwstr, pszname: Pcwstr, pany: MutPtr, ppszvalue: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetValueFromAny")
