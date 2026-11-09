@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32SystemHostcomputenetworkNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun HcnCloseEndpoint(endpoint: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnCloseEndpoint(endpoint.toString()) as Int) else 0

public actual fun HcnCloseGuestNetworkService(guestnetworkservice: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnCloseGuestNetworkService(guestnetworkservice.toString()) as Int) else 0

public actual fun HcnCloseLoadBalancer(loadbalancer: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnCloseLoadBalancer(loadbalancer.toString()) as Int) else 0

public actual fun HcnCloseNamespace(namespace: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnCloseNamespace(namespace.toString()) as Int) else 0

public actual fun HcnCloseNetwork(network: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnCloseNetwork(network.toString()) as Int) else 0

public actual fun HcnCreateEndpoint(network: Long, id: Long, settings: PCWSTR, endpoint: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnCreateEndpoint(network.toString(), id.toString(), settings.toString(), endpoint.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnCreateGuestNetworkService(id: Long, settings: PCWSTR, guestnetworkservice: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnCreateGuestNetworkService(id.toString(), settings.toString(), guestnetworkservice.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnCreateLoadBalancer(id: Long, settings: PCWSTR, loadbalancer: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnCreateLoadBalancer(id.toString(), settings.toString(), loadbalancer.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnCreateNamespace(id: Long, settings: PCWSTR, namespace: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnCreateNamespace(id.toString(), settings.toString(), namespace.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnCreateNetwork(id: Long, settings: PCWSTR, network: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnCreateNetwork(id.toString(), settings.toString(), network.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnDeleteEndpoint(id: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteEndpoint(id.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnDeleteGuestNetworkService(id: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteGuestNetworkService(id.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnDeleteLoadBalancer(id: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteLoadBalancer(id.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnDeleteNamespace(id: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteNamespace(id.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnDeleteNetwork(id: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnDeleteNetwork(id.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnEnumerateEndpoints(query: PCWSTR, endpoints: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateEndpoints(query.toString(), endpoints.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnEnumerateGuestNetworkPortReservations(returncount: Long, portentries: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateGuestNetworkPortReservations(returncount.toString(), portentries.toString()) as Int) else 0

public actual fun HcnEnumerateLoadBalancers(query: PCWSTR, loadbalancer: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateLoadBalancers(query.toString(), loadbalancer.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnEnumerateNamespaces(query: PCWSTR, namespaces: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateNamespaces(query.toString(), namespaces.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnEnumerateNetworks(query: PCWSTR, networks: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnEnumerateNetworks(query.toString(), networks.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnFreeGuestNetworkPortReservations(portentries: Long) {
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) {
        _windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnFreeGuestNetworkPortReservations(portentries.toString())
    }
}

public actual fun HcnModifyEndpoint(endpoint: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnModifyEndpoint(endpoint.toString(), settings.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnModifyGuestNetworkService(guestnetworkservice: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnModifyGuestNetworkService(guestnetworkservice.toString(), settings.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnModifyLoadBalancer(loadbalancer: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnModifyLoadBalancer(loadbalancer.toString(), settings.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnModifyNamespace(namespace: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnModifyNamespace(namespace.toString(), settings.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnModifyNetwork(network: Long, settings: PCWSTR, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnModifyNetwork(network.toString(), settings.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnOpenEndpoint(id: Long, endpoint: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnOpenEndpoint(id.toString(), endpoint.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnOpenLoadBalancer(id: Long, loadbalancer: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnOpenLoadBalancer(id.toString(), loadbalancer.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnOpenNamespace(id: Long, namespace: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnOpenNamespace(id.toString(), namespace.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnOpenNetwork(id: Long, network: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnOpenNetwork(id.toString(), network.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnQueryEndpointAddresses(endpoint: Long, query: PCWSTR, addresses: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointAddresses(endpoint.toString(), query.toString(), addresses.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnQueryEndpointProperties(endpoint: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointProperties(endpoint.toString(), query.toString(), properties.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnQueryEndpointStats(endpoint: Long, query: PCWSTR, stats: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnQueryEndpointStats(endpoint.toString(), query.toString(), stats.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnQueryLoadBalancerProperties(loadbalancer: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnQueryLoadBalancerProperties(loadbalancer.toString(), query.toString(), properties.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnQueryNamespaceProperties(namespace: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnQueryNamespaceProperties(namespace.toString(), query.toString(), properties.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnQueryNetworkProperties(network: Long, query: PCWSTR, properties: Long, errorrecord: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnQueryNetworkProperties(network.toString(), query.toString(), properties.toString(), errorrecord.toString()) as Int) else 0

public actual fun HcnRegisterGuestNetworkServiceCallback(guestnetworkservice: Long, callback: HCN_NOTIFICATION_CALLBACK, context: Long, callbackhandle: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnRegisterGuestNetworkServiceCallback(guestnetworkservice.toString(), callback.toLong().toString(), context.toString(), callbackhandle.toString()) as Int) else 0

public actual fun HcnRegisterServiceCallback(callback: HCN_NOTIFICATION_CALLBACK, context: Long, callbackhandle: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnRegisterServiceCallback(callback.toLong().toString(), context.toString(), callbackhandle.toString()) as Int) else 0

public actual fun HcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: HANDLE): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle.toString()) as Int) else 0

public actual fun HcnReserveGuestNetworkServicePort(guestnetworkservice: Long, protocol: HCN_PORT_PROTOCOL, access: HCN_PORT_ACCESS, port: UShort, portreservationhandle: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnReserveGuestNetworkServicePort(guestnetworkservice.toString(), protocol, access, port.toInt(), portreservationhandle.toString()) as Int) else 0

public actual fun HcnReserveGuestNetworkServicePortRange(guestnetworkservice: Long, portcount: UShort, portrangereservation: Long, portreservationhandle: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnReserveGuestNetworkServicePortRange(guestnetworkservice.toString(), portcount.toInt(), portrangereservation.toString(), portreservationhandle.toString()) as Int) else 0

public actual fun HcnUnregisterGuestNetworkServiceCallback(callbackhandle: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnUnregisterGuestNetworkServiceCallback(callbackhandle.toString()) as Int) else 0

public actual fun HcnUnregisterServiceCallback(callbackhandle: Long): HRESULT =
    if (_windowsWin32SystemHostcomputenetworkNapiAddon != null) (_windowsWin32SystemHostcomputenetworkNapiAddon.windowssys_windows_win32_system_hostcomputenetwork_HcnUnregisterServiceCallback(callbackhandle.toString()) as Int) else 0
