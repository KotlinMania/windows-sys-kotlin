@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun hcnCloseEndpoint(endpoint: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCloseEndpoint")

public actual fun hcnCloseGuestNetworkService(guestnetworkservice: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCloseGuestNetworkService")

public actual fun hcnCloseLoadBalancer(loadbalancer: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCloseLoadBalancer")

public actual fun hcnCloseNamespace(namespace: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNamespace")

public actual fun hcnCloseNetwork(network: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCloseNetwork")

public actual fun hcnCreateEndpoint(network: ConstPtr<CVoid>, id: ConstPtr<Guid>, settings: Pcwstr, endpoint: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCreateEndpoint")

public actual fun hcnCreateGuestNetworkService(id: ConstPtr<Guid>, settings: Pcwstr, guestnetworkservice: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCreateGuestNetworkService")

public actual fun hcnCreateLoadBalancer(id: ConstPtr<Guid>, settings: Pcwstr, loadbalancer: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCreateLoadBalancer")

public actual fun hcnCreateNamespace(id: ConstPtr<Guid>, settings: Pcwstr, namespace: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNamespace")

public actual fun hcnCreateNetwork(id: ConstPtr<Guid>, settings: Pcwstr, network: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnCreateNetwork")

public actual fun hcnDeleteEndpoint(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteEndpoint")

public actual fun hcnDeleteGuestNetworkService(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteGuestNetworkService")

public actual fun hcnDeleteLoadBalancer(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteLoadBalancer")

public actual fun hcnDeleteNamespace(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNamespace")

public actual fun hcnDeleteNetwork(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnDeleteNetwork")

public actual fun hcnEnumerateEndpoints(query: Pcwstr, endpoints: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateEndpoints")

public actual fun hcnEnumerateGuestNetworkPortReservations(returncount: MutPtr<UInt>, portentries: MutPtr<MutPtr<HcnPortRangeEntry>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateGuestNetworkPortReservations")

public actual fun hcnEnumerateLoadBalancers(query: Pcwstr, loadbalancer: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateLoadBalancers")

public actual fun hcnEnumerateNamespaces(query: Pcwstr, namespaces: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNamespaces")

public actual fun hcnEnumerateNetworks(query: Pcwstr, networks: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnEnumerateNetworks")

public actual fun hcnFreeGuestNetworkPortReservations(portentries: MutPtr<HcnPortRangeEntry>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnFreeGuestNetworkPortReservations")

public actual fun hcnModifyEndpoint(endpoint: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnModifyEndpoint")

public actual fun hcnModifyGuestNetworkService(guestnetworkservice: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnModifyGuestNetworkService")

public actual fun hcnModifyLoadBalancer(loadbalancer: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnModifyLoadBalancer")

public actual fun hcnModifyNamespace(namespace: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNamespace")

public actual fun hcnModifyNetwork(network: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnModifyNetwork")

public actual fun hcnOpenEndpoint(id: ConstPtr<Guid>, endpoint: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnOpenEndpoint")

public actual fun hcnOpenLoadBalancer(id: ConstPtr<Guid>, loadbalancer: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnOpenLoadBalancer")

public actual fun hcnOpenNamespace(id: ConstPtr<Guid>, namespace: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNamespace")

public actual fun hcnOpenNetwork(id: ConstPtr<Guid>, network: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnOpenNetwork")

public actual fun hcnQueryEndpointAddresses(endpoint: ConstPtr<CVoid>, query: Pcwstr, addresses: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointAddresses")

public actual fun hcnQueryEndpointProperties(endpoint: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointProperties")

public actual fun hcnQueryEndpointStats(endpoint: ConstPtr<CVoid>, query: Pcwstr, stats: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnQueryEndpointStats")

public actual fun hcnQueryLoadBalancerProperties(loadbalancer: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnQueryLoadBalancerProperties")

public actual fun hcnQueryNamespaceProperties(namespace: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNamespaceProperties")

public actual fun hcnQueryNetworkProperties(network: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnQueryNetworkProperties")

public actual fun hcnRegisterGuestNetworkServiceCallback(guestnetworkservice: ConstPtr<CVoid>, callback: HcnNotificationCallback, context: ConstPtr<CVoid>, callbackhandle: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterGuestNetworkServiceCallback")

public actual fun hcnRegisterServiceCallback(callback: HcnNotificationCallback, context: ConstPtr<CVoid>, callbackhandle: MutPtr<MutPtr<CVoid>>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnRegisterServiceCallback")

public actual fun hcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnReleaseGuestNetworkServicePortReservationHandle")

public actual fun hcnReserveGuestNetworkServicePort(guestnetworkservice: ConstPtr<CVoid>, protocol: HcnPortProtocol, access: HcnPortAccess, port: UShort, portreservationhandle: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePort")

public actual fun hcnReserveGuestNetworkServicePortRange(guestnetworkservice: ConstPtr<CVoid>, portcount: UShort, portrangereservation: MutPtr<HcnPortRangeReservation>, portreservationhandle: MutPtr<Handle>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnReserveGuestNetworkServicePortRange")

public actual fun hcnUnregisterGuestNetworkServiceCallback(callbackhandle: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterGuestNetworkServiceCallback")

public actual fun hcnUnregisterServiceCallback(callbackhandle: ConstPtr<CVoid>): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemHostcomputenetworkHcnUnregisterServiceCallback")
