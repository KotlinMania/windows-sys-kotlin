@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemHostcomputenetworkNapiAddon(): Boolean

private val windowsWin32SystemHostcomputenetworkNapiAvailable: Boolean = initWindowsWin32SystemHostcomputenetworkNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseEndpoint(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCloseEndpoint(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseGuestNetworkService(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCloseGuestNetworkService(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseLoadBalancer(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCloseLoadBalancer(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNamespace(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCloseNamespace(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNetwork(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCloseNetwork(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateEndpoint(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCreateEndpoint(p0: String, p1: String, p2: String, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateGuestNetworkService(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCreateGuestNetworkService(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateLoadBalancer(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCreateLoadBalancer(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNamespace(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCreateNamespace(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNetwork(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCreateNetwork(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteEndpoint(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnDeleteEndpoint(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteGuestNetworkService(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnDeleteGuestNetworkService(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteLoadBalancer(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnDeleteLoadBalancer(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNamespace(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNamespace(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNetwork(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNetwork(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateEndpoints(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateEndpoints(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateGuestNetworkPortReservations(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateGuestNetworkPortReservations(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateLoadBalancers(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateLoadBalancers(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNamespaces(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNamespaces(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNetworks(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNetworks(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnFreeGuestNetworkPortReservations(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnFreeGuestNetworkPortReservations(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyEndpoint(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnModifyEndpoint(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyGuestNetworkService(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnModifyGuestNetworkService(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyLoadBalancer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnModifyLoadBalancer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNamespace(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnModifyNamespace(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNetwork(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnModifyNetwork(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnOpenEndpoint(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnOpenEndpoint(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnOpenLoadBalancer(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnOpenLoadBalancer(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNamespace(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnOpenNamespace(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNetwork(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnOpenNetwork(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointAddresses(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointAddresses(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointProperties(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointProperties(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointStats(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointStats(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryLoadBalancerProperties(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnQueryLoadBalancerProperties(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNamespaceProperties(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnQueryNamespaceProperties(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNetworkProperties(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnQueryNetworkProperties(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterGuestNetworkServiceCallback(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnRegisterGuestNetworkServiceCallback(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterServiceCallback(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnRegisterServiceCallback(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnReleaseGuestNetworkServicePortReservationHandle(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnReleaseGuestNetworkServicePortReservationHandle(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePort(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePort(p0: String, p1: Int, p2: Int, p3: Int, p4: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePortRange(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePortRange(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterGuestNetworkServiceCallback(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterGuestNetworkServiceCallback(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterServiceCallback(p0)")
private external fun wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterServiceCallback(p0: String): Int

public actual fun hcnCloseEndpoint(endpoint: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCloseEndpoint(endpoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCloseGuestNetworkService(guestnetworkservice: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCloseGuestNetworkService(guestnetworkservice.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCloseLoadBalancer(loadbalancer: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCloseLoadBalancer(loadbalancer.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCloseNamespace(namespace: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCloseNamespace(namespace.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCloseNetwork(network: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCloseNetwork(network.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCreateEndpoint(network: ConstPtr<CVoid>, id: ConstPtr<Guid>, settings: Pcwstr, endpoint: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCreateEndpoint(network.rawAddress.toString(), id.rawAddress.toString(), settings.rawAddress.toString(), endpoint.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCreateGuestNetworkService(id: ConstPtr<Guid>, settings: Pcwstr, guestnetworkservice: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCreateGuestNetworkService(id.rawAddress.toString(), settings.rawAddress.toString(), guestnetworkservice.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCreateLoadBalancer(id: ConstPtr<Guid>, settings: Pcwstr, loadbalancer: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCreateLoadBalancer(id.rawAddress.toString(), settings.rawAddress.toString(), loadbalancer.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCreateNamespace(id: ConstPtr<Guid>, settings: Pcwstr, namespace: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCreateNamespace(id.rawAddress.toString(), settings.rawAddress.toString(), namespace.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnCreateNetwork(id: ConstPtr<Guid>, settings: Pcwstr, network: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnCreateNetwork(id.rawAddress.toString(), settings.rawAddress.toString(), network.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnDeleteEndpoint(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnDeleteEndpoint(id.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnDeleteGuestNetworkService(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnDeleteGuestNetworkService(id.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnDeleteLoadBalancer(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnDeleteLoadBalancer(id.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnDeleteNamespace(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNamespace(id.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnDeleteNetwork(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNetwork(id.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnEnumerateEndpoints(query: Pcwstr, endpoints: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateEndpoints(query.rawAddress.toString(), endpoints.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnEnumerateGuestNetworkPortReservations(returncount: MutPtr<UInt>, portentries: MutPtr<MutPtr<HcnPortRangeEntry>>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateGuestNetworkPortReservations(returncount.rawAddress.toString(), portentries.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnEnumerateLoadBalancers(query: Pcwstr, loadbalancer: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateLoadBalancers(query.rawAddress.toString(), loadbalancer.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnEnumerateNamespaces(query: Pcwstr, namespaces: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNamespaces(query.rawAddress.toString(), namespaces.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnEnumerateNetworks(query: Pcwstr, networks: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNetworks(query.rawAddress.toString(), networks.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnFreeGuestNetworkPortReservations(portentries: MutPtr<HcnPortRangeEntry>) {
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) {
        wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnFreeGuestNetworkPortReservations(portentries.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun hcnModifyEndpoint(endpoint: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnModifyEndpoint(endpoint.rawAddress.toString(), settings.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnModifyGuestNetworkService(guestnetworkservice: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnModifyGuestNetworkService(guestnetworkservice.rawAddress.toString(), settings.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnModifyLoadBalancer(loadbalancer: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnModifyLoadBalancer(loadbalancer.rawAddress.toString(), settings.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnModifyNamespace(namespace: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnModifyNamespace(namespace.rawAddress.toString(), settings.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnModifyNetwork(network: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnModifyNetwork(network.rawAddress.toString(), settings.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnOpenEndpoint(id: ConstPtr<Guid>, endpoint: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnOpenEndpoint(id.rawAddress.toString(), endpoint.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnOpenLoadBalancer(id: ConstPtr<Guid>, loadbalancer: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnOpenLoadBalancer(id.rawAddress.toString(), loadbalancer.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnOpenNamespace(id: ConstPtr<Guid>, namespace: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnOpenNamespace(id.rawAddress.toString(), namespace.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnOpenNetwork(id: ConstPtr<Guid>, network: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnOpenNetwork(id.rawAddress.toString(), network.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnQueryEndpointAddresses(endpoint: ConstPtr<CVoid>, query: Pcwstr, addresses: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointAddresses(endpoint.rawAddress.toString(), query.rawAddress.toString(), addresses.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnQueryEndpointProperties(endpoint: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointProperties(endpoint.rawAddress.toString(), query.rawAddress.toString(), properties.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnQueryEndpointStats(endpoint: ConstPtr<CVoid>, query: Pcwstr, stats: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointStats(endpoint.rawAddress.toString(), query.rawAddress.toString(), stats.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnQueryLoadBalancerProperties(loadbalancer: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnQueryLoadBalancerProperties(loadbalancer.rawAddress.toString(), query.rawAddress.toString(), properties.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnQueryNamespaceProperties(namespace: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnQueryNamespaceProperties(namespace.rawAddress.toString(), query.rawAddress.toString(), properties.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnQueryNetworkProperties(network: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnQueryNetworkProperties(network.rawAddress.toString(), query.rawAddress.toString(), properties.rawAddress.toString(), errorrecord.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnRegisterGuestNetworkServiceCallback(guestnetworkservice: ConstPtr<CVoid>, callback: HcnNotificationCallback, context: ConstPtr<CVoid>, callbackhandle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnRegisterGuestNetworkServiceCallback(guestnetworkservice.rawAddress.toString(), 0L.toString(), context.rawAddress.toString(), callbackhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnRegisterServiceCallback(callback: HcnNotificationCallback, context: ConstPtr<CVoid>, callbackhandle: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnRegisterServiceCallback(0L.toString(), context.rawAddress.toString(), callbackhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: Handle): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnReserveGuestNetworkServicePort(guestnetworkservice: ConstPtr<CVoid>, protocol: HcnPortProtocol, access: HcnPortAccess, port: UShort, portreservationhandle: MutPtr<Handle>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePort(guestnetworkservice.rawAddress.toString(), protocol, access, port.toInt(), portreservationhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnReserveGuestNetworkServicePortRange(guestnetworkservice: ConstPtr<CVoid>, portcount: UShort, portrangereservation: MutPtr<HcnPortRangeReservation>, portreservationhandle: MutPtr<Handle>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePortRange(guestnetworkservice.rawAddress.toString(), portcount.toInt(), portrangereservation.rawAddress.toString(), portreservationhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnUnregisterGuestNetworkServiceCallback(callbackhandle: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterGuestNetworkServiceCallback(callbackhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun hcnUnregisterServiceCallback(callbackhandle: ConstPtr<CVoid>): Hresult =
    if (windowsWin32SystemHostcomputenetworkNapiAvailable) wasmWindowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterServiceCallback(callbackhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
