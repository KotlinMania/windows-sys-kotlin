// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: External declaration shape only: wire DLL=netapi32.dll, ABI=system, export=Netbios; preserve Rust unsafe-call contract.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public external fun `Netbios`(`pncb` : /* Rust *mut */ kotlinx.cinterop.CPointer<`NCB`>?) : UByte
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `ACTION_HEADER` (
    public var `transport_id`: UInt,
    public var `action_code`: UShort,
    public var `reserved`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `ADAPTER_STATUS` (
    public var `adapter_address`: UByteArray,
    public var `rev_major`: UByte,
    public var `reserved0`: UByte,
    public var `adapter_type`: UByte,
    public var `rev_minor`: UByte,
    public var `duration`: UShort,
    public var `frmr_recv`: UShort,
    public var `frmr_xmit`: UShort,
    public var `iframe_recv_err`: UShort,
    public var `xmit_aborts`: UShort,
    public var `xmit_success`: UInt,
    public var `recv_success`: UInt,
    public var `iframe_xmit_err`: UShort,
    public var `recv_buff_unavail`: UShort,
    public var `t1_timeouts`: UShort,
    public var `ti_timeouts`: UShort,
    public var `reserved1`: UInt,
    public var `free_ncbs`: UShort,
    public var `max_cfg_ncbs`: UShort,
    public var `max_ncbs`: UShort,
    public var `xmit_buf_unavail`: UShort,
    public var `max_dgram_size`: UShort,
    public var `pending_sess`: UShort,
    public var `max_cfg_sess`: UShort,
    public var `max_sess`: UShort,
    public var `max_sess_pkt_size`: UShort,
    public var `name_count`: UShort,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `ADAPTER_STATUS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `ADAPTER_STATUS`.Companion.`default`() : `ADAPTER_STATUS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `ALL_TRANSPORTS`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("M\u0000\u0000\u0000");
public const val `ASYNCH`: UInt = 128u;
public const val `CALL_PENDING`: UInt = 2u;
public const val `DEREGISTERED`: UInt = 5u;
public const val `DUPLICATE`: UInt = 6u;
public const val `DUPLICATE_DEREG`: UInt = 7u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 18 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `FIND_NAME_BUFFER` (
    public var `length`: UByte,
    public var `access_control`: UByte,
    public var `frame_control`: UByte,
    public var `destination_addr`: UByteArray,
    public var `source_addr`: UByteArray,
    public var `routing_info`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `FIND_NAME_BUFFER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `FIND_NAME_BUFFER`.Companion.`default`() : `FIND_NAME_BUFFER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `FIND_NAME_HEADER` (
    public var `node_count`: UShort,
    public var `reserved`: UByte,
    public var `unique_group`: UByte,
)
public const val `GROUP_NAME`: UInt = 128u;
public const val `HANGUP_COMPLETE`: UInt = 5u;
public const val `HANGUP_PENDING`: UInt = 4u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 255 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `LANA_ENUM` (
    public var `length`: UByte,
    public var `lana`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `LANA_ENUM`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `LANA_ENUM`.Companion.`default`() : `LANA_ENUM` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `LISTEN_OUTSTANDING`: UInt = 1u;
public const val `MAX_LANA`: UInt = 254u;
// INTEGRATION REQUIRED: Rust windows_sys::core::s! is emitted as a call shape. Supply its source-faithful UTF-8 *const u8 static-storage adapter: append one trailing NUL, preserve embedded NULs and keep pointer storage alive. No pointer allocation, adapter implementation or namespace binding is supplied here.
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `MS_NBF`: `windows_sys`.`core`.`PCSTR` = `windows_sys`.`core`.`s`("MNBF");
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NAME_BUFFER` (
    public var `name`: UByteArray,
    public var `name_num`: UByte,
    public var `name_flags`: UByte,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `NAME_BUFFER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `NAME_BUFFER`.Companion.`default`() : `NAME_BUFFER` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `NAME_FLAGS_MASK`: UInt = 135u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 10 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(target_arch = "x86")]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NCB` (
    public var `ncb_command`: UByte,
    public var `ncb_retcode`: UByte,
    public var `ncb_lsn`: UByte,
    public var `ncb_num`: UByte,
    public var `ncb_buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ncb_length`: UShort,
    public var `ncb_callname`: UByteArray,
    public var `ncb_name`: UByteArray,
    public var `ncb_rto`: UByte,
    public var `ncb_sto`: UByte,
    public var `ncb_post`: Long,
    public var `ncb_lana_num`: UByte,
    public var `ncb_cmd_cplt`: UByte,
    public var `ncb_reserve`: UByteArray,
    public var `ncb_event`: `super`.`super`.`Foundation`.`HANDLE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `NCB`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(target_arch = "x86")]

    public fun `NCB`.Companion.`default`() : `NCB` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Raw pointer levels/nullability retained; bind native pointee storage and preserve Rust const/mut restrictions.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 18 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `NCB` (
    public var `ncb_command`: UByte,
    public var `ncb_retcode`: UByte,
    public var `ncb_lsn`: UByte,
    public var `ncb_num`: UByte,
    public var `ncb_buffer`: /* Rust *mut */ kotlinx.cinterop.CPointer<kotlinx.cinterop.UByteVar>?,
    public var `ncb_length`: UShort,
    public var `ncb_callname`: UByteArray,
    public var `ncb_name`: UByteArray,
    public var `ncb_rto`: UByte,
    public var `ncb_sto`: UByte,
    public var `ncb_post`: Long,
    public var `ncb_lana_num`: UByte,
    public var `ncb_cmd_cplt`: UByte,
    public var `ncb_reserve`: UByteArray,
    public var `ncb_event`: `super`.`super`.`Foundation`.`HANDLE`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `NCB`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[cfg(any(target_arch = "aarch64", target_arch = "arm64ec", target_arch = "x86_64"))]

    public fun `NCB`.Companion.`default`() : `NCB` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `NCBACTION`: UInt = 119u;
public const val `NCBADDGRNAME`: UInt = 54u;
public const val `NCBADDNAME`: UInt = 48u;
public const val `NCBASTAT`: UInt = 51u;
public const val `NCBCALL`: UInt = 16u;
public const val `NCBCANCEL`: UInt = 53u;
public const val `NCBCHAINSEND`: UInt = 23u;
public const val `NCBCHAINSENDNA`: UInt = 114u;
public const val `NCBDELNAME`: UInt = 49u;
public const val `NCBDGRECV`: UInt = 33u;
public const val `NCBDGRECVBC`: UInt = 35u;
public const val `NCBDGSEND`: UInt = 32u;
public const val `NCBDGSENDBC`: UInt = 34u;
public const val `NCBENUM`: UInt = 55u;
public const val `NCBFINDNAME`: UInt = 120u;
public const val `NCBHANGUP`: UInt = 18u;
public const val `NCBLANSTALERT`: UInt = 115u;
public const val `NCBLISTEN`: UInt = 17u;
public const val `NCBNAMSZ`: UInt = 16u;
public const val `NCBRECV`: UInt = 21u;
public const val `NCBRECVANY`: UInt = 22u;
public const val `NCBRESET`: UInt = 50u;
public const val `NCBSEND`: UInt = 20u;
public const val `NCBSENDNA`: UInt = 113u;
public const val `NCBSSTAT`: UInt = 52u;
public const val `NCBTRACE`: UInt = 121u;
public const val `NCBUNLINK`: UInt = 112u;
public const val `NRC_ACTSES`: UInt = 15u;
public const val `NRC_BADDR`: UInt = 7u;
public const val `NRC_BRIDGE`: UInt = 35u;
public const val `NRC_BUFLEN`: UInt = 1u;
public const val `NRC_CANCEL`: UInt = 38u;
public const val `NRC_CANOCCR`: UInt = 36u;
public const val `NRC_CMDCAN`: UInt = 11u;
public const val `NRC_CMDTMO`: UInt = 5u;
public const val `NRC_DUPENV`: UInt = 48u;
public const val `NRC_DUPNAME`: UInt = 13u;
public const val `NRC_ENVNOTDEF`: UInt = 52u;
public const val `NRC_GOODRET`: UInt = 0u;
public const val `NRC_IFBUSY`: UInt = 33u;
public const val `NRC_ILLCMD`: UInt = 3u;
public const val `NRC_ILLNN`: UInt = 19u;
public const val `NRC_INCOMP`: UInt = 6u;
public const val `NRC_INUSE`: UInt = 22u;
public const val `NRC_INVADDRESS`: UInt = 57u;
public const val `NRC_INVDDID`: UInt = 59u;
public const val `NRC_LOCKFAIL`: UInt = 60u;
public const val `NRC_LOCTFUL`: UInt = 17u;
public const val `NRC_MAXAPPS`: UInt = 54u;
public const val `NRC_NAMCONF`: UInt = 25u;
public const val `NRC_NAMERR`: UInt = 23u;
public const val `NRC_NAMTFUL`: UInt = 14u;
public const val `NRC_NOCALL`: UInt = 20u;
public const val `NRC_NORES`: UInt = 9u;
public const val `NRC_NORESOURCES`: UInt = 56u;
public const val `NRC_NOSAPS`: UInt = 55u;
public const val `NRC_NOWILD`: UInt = 21u;
public const val `NRC_OPENERR`: UInt = 63u;
public const val `NRC_OSRESNOTAV`: UInt = 53u;
public const val `NRC_PENDING`: UInt = 255u;
public const val `NRC_REMTFUL`: UInt = 18u;
public const val `NRC_SABORT`: UInt = 24u;
public const val `NRC_SCLOSED`: UInt = 10u;
public const val `NRC_SNUMOUT`: UInt = 8u;
public const val `NRC_SYSTEM`: UInt = 64u;
public const val `NRC_TOOMANY`: UInt = 34u;
public const val `REGISTERED`: UInt = 4u;
public const val `REGISTERING`: UInt = 0u;
public const val `SESSION_ABORTED`: UInt = 6u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `SESSION_BUFFER` (
    public var `lsn`: UByte,
    public var `state`: UByte,
    public var `local_name`: UByteArray,
    public var `remote_name`: UByteArray,
    public var `rcvs_outstanding`: UByte,
    public var `sends_outstanding`: UByte,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `SESSION_BUFFER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `SESSION_BUFFER`.Companion.`default`() : `SESSION_BUFFER` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `SESSION_ESTABLISHED`: UInt = 3u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `SESSION_HEADER` (
    public var `sess_name`: UByte,
    public var `num_sess`: UByte,
    public var `rcv_dg_outstanding`: UByte,
    public var `rcv_any_outstanding`: UByte,
)
public const val `UNIQUE_NAME`: UInt = 0u;
