@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.webservicesondevices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun wSDAllocateLinkedMemory(pparent: MutPtr<CVoid>, cbsize: ULong): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDAllocateLinkedMemory")

public actual fun wSDAttachLinkedMemory(pparent: MutPtr<CVoid>, pchild: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDAttachLinkedMemory")

public actual fun wSDCreateDeviceHost(pszlocalid: Pcwstr, pcontext: MutPtr<CVoid>, ppdevicehost: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost")

public actual fun wSDCreateDeviceHost2(pszlocalid: Pcwstr, pcontext: MutPtr<CVoid>, pconfigparams: ConstPtr<WsdConfigParam>, dwconfigparamcount: UInt, ppdevicehost: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHost2")

public actual fun wSDCreateDeviceHostAdvanced(pszlocalid: Pcwstr, pcontext: MutPtr<CVoid>, pphostaddresses: ConstPtr<MutPtr<CVoid>>, dwhostaddresscount: UInt, ppdevicehost: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceHostAdvanced")

public actual fun wSDCreateDeviceProxy(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: MutPtr<CVoid>, ppdeviceproxy: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy")

public actual fun wSDCreateDeviceProxy2(pszdeviceid: Pcwstr, pszlocalid: Pcwstr, pcontext: MutPtr<CVoid>, pconfigparams: ConstPtr<WsdConfigParam>, dwconfigparamcount: UInt, ppdeviceproxy: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxy2")

public actual fun wSDCreateDeviceProxyAdvanced(pszdeviceid: Pcwstr, pdeviceaddress: MutPtr<CVoid>, pszlocalid: Pcwstr, pcontext: MutPtr<CVoid>, ppdeviceproxy: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDeviceProxyAdvanced")

public actual fun wSDCreateDiscoveryProvider(pcontext: MutPtr<CVoid>, ppprovider: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider")

public actual fun wSDCreateDiscoveryProvider2(pcontext: MutPtr<CVoid>, pconfigparams: ConstPtr<WsdConfigParam>, dwconfigparamcount: UInt, ppprovider: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryProvider2")

public actual fun wSDCreateDiscoveryPublisher(pcontext: MutPtr<CVoid>, pppublisher: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher")

public actual fun wSDCreateDiscoveryPublisher2(pcontext: MutPtr<CVoid>, pconfigparams: ConstPtr<WsdConfigParam>, dwconfigparamcount: UInt, pppublisher: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateDiscoveryPublisher2")

public actual fun wSDCreateHttpAddress(ppaddress: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpAddress")

public actual fun wSDCreateHttpMessageParameters(pptxparams: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateHttpMessageParameters")

public actual fun wSDCreateOutboundAttachment(ppattachment: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateOutboundAttachment")

public actual fun wSDCreateUdpAddress(ppaddress: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpAddress")

public actual fun wSDCreateUdpMessageParameters(pptxparams: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDCreateUdpMessageParameters")

public actual fun wSDDetachLinkedMemory(pvoid: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDDetachLinkedMemory")

public actual fun wSDFreeLinkedMemory(pvoid: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDFreeLinkedMemory")

public actual fun wSDGenerateFault(pszcode: Pcwstr, pszsubcode: Pcwstr, pszreason: Pcwstr, pszdetail: Pcwstr, pcontext: MutPtr<CVoid>, ppfault: MutPtr<MutPtr<WsdSoapFault>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFault")

public actual fun wSDGenerateFaultEx(pcode: ConstPtr<WsdxmlName>, psubcode: ConstPtr<WsdxmlName>, preasons: ConstPtr<WsdLocalizedStringList>, pszdetail: Pcwstr, ppfault: MutPtr<MutPtr<WsdSoapFault>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDGenerateFaultEx")

public actual fun wSDGetConfigurationOption(dwoption: UInt, pvoid: MutPtr<CVoid>, cboutbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDGetConfigurationOption")

public actual fun wSDSetConfigurationOption(dwoption: UInt, pvoid: ConstPtr<CVoid>, cbinbuffer: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDSetConfigurationOption")

public actual fun wSDUriDecode(source: Pcwstr, cchsource: UInt, destout: MutPtr<Pwstr>, cchdestout: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDUriDecode")

public actual fun wSDUriEncode(source: Pcwstr, cchsource: UInt, destout: MutPtr<Pwstr>, cchdestout: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDUriEncode")

public actual fun wSDXMLAddChild(pparent: MutPtr<WsdxmlElement>, pchild: MutPtr<WsdxmlElement>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddChild")

public actual fun wSDXMLAddSibling(pfirst: MutPtr<WsdxmlElement>, psecond: MutPtr<WsdxmlElement>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLAddSibling")

public actual fun wSDXMLBuildAnyForSingleElement(pelementname: MutPtr<WsdxmlName>, psztext: Pcwstr, ppany: MutPtr<MutPtr<WsdxmlElement>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLBuildAnyForSingleElement")

public actual fun wSDXMLCleanupElement(pany: MutPtr<WsdxmlElement>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCleanupElement")

public actual fun wSDXMLCreateContext(ppcontext: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLCreateContext")

public actual fun wSDXMLGetNameFromBuiltinNamespace(psznamespace: Pcwstr, pszname: Pcwstr, ppname: MutPtr<MutPtr<WsdxmlName>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetNameFromBuiltinNamespace")

public actual fun wSDXMLGetValueFromAny(psznamespace: Pcwstr, pszname: Pcwstr, pany: MutPtr<WsdxmlElement>, ppszvalue: MutPtr<Pcwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32DevicesWebservicesondevicesWSDXMLGetValueFromAny")
