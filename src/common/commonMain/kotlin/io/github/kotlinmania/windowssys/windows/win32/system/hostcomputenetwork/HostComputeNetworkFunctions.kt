package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun hcnCloseEndpoint(endpoint: ConstPtr): Hresult

public expect fun hcnCloseGuestNetworkService(guestnetworkservice: ConstPtr): Hresult

public expect fun hcnCloseLoadBalancer(loadbalancer: ConstPtr): Hresult

public expect fun hcnCloseNamespace(namespace: ConstPtr): Hresult

public expect fun hcnCloseNetwork(network: ConstPtr): Hresult

public expect fun hcnCreateEndpoint(network: ConstPtr, id: ConstPtr, settings: Pcwstr, endpoint: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnCreateGuestNetworkService(id: ConstPtr, settings: Pcwstr, guestnetworkservice: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnCreateLoadBalancer(id: ConstPtr, settings: Pcwstr, loadbalancer: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnCreateNamespace(id: ConstPtr, settings: Pcwstr, namespace: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnCreateNetwork(id: ConstPtr, settings: Pcwstr, network: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnDeleteEndpoint(id: ConstPtr, errorrecord: MutPtr): Hresult

public expect fun hcnDeleteGuestNetworkService(id: ConstPtr, errorrecord: MutPtr): Hresult

public expect fun hcnDeleteLoadBalancer(id: ConstPtr, errorrecord: MutPtr): Hresult

public expect fun hcnDeleteNamespace(id: ConstPtr, errorrecord: MutPtr): Hresult

public expect fun hcnDeleteNetwork(id: ConstPtr, errorrecord: MutPtr): Hresult

public expect fun hcnEnumerateEndpoints(query: Pcwstr, endpoints: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnEnumerateGuestNetworkPortReservations(returncount: MutPtr, portentries: MutPtr): Hresult

public expect fun hcnEnumerateLoadBalancers(query: Pcwstr, loadbalancer: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnEnumerateNamespaces(query: Pcwstr, namespaces: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnEnumerateNetworks(query: Pcwstr, networks: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnFreeGuestNetworkPortReservations(portentries: MutPtr)

public expect fun hcnModifyEndpoint(endpoint: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult

public expect fun hcnModifyGuestNetworkService(guestnetworkservice: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult

public expect fun hcnModifyLoadBalancer(loadbalancer: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult

public expect fun hcnModifyNamespace(namespace: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult

public expect fun hcnModifyNetwork(network: ConstPtr, settings: Pcwstr, errorrecord: MutPtr): Hresult

public expect fun hcnOpenEndpoint(id: ConstPtr, endpoint: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnOpenLoadBalancer(id: ConstPtr, loadbalancer: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnOpenNamespace(id: ConstPtr, namespace: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnOpenNetwork(id: ConstPtr, network: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnQueryEndpointAddresses(endpoint: ConstPtr, query: Pcwstr, addresses: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnQueryEndpointProperties(endpoint: ConstPtr, query: Pcwstr, properties: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnQueryEndpointStats(endpoint: ConstPtr, query: Pcwstr, stats: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnQueryLoadBalancerProperties(loadbalancer: ConstPtr, query: Pcwstr, properties: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnQueryNamespaceProperties(namespace: ConstPtr, query: Pcwstr, properties: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnQueryNetworkProperties(network: ConstPtr, query: Pcwstr, properties: MutPtr, errorrecord: MutPtr): Hresult

public expect fun hcnRegisterGuestNetworkServiceCallback(guestnetworkservice: ConstPtr, callback: HcnNotificationCallback, context: ConstPtr, callbackhandle: MutPtr): Hresult

public expect fun hcnRegisterServiceCallback(callback: HcnNotificationCallback, context: ConstPtr, callbackhandle: MutPtr): Hresult

public expect fun hcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: Handle): Hresult

public expect fun hcnReserveGuestNetworkServicePort(guestnetworkservice: ConstPtr, protocol: HcnPortProtocol, access: HcnPortAccess, port: UShort, portreservationhandle: MutPtr): Hresult

public expect fun hcnReserveGuestNetworkServicePortRange(guestnetworkservice: ConstPtr, portcount: UShort, portrangereservation: MutPtr, portreservationhandle: MutPtr): Hresult

public expect fun hcnUnregisterGuestNetworkServiceCallback(callbackhandle: ConstPtr): Hresult

public expect fun hcnUnregisterServiceCallback(callbackhandle: ConstPtr): Hresult
