@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.graphics.printing.printticket

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

public actual fun pTCloseProvider(hprovider: Hptprovider): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pTConvertDevModeToPrintTicket(hprovider: Hptprovider, cbdevmode: UInt, pdevmode: COpaquePointer?, scope: EPrintTicketScope, pprintticket: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pTConvertPrintTicketToDevMode(hprovider: Hptprovider, pprintticket: COpaquePointer?, basedevmodetype: EDefaultDevmodeType, scope: EPrintTicketScope, pcbdevmode: COpaquePointer?, ppdevmode: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pTGetPrintCapabilities(hprovider: Hptprovider, pprintticket: COpaquePointer?, pcapabilities: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pTGetPrintDeviceCapabilities(hprovider: Hptprovider, pprintticket: COpaquePointer?, pdevicecapabilities: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pTGetPrintDeviceResources(hprovider: Hptprovider, pszlocalename: Pcwstr, pprintticket: COpaquePointer?, pdeviceresources: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pTMergeAndValidatePrintTicket(hprovider: Hptprovider, pbaseticket: COpaquePointer?, pdeltaticket: COpaquePointer?, scope: EPrintTicketScope, presultticket: COpaquePointer?, pbstrerrormessage: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pTOpenProvider(pszprintername: Pcwstr, dwversion: UInt, phprovider: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pTOpenProviderEx(pszprintername: Pcwstr, dwmaxversion: UInt, dwprefversion: UInt, phprovider: COpaquePointer?, pusedversion: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pTQuerySchemaVersionSupport(pszprintername: Pcwstr, pmaxversion: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pTReleaseMemory(pbuffer: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
