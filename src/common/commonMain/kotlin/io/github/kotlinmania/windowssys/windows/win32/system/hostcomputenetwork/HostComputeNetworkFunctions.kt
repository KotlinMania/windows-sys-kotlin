package io.github.kotlinmania.windowssys.windows.win32.system.hostcomputenetwork

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun hcnCloseEndpoint(endpoint: ConstPtr<CVoid>): Hresult

public expect fun hcnCloseGuestNetworkService(guestnetworkservice: ConstPtr<CVoid>): Hresult

public expect fun hcnCloseLoadBalancer(loadbalancer: ConstPtr<CVoid>): Hresult

public expect fun hcnCloseNamespace(namespace: ConstPtr<CVoid>): Hresult

public expect fun hcnCloseNetwork(network: ConstPtr<CVoid>): Hresult

public expect fun hcnCreateEndpoint(network: ConstPtr<CVoid>, id: ConstPtr<Guid>, settings: Pcwstr, endpoint: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnCreateGuestNetworkService(id: ConstPtr<Guid>, settings: Pcwstr, guestnetworkservice: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnCreateLoadBalancer(id: ConstPtr<Guid>, settings: Pcwstr, loadbalancer: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnCreateNamespace(id: ConstPtr<Guid>, settings: Pcwstr, namespace: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnCreateNetwork(id: ConstPtr<Guid>, settings: Pcwstr, network: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnDeleteEndpoint(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnDeleteGuestNetworkService(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnDeleteLoadBalancer(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnDeleteNamespace(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnDeleteNetwork(id: ConstPtr<Guid>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnEnumerateEndpoints(query: Pcwstr, endpoints: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnEnumerateGuestNetworkPortReservations(returncount: MutPtr<UInt>, portentries: MutPtr<MutPtr<HcnPortRangeEntry>>): Hresult

public expect fun hcnEnumerateLoadBalancers(query: Pcwstr, loadbalancer: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnEnumerateNamespaces(query: Pcwstr, namespaces: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnEnumerateNetworks(query: Pcwstr, networks: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnFreeGuestNetworkPortReservations(portentries: MutPtr<HcnPortRangeEntry>)

public expect fun hcnModifyEndpoint(endpoint: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnModifyGuestNetworkService(guestnetworkservice: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnModifyLoadBalancer(loadbalancer: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnModifyNamespace(namespace: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnModifyNetwork(network: ConstPtr<CVoid>, settings: Pcwstr, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnOpenEndpoint(id: ConstPtr<Guid>, endpoint: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnOpenLoadBalancer(id: ConstPtr<Guid>, loadbalancer: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnOpenNamespace(id: ConstPtr<Guid>, namespace: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnOpenNetwork(id: ConstPtr<Guid>, network: MutPtr<MutPtr<CVoid>>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnQueryEndpointAddresses(endpoint: ConstPtr<CVoid>, query: Pcwstr, addresses: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnQueryEndpointProperties(endpoint: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnQueryEndpointStats(endpoint: ConstPtr<CVoid>, query: Pcwstr, stats: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnQueryLoadBalancerProperties(loadbalancer: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnQueryNamespaceProperties(namespace: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnQueryNetworkProperties(network: ConstPtr<CVoid>, query: Pcwstr, properties: MutPtr<Pwstr>, errorrecord: MutPtr<Pwstr>): Hresult

public expect fun hcnRegisterGuestNetworkServiceCallback(guestnetworkservice: ConstPtr<CVoid>, callback: HcnNotificationCallback, context: ConstPtr<CVoid>, callbackhandle: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun hcnRegisterServiceCallback(callback: HcnNotificationCallback, context: ConstPtr<CVoid>, callbackhandle: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun hcnReleaseGuestNetworkServicePortReservationHandle(portreservationhandle: Handle): Hresult

public expect fun hcnReserveGuestNetworkServicePort(guestnetworkservice: ConstPtr<CVoid>, protocol: HcnPortProtocol, access: HcnPortAccess, port: UShort, portreservationhandle: MutPtr<Handle>): Hresult

public expect fun hcnReserveGuestNetworkServicePortRange(guestnetworkservice: ConstPtr<CVoid>, portcount: UShort, portrangereservation: MutPtr<HcnPortRangeReservation>, portreservationhandle: MutPtr<Handle>): Hresult

public expect fun hcnUnregisterGuestNetworkServiceCallback(callbackhandle: ConstPtr<CVoid>): Hresult

public expect fun hcnUnregisterServiceCallback(callbackhandle: ConstPtr<CVoid>): Hresult
