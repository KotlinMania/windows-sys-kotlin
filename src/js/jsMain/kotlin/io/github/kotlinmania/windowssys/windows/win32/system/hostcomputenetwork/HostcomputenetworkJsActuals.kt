@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val windowsWin32SystemHostcomputenetworkNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun hcnCloseEndpoint(endpoint: ConstPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseEndpoint(endpoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCloseGuestNetworkService(guestnetworkservice: ConstPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseGuestNetworkService(guestnetworkservice.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCloseLoadBalancer(loadbalancer: ConstPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseLoadBalancer(loadbalancer.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCloseNamespace(namespace: ConstPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNamespace(namespace.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCloseNetwork(network: ConstPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNetwork(network.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCreateEndpoint(network: ConstPtr, id: ConstPtr, settings: Pcwstr, endpoint: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateEndpoint(network.rawAddress.toString(), id.rawAddress.toString(), settings.rawAddress.toString(), endpoint.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCreateGuestNetworkService(id: ConstPtr, settings: Pcwstr, guestnetworkservice: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateGuestNetworkService(id.rawAddress.toString(), settings.rawAddress.toString(), guestnetworkservice.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCreateLoadBalancer(id: ConstPtr, settings: Pcwstr, loadbalancer: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateLoadBalancer(id.rawAddress.toString(), settings.rawAddress.toString(), loadbalancer.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCreateNamespace(id: ConstPtr, settings: Pcwstr, namespace: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNamespace(id.rawAddress.toString(), settings.rawAddress.toString(), namespace.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCreateNetwork(id: ConstPtr, settings: Pcwstr, network: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNetwork(id.rawAddress.toString(), settings.rawAddress.toString(), network.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnDeleteEndpoint(id: ConstPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteEndpoint(id.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnDeleteGuestNetworkService(id: ConstPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteGuestNetworkService(id.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnDeleteLoadBalancer(id: ConstPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteLoadBalancer(id.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnDeleteNamespace(id: ConstPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNamespace(id.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnDeleteNetwork(id: ConstPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNetwork(id.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnEnumerateEndpoints(query: Pcwstr, endpoints: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateEndpoints(query.rawAddress.toString(), endpoints.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnEnumerateGuestNetworkPortReservations(returncount: MutPtr, portentries: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateGuestNetworkPortReservations(returncount.rawAddress.toString(), portentries.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnEnumerateLoadBalancers(query: Pcwstr, loadbalancer: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateLoadBalancers(query.rawAddress.toString(), loadbalancer.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnEnumerateNamespaces(query: Pcwstr, namespaces: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNamespaces(query.rawAddress.toString(), namespaces.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnEnumerateNetworks(query: Pcwstr, networks: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNetworks(query.rawAddress.toString(), networks.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnFreeGuestNetworkPortReservations(portentries: MutPtr) {
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) {
        windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnFreeGuestNetworkPortReservations(portentries.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hcnModifyEndpoint(endpoint: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyEndpoint(endpoint.rawAddress.toString(), settings.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnModifyGuestNetworkService(guestnetworkservice: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyGuestNetworkService(guestnetworkservice.rawAddress.toString(), settings.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnModifyLoadBalancer(loadbalancer: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyLoadBalancer(loadbalancer.rawAddress.toString(), settings.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnModifyNamespace(namespace: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNamespace(namespace.rawAddress.toString(), settings.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnModifyNetwork(network: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNetwork(network.rawAddress.toString(), settings.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnOpenEndpoint(id: ConstPtr, endpoint: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnOpenEndpoint(id.rawAddress.toString(), endpoint.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnOpenLoadBalancer(id: ConstPtr, loadbalancer: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnOpenLoadBalancer(id.rawAddress.toString(), loadbalancer.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnOpenNamespace(id: ConstPtr, namespace: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNamespace(id.rawAddress.toString(), namespace.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnOpenNetwork(id: ConstPtr, network: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNetwork(id.rawAddress.toString(), network.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnQueryEndpointAddresses(endpoint: ConstPtr, query: Pcwstr, addresses: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointAddresses(endpoint.rawAddress.toString(), query.rawAddress.toString(), addresses.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnQueryEndpointProperties(endpoint: ConstPtr, query: Pcwstr, properties: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointProperties(endpoint.rawAddress.toString(), query.rawAddress.toString(), properties.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnQueryEndpointStats(endpoint: ConstPtr, query: Pcwstr, stats: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointStats(endpoint.rawAddress.toString(), query.rawAddress.toString(), stats.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnQueryLoadBalancerProperties(loadbalancer: ConstPtr, query: Pcwstr, properties: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryLoadBalancerProperties(loadbalancer.rawAddress.toString(), query.rawAddress.toString(), properties.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnQueryNamespaceProperties(namespace: ConstPtr, query: Pcwstr, properties: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNamespaceProperties(namespace.rawAddress.toString(), query.rawAddress.toString(), properties.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnQueryNetworkProperties(network: ConstPtr, query: Pcwstr, properties: MutPtr, errorrecord: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNetworkProperties(network.rawAddress.toString(), query.rawAddress.toString(), properties.rawAddress.toString(), errorrecord.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnRegisterGuestNetworkServiceCallback(guestnetworkservice: ConstPtr, callback: HcnNotificationCallback, context: ConstPtr, callbackhandle: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterGuestNetworkServiceCallback(guestnetworkservice.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), callbackhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnRegisterServiceCallback(callback: HcnNotificationCallback, context: ConstPtr, callbackhandle: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterServiceCallback(0L.toString(), context.rawAddress.toString(), callbackhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: Handle): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnReserveGuestNetworkServicePort(guestnetworkservice: ConstPtr, protocol: HcnPortProtocol, access: HcnPortAccess, port: UShort, portreservationhandle: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePort(guestnetworkservice.rawAddress.toString(), protocol, access, port.toInt(), portreservationhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnReserveGuestNetworkServicePortRange(guestnetworkservice: ConstPtr, portcount: UShort, portrangereservation: MutPtr, portreservationhandle: MutPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePortRange(guestnetworkservice.rawAddress.toString(), portcount.toInt(), portrangereservation.rawAddress.toString(), portreservationhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnUnregisterGuestNetworkServiceCallback(callbackhandle: ConstPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterGuestNetworkServiceCallback(callbackhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnUnregisterServiceCallback(callbackhandle: ConstPtr): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAddon != null) (windowsWin32SystemHostcomputenetworkNapiAddon.windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterServiceCallback(callbackhandle.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
