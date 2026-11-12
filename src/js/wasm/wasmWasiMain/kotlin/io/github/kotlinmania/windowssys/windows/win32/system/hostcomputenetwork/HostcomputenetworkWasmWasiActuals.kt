@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun hcnCloseEndpoint(endpoint: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCloseEndpoint")

public actual fun hcnCloseGuestNetworkService(guestnetworkservice: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCloseGuestNetworkService")

public actual fun hcnCloseLoadBalancer(loadbalancer: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCloseLoadBalancer")

public actual fun hcnCloseNamespace(namespace: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNamespace")

public actual fun hcnCloseNetwork(network: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNetwork")

public actual fun hcnCreateEndpoint(network: ConstPtr, id: ConstPtr, settings: Pcwstr, endpoint: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCreateEndpoint")

public actual fun hcnCreateGuestNetworkService(id: ConstPtr, settings: Pcwstr, guestnetworkservice: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCreateGuestNetworkService")

public actual fun hcnCreateLoadBalancer(id: ConstPtr, settings: Pcwstr, loadbalancer: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCreateLoadBalancer")

public actual fun hcnCreateNamespace(id: ConstPtr, settings: Pcwstr, namespace: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNamespace")

public actual fun hcnCreateNetwork(id: ConstPtr, settings: Pcwstr, network: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNetwork")

public actual fun hcnDeleteEndpoint(id: ConstPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteEndpoint")

public actual fun hcnDeleteGuestNetworkService(id: ConstPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteGuestNetworkService")

public actual fun hcnDeleteLoadBalancer(id: ConstPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteLoadBalancer")

public actual fun hcnDeleteNamespace(id: ConstPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNamespace")

public actual fun hcnDeleteNetwork(id: ConstPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNetwork")

public actual fun hcnEnumerateEndpoints(query: Pcwstr, endpoints: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateEndpoints")

public actual fun hcnEnumerateGuestNetworkPortReservations(returncount: MutPtr, portentries: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateGuestNetworkPortReservations")

public actual fun hcnEnumerateLoadBalancers(query: Pcwstr, loadbalancer: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateLoadBalancers")

public actual fun hcnEnumerateNamespaces(query: Pcwstr, namespaces: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNamespaces")

public actual fun hcnEnumerateNetworks(query: Pcwstr, networks: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNetworks")

public actual fun hcnFreeGuestNetworkPortReservations(portentries: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnFreeGuestNetworkPortReservations")

public actual fun hcnModifyEndpoint(endpoint: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnModifyEndpoint")

public actual fun hcnModifyGuestNetworkService(guestnetworkservice: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnModifyGuestNetworkService")

public actual fun hcnModifyLoadBalancer(loadbalancer: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnModifyLoadBalancer")

public actual fun hcnModifyNamespace(namespace: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNamespace")

public actual fun hcnModifyNetwork(network: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNetwork")

public actual fun hcnOpenEndpoint(id: ConstPtr, endpoint: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnOpenEndpoint")

public actual fun hcnOpenLoadBalancer(id: ConstPtr, loadbalancer: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnOpenLoadBalancer")

public actual fun hcnOpenNamespace(id: ConstPtr, namespace: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNamespace")

public actual fun hcnOpenNetwork(id: ConstPtr, network: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNetwork")

public actual fun hcnQueryEndpointAddresses(endpoint: ConstPtr, query: Pcwstr, addresses: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointAddresses")

public actual fun hcnQueryEndpointProperties(endpoint: ConstPtr, query: Pcwstr, properties: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointProperties")

public actual fun hcnQueryEndpointStats(endpoint: ConstPtr, query: Pcwstr, stats: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointStats")

public actual fun hcnQueryLoadBalancerProperties(loadbalancer: ConstPtr, query: Pcwstr, properties: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnQueryLoadBalancerProperties")

public actual fun hcnQueryNamespaceProperties(namespace: ConstPtr, query: Pcwstr, properties: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNamespaceProperties")

public actual fun hcnQueryNetworkProperties(network: ConstPtr, query: Pcwstr, properties: MutPtr, errorrecord: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNetworkProperties")

public actual fun hcnRegisterGuestNetworkServiceCallback(guestnetworkservice: ConstPtr, callback: HcnNotificationCallback, context: ConstPtr, callbackhandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterGuestNetworkServiceCallback")

public actual fun hcnRegisterServiceCallback(callback: HcnNotificationCallback, context: ConstPtr, callbackhandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterServiceCallback")

public actual fun hcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnReleaseGuestNetworkServicePortReservationHandle")

public actual fun hcnReserveGuestNetworkServicePort(guestnetworkservice: ConstPtr, protocol: HcnPortProtocol, access: HcnPortAccess, port: UShort, portreservationhandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePort")

public actual fun hcnReserveGuestNetworkServicePortRange(guestnetworkservice: ConstPtr, portcount: UShort, portrangereservation: MutPtr, portreservationhandle: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePortRange")

public actual fun hcnUnregisterGuestNetworkServiceCallback(callbackhandle: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterGuestNetworkServiceCallback")

public actual fun hcnUnregisterServiceCallback(callbackhandle: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterServiceCallback")
