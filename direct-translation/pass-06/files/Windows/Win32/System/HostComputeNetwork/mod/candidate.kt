// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnCloseEndpoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnCloseEndpoint`(`endpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnCloseGuestNetworkService; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnCloseGuestNetworkService`(`guestnetworkservice` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnCloseLoadBalancer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnCloseLoadBalancer`(`loadbalancer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnCloseNamespace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnCloseNamespace`(`namespace` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnCloseNetwork; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnCloseNetwork`(`network` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnCreateEndpoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnCreateEndpoint`(`network` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `id` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `settings` : `windows_sys`.`core`.`PCWSTR`, `endpoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnCreateGuestNetworkService; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnCreateGuestNetworkService`(`id` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `settings` : `windows_sys`.`core`.`PCWSTR`, `guestnetworkservice` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnCreateLoadBalancer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnCreateLoadBalancer`(`id` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `settings` : `windows_sys`.`core`.`PCWSTR`, `loadbalancer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnCreateNamespace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnCreateNamespace`(`id` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `settings` : `windows_sys`.`core`.`PCWSTR`, `namespace` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnCreateNetwork; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnCreateNetwork`(`id` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `settings` : `windows_sys`.`core`.`PCWSTR`, `network` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnDeleteEndpoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnDeleteEndpoint`(`id` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnDeleteGuestNetworkService; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnDeleteGuestNetworkService`(`id` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnDeleteLoadBalancer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnDeleteLoadBalancer`(`id` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnDeleteNamespace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnDeleteNamespace`(`id` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnDeleteNetwork; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnDeleteNetwork`(`id` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnEnumerateEndpoints; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnEnumerateEndpoints`(`query` : `windows_sys`.`core`.`PCWSTR`, `endpoints` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnEnumerateGuestNetworkPortReservations; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnEnumerateGuestNetworkPortReservations`(`returncount` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UIntVar>?, `portentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`HCN_PORT_RANGE_ENTRY`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnEnumerateLoadBalancers; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnEnumerateLoadBalancers`(`query` : `windows_sys`.`core`.`PCWSTR`, `loadbalancer` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnEnumerateNamespaces; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnEnumerateNamespaces`(`query` : `windows_sys`.`core`.`PCWSTR`, `namespaces` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnEnumerateNetworks; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnEnumerateNetworks`(`query` : `windows_sys`.`core`.`PCWSTR`, `networks` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnFreeGuestNetworkPortReservations; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnFreeGuestNetworkPortReservations`(`portentries` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HCN_PORT_RANGE_ENTRY`>?)
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnModifyEndpoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnModifyEndpoint`(`endpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `settings` : `windows_sys`.`core`.`PCWSTR`, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnModifyGuestNetworkService; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnModifyGuestNetworkService`(`guestnetworkservice` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `settings` : `windows_sys`.`core`.`PCWSTR`, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnModifyLoadBalancer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnModifyLoadBalancer`(`loadbalancer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `settings` : `windows_sys`.`core`.`PCWSTR`, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnModifyNamespace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnModifyNamespace`(`namespace` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `settings` : `windows_sys`.`core`.`PCWSTR`, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnModifyNetwork; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnModifyNetwork`(`network` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `settings` : `windows_sys`.`core`.`PCWSTR`, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnOpenEndpoint; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnOpenEndpoint`(`id` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `endpoint` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnOpenLoadBalancer; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnOpenLoadBalancer`(`id` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `loadbalancer` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnOpenNamespace; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnOpenNamespace`(`id` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `namespace` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnOpenNetwork; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnOpenNetwork`(`id` : /* Rust *const */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`GUID`>?, `network` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnQueryEndpointAddresses; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnQueryEndpointAddresses`(`endpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `query` : `windows_sys`.`core`.`PCWSTR`, `addresses` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnQueryEndpointProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnQueryEndpointProperties`(`endpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `query` : `windows_sys`.`core`.`PCWSTR`, `properties` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnQueryEndpointStats; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnQueryEndpointStats`(`endpoint` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `query` : `windows_sys`.`core`.`PCWSTR`, `stats` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnQueryLoadBalancerProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnQueryLoadBalancerProperties`(`loadbalancer` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `query` : `windows_sys`.`core`.`PCWSTR`, `properties` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnQueryNamespaceProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnQueryNamespaceProperties`(`namespace` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `query` : `windows_sys`.`core`.`PCWSTR`, `properties` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnQueryNetworkProperties; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnQueryNetworkProperties`(`network` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `query` : `windows_sys`.`core`.`PCWSTR`, `properties` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?, `errorrecord` : /* Rust *mut */ kotlinx.cinterop.CPointer<`windows_sys`.`core`.`PWSTR`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnRegisterGuestNetworkServiceCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnRegisterGuestNetworkServiceCallback`(`guestnetworkservice` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callback` : `HCN_NOTIFICATION_CALLBACK`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callbackhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnRegisterServiceCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnRegisterServiceCallback`(`callback` : `HCN_NOTIFICATION_CALLBACK`, `context` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `callbackhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.CPointerVar<`core`.`ffi`.`c_void`>>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnReleaseGuestNetworkServicePortReservationHandle; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnReleaseGuestNetworkServicePortReservationHandle`(`portreservationhandle` : `super`.`super`.`Foundation`.`HANDLE`) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnReserveGuestNetworkServicePort; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnReserveGuestNetworkServicePort`(`guestnetworkservice` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `protocol` : `HCN_PORT_PROTOCOL`, `access` : `HCN_PORT_ACCESS`, `port` : UShort, `portreservationhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnReserveGuestNetworkServicePortRange; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnReserveGuestNetworkServicePortRange`(`guestnetworkservice` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `portcount` : UShort, `portrangereservation` : /* Rust *mut */ kotlinx.cinterop.CPointer<`HCN_PORT_RANGE_RESERVATION`>?, `portreservationhandle` : /* Rust *mut */ kotlinx.cinterop.CPointer<`super`.`super`.`Foundation`.`HANDLE`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnUnregisterGuestNetworkServiceCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnUnregisterGuestNetworkServiceCallback`(`callbackhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=computenetwork.dll, ABI=system, export=HcnUnregisterServiceCallback; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `HcnUnregisterServiceCallback`(`callbackhandle` : /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?) : `windows_sys`.`core`.`HRESULT`
public typealias `HCN_NOTIFICATIONS` = Int;
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Native callback ABI=system, unsafe=true; integrate the matching native bridge.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public typealias `HCN_NOTIFICATION_CALLBACK` = `Option`<kotlinx.cinterop.CPointer<kotlinx.cinterop.CFunction<(UInt, /* Rust *const */ kotlinx.cinterop.CPointer<`core`.`ffi`.`c_void`>?, `windows_sys`.`core`.`HRESULT`, `windows_sys`.`core`.`PCWSTR`) -> Unit>>>;
public typealias `HCN_PORT_ACCESS` = Int;
public const val `HCN_PORT_ACCESS_EXCLUSIVE`: `HCN_PORT_ACCESS` = 1;
public const val `HCN_PORT_ACCESS_SHARED`: `HCN_PORT_ACCESS` = 2;
public typealias `HCN_PORT_PROTOCOL` = Int;
public const val `HCN_PORT_PROTOCOL_BOTH`: `HCN_PORT_PROTOCOL` = 3;
public const val `HCN_PORT_PROTOCOL_TCP`: `HCN_PORT_PROTOCOL` = 1;
public const val `HCN_PORT_PROTOCOL_UDP`: `HCN_PORT_PROTOCOL` = 2;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HCN_PORT_RANGE_ENTRY` (
    public var `OwningPartitionId`: `windows_sys`.`core`.`GUID`,
    public var `TargetPartitionId`: `windows_sys`.`core`.`GUID`,
    public var `Protocol`: `HCN_PORT_PROTOCOL`,
    public var `Priority`: ULong,
    public var `ReservationType`: UInt,
    public var `SharingFlags`: UInt,
    public var `DeliveryMode`: UInt,
    public var `StartingPort`: UShort,
    public var `EndingPort`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `HCN_PORT_RANGE_RESERVATION` (
    public var `startingPort`: UShort,
    public var `endingPort`: UShort,
)
public const val `HcnNotificationFlagsReserved`: `HCN_NOTIFICATIONS` = -268435456;
public const val `HcnNotificationGuestNetworkServiceCreate`: `HCN_NOTIFICATIONS` = 7;
public const val `HcnNotificationGuestNetworkServiceDelete`: `HCN_NOTIFICATIONS` = 8;
public const val `HcnNotificationGuestNetworkServiceInterfaceStateChanged`: `HCN_NOTIFICATIONS` = 18;
public const val `HcnNotificationGuestNetworkServiceStateChanged`: `HCN_NOTIFICATIONS` = 17;
public const val `HcnNotificationInvalid`: `HCN_NOTIFICATIONS` = 0;
public const val `HcnNotificationNamespaceCreate`: `HCN_NOTIFICATIONS` = 5;
public const val `HcnNotificationNamespaceDelete`: `HCN_NOTIFICATIONS` = 6;
public const val `HcnNotificationNetworkCreate`: `HCN_NOTIFICATIONS` = 2;
public const val `HcnNotificationNetworkDelete`: `HCN_NOTIFICATIONS` = 4;
public const val `HcnNotificationNetworkEndpointAttached`: `HCN_NOTIFICATIONS` = 9;
public const val `HcnNotificationNetworkEndpointDetached`: `HCN_NOTIFICATIONS` = 16;
public const val `HcnNotificationNetworkPreCreate`: `HCN_NOTIFICATIONS` = 1;
public const val `HcnNotificationNetworkPreDelete`: `HCN_NOTIFICATIONS` = 3;
public const val `HcnNotificationServiceDisconnect`: `HCN_NOTIFICATIONS` = 16777216;
