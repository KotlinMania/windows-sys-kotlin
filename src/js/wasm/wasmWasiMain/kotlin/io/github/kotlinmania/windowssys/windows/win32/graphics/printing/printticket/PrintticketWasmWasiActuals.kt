@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Devmodea

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun pTCloseProvider(hprovider: Hptprovider): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingPrintticketPTCloseProvider")

public actual fun pTConvertDevModeToPrintTicket(hprovider: Hptprovider, cbdevmode: UInt, pdevmode: ConstPtr<Devmodea>, scope: EPrintTicketScope, pprintticket: MutPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingPrintticketPTConvertDevModeToPrintTicket")

public actual fun pTConvertPrintTicketToDevMode(hprovider: Hptprovider, pprintticket: MutPtr<CVoid>, basedevmodetype: EDefaultDevmodeType, scope: EPrintTicketScope, pcbdevmode: MutPtr<UInt>, ppdevmode: MutPtr<MutPtr<Devmodea>>, pbstrerrormessage: MutPtr<Bstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingPrintticketPTConvertPrintTicketToDevMode")

public actual fun pTGetPrintCapabilities(hprovider: Hptprovider, pprintticket: MutPtr<CVoid>, pcapabilities: MutPtr<CVoid>, pbstrerrormessage: MutPtr<Bstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintCapabilities")

public actual fun pTGetPrintDeviceCapabilities(hprovider: Hptprovider, pprintticket: MutPtr<CVoid>, pdevicecapabilities: MutPtr<CVoid>, pbstrerrormessage: MutPtr<Bstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintDeviceCapabilities")

public actual fun pTGetPrintDeviceResources(hprovider: Hptprovider, pszlocalename: Pcwstr, pprintticket: MutPtr<CVoid>, pdeviceresources: MutPtr<CVoid>, pbstrerrormessage: MutPtr<Bstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingPrintticketPTGetPrintDeviceResources")

public actual fun pTMergeAndValidatePrintTicket(hprovider: Hptprovider, pbaseticket: MutPtr<CVoid>, pdeltaticket: MutPtr<CVoid>, scope: EPrintTicketScope, presultticket: MutPtr<CVoid>, pbstrerrormessage: MutPtr<Bstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingPrintticketPTMergeAndValidatePrintTicket")

public actual fun pTOpenProvider(pszprintername: Pcwstr, dwversion: UInt, phprovider: MutPtr<Hptprovider>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingPrintticketPTOpenProvider")

public actual fun pTOpenProviderEx(pszprintername: Pcwstr, dwmaxversion: UInt, dwprefversion: UInt, phprovider: MutPtr<Hptprovider>, pusedversion: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingPrintticketPTOpenProviderEx")

public actual fun pTQuerySchemaVersionSupport(pszprintername: Pcwstr, pmaxversion: MutPtr<UInt>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingPrintticketPTQuerySchemaVersionSupport")

public actual fun pTReleaseMemory(pbuffer: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32GraphicsPrintingPrintticketPTReleaseMemory")
