@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val _windowsWin32SystemHostcomputenetworkNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun hcnCloseEndpoint(endpoint: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnCloseEndpoint((endpoint?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCloseGuestNetworkService(guestnetworkservice: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnCloseGuestNetworkService((guestnetworkservice?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCloseLoadBalancer(loadbalancer: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnCloseLoadBalancer((loadbalancer?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCloseNamespace(namespace: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnCloseNamespace((namespace?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCloseNetwork(network: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnCloseNetwork((network?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCreateEndpoint(network: COpaquePointer?, id: COpaquePointer?, settings: Pcwstr, endpoint: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnCreateEndpoint((network?.value ?: 0L).toString(), (id?.value ?: 0L).toString(), (settings?.value ?: 0L).toString(), (endpoint?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCreateGuestNetworkService(id: COpaquePointer?, settings: Pcwstr, guestnetworkservice: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnCreateGuestNetworkService((id?.value ?: 0L).toString(), (settings?.value ?: 0L).toString(), (guestnetworkservice?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCreateLoadBalancer(id: COpaquePointer?, settings: Pcwstr, loadbalancer: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnCreateLoadBalancer((id?.value ?: 0L).toString(), (settings?.value ?: 0L).toString(), (loadbalancer?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCreateNamespace(id: COpaquePointer?, settings: Pcwstr, namespace: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnCreateNamespace((id?.value ?: 0L).toString(), (settings?.value ?: 0L).toString(), (namespace?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCreateNetwork(id: COpaquePointer?, settings: Pcwstr, network: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnCreateNetwork((id?.value ?: 0L).toString(), (settings?.value ?: 0L).toString(), (network?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnDeleteEndpoint(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteEndpoint((id?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnDeleteGuestNetworkService(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteGuestNetworkService((id?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnDeleteLoadBalancer(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteLoadBalancer((id?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnDeleteNamespace(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteNamespace((id?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnDeleteNetwork(id: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnDeleteNetwork((id?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnEnumerateEndpoints(query: Pcwstr, endpoints: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateEndpoints((query?.value ?: 0L).toString(), (endpoints?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnEnumerateGuestNetworkPortReservations(returncount: COpaquePointer?, portentries: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateGuestNetworkPortReservations((returncount?.value ?: 0L).toString(), (portentries?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnEnumerateLoadBalancers(query: Pcwstr, loadbalancer: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateLoadBalancers((query?.value ?: 0L).toString(), (loadbalancer?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnEnumerateNamespaces(query: Pcwstr, namespaces: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateNamespaces((query?.value ?: 0L).toString(), (namespaces?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnEnumerateNetworks(query: Pcwstr, networks: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnEnumerateNetworks((query?.value ?: 0L).toString(), (networks?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnFreeGuestNetworkPortReservations(portentries: COpaquePointer?) {
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) {
        _windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnFreeGuestNetworkPortReservations((portentries?.value ?: 0L).toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hcnModifyEndpoint(endpoint: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnModifyEndpoint((endpoint?.value ?: 0L).toString(), (settings?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnModifyGuestNetworkService(guestnetworkservice: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnModifyGuestNetworkService((guestnetworkservice?.value ?: 0L).toString(), (settings?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnModifyLoadBalancer(loadbalancer: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnModifyLoadBalancer((loadbalancer?.value ?: 0L).toString(), (settings?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnModifyNamespace(namespace: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnModifyNamespace((namespace?.value ?: 0L).toString(), (settings?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnModifyNetwork(network: COpaquePointer?, settings: Pcwstr, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnModifyNetwork((network?.value ?: 0L).toString(), (settings?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnOpenEndpoint(id: COpaquePointer?, endpoint: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnOpenEndpoint((id?.value ?: 0L).toString(), (endpoint?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnOpenLoadBalancer(id: COpaquePointer?, loadbalancer: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnOpenLoadBalancer((id?.value ?: 0L).toString(), (loadbalancer?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnOpenNamespace(id: COpaquePointer?, namespace: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnOpenNamespace((id?.value ?: 0L).toString(), (namespace?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnOpenNetwork(id: COpaquePointer?, network: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnOpenNetwork((id?.value ?: 0L).toString(), (network?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnQueryEndpointAddresses(endpoint: COpaquePointer?, query: Pcwstr, addresses: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnQueryEndpointAddresses((endpoint?.value ?: 0L).toString(), (query?.value ?: 0L).toString(), (addresses?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnQueryEndpointProperties(endpoint: COpaquePointer?, query: Pcwstr, properties: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnQueryEndpointProperties((endpoint?.value ?: 0L).toString(), (query?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnQueryEndpointStats(endpoint: COpaquePointer?, query: Pcwstr, stats: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnQueryEndpointStats((endpoint?.value ?: 0L).toString(), (query?.value ?: 0L).toString(), (stats?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnQueryLoadBalancerProperties(loadbalancer: COpaquePointer?, query: Pcwstr, properties: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnQueryLoadBalancerProperties((loadbalancer?.value ?: 0L).toString(), (query?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnQueryNamespaceProperties(namespace: COpaquePointer?, query: Pcwstr, properties: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnQueryNamespaceProperties((namespace?.value ?: 0L).toString(), (query?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnQueryNetworkProperties(network: COpaquePointer?, query: Pcwstr, properties: COpaquePointer?, errorrecord: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnQueryNetworkProperties((network?.value ?: 0L).toString(), (query?.value ?: 0L).toString(), (properties?.value ?: 0L).toString(), (errorrecord?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnRegisterGuestNetworkServiceCallback(guestnetworkservice: COpaquePointer?, callback: HcnNotificationCallback, context: COpaquePointer?, callbackhandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnRegisterGuestNetworkServiceCallback((guestnetworkservice?.value ?: 0L).toString(), 0L.toString(), (context?.value ?: 0L).toString(), (callbackhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnRegisterServiceCallback(callback: HcnNotificationCallback, context: COpaquePointer?, callbackhandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnRegisterServiceCallback(0L.toString(), (context?.value ?: 0L).toString(), (callbackhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: Handle): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnReleaseGuestNetworkServicePortReservationHandle((portreservationhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnReserveGuestNetworkServicePort(guestnetworkservice: COpaquePointer?, protocol: HcnPortProtocol, access: HcnPortAccess, port: UShort, portreservationhandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnReserveGuestNetworkServicePort((guestnetworkservice?.value ?: 0L).toString(), protocol, access, port.toInt(), (portreservationhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnReserveGuestNetworkServicePortRange(guestnetworkservice: COpaquePointer?, portcount: UShort, portrangereservation: COpaquePointer?, portreservationhandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnReserveGuestNetworkServicePortRange((guestnetworkservice?.value ?: 0L).toString(), portcount.toInt(), (portrangereservation?.value ?: 0L).toString(), (portreservationhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnUnregisterGuestNetworkServiceCallback(callbackhandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnUnregisterGuestNetworkServiceCallback((callbackhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnUnregisterServiceCallback(callbackhandle: COpaquePointer?): Hresult =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_hcnUnregisterServiceCallback((callbackhandle?.value ?: 0L).toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
