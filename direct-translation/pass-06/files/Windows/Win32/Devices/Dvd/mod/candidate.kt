// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AACS_BINDING_NONCE` (
    public var `BindingNonce`: UByteArray,
    public var `MAC`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AACS_BINDING_NONCE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AACS_BINDING_NONCE`.Companion.`default`() : `AACS_BINDING_NONCE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 20 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 92 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AACS_CERTIFICATE` (
    public var `Nonce`: UByteArray,
    public var `Certificate`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AACS_CERTIFICATE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AACS_CERTIFICATE`.Companion.`default`() : `AACS_CERTIFICATE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 40 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AACS_CHALLENGE_KEY` (
    public var `EllipticCurvePoint`: UByteArray,
    public var `Signature`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AACS_CHALLENGE_KEY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AACS_CHALLENGE_KEY`.Companion.`default`() : `AACS_CHALLENGE_KEY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AACS_MEDIA_ID` (
    public var `MediaID`: UByteArray,
    public var `MAC`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AACS_MEDIA_ID`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AACS_MEDIA_ID`.Companion.`default`() : `AACS_MEDIA_ID` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AACS_READ_BINDING_NONCE` (
    public var `SessionId`: UInt,
    public var `NumberOfSectors`: UInt,
    public var `StartLba`: ULong,
    public var `Anonymous`: `AACS_READ_BINDING_NONCE_0`,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AACS_READ_BINDING_NONCE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AACS_READ_BINDING_NONCE`.Companion.`default`() : `AACS_READ_BINDING_NONCE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 58:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union AACS_READ_BINDING_NONCE_0 {
//     pub Handle: super::super::Foundation::HANDLE,
//     pub ForceStructureLengthToMatch64bit: u64,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AACS_READ_BINDING_NONCE_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AACS_READ_BINDING_NONCE_0`.Companion.`default`() : `AACS_READ_BINDING_NONCE_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AACS_SEND_CERTIFICATE` (
    public var `SessionId`: UInt,
    public var `Certificate`: `AACS_CERTIFICATE`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `AACS_SEND_CHALLENGE_KEY` (
    public var `SessionId`: UInt,
    public var `ChallengeKey`: `AACS_CHALLENGE_KEY`,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AACS_SERIAL_NUMBER` (
    public var `PrerecordedSerialNumber`: UByteArray,
    public var `MAC`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AACS_SERIAL_NUMBER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AACS_SERIAL_NUMBER`.Companion.`default`() : `AACS_SERIAL_NUMBER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `AACS_VOLUME_ID` (
    public var `VolumeID`: UByteArray,
    public var `MAC`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `AACS_VOLUME_ID`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `AACS_VOLUME_ID`.Companion.`default`() : `AACS_VOLUME_ID` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 7 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BD_DISC_WRITE_PROTECT_PAC` (
    public var `Header`: `BD_PAC_HEADER`,
    public var `KnownPACEntireDiscFlags`: UByte,
    public var `Reserved1`: UByteArray,
    public var `WriteProtectControlByte`: UByte,
    public var `Reserved2`: UByteArray,
    public var `WriteProtectPassword`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `BD_DISC_WRITE_PROTECT_PAC`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `BD_DISC_WRITE_PROTECT_PAC`.Companion.`default`() : `BD_DISC_WRITE_PROTECT_PAC` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 256 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 112 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `BD_PAC_HEADER` (
    public var `PACId`: UByteArray,
    public var `PACFormatNumber`: UByte,
    public var `PACUpdateCount`: UByteArray,
    public var `UnknownPACRules`: UByteArray,
    public var `UnkownPACEntireDiscFlag`: UByte,
    public var `Reserved1`: UByteArray,
    public var `NumberOfSegments`: UByte,
    public var `Segments`: UByteArray,
    public var `Reserved2`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `BD_PAC_HEADER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `BD_PAC_HEADER`.Companion.`default`() : `BD_PAC_HEADER` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `DISC_CONTROL_BLOCK_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_ASF` (
    public var `Reserved0`: UByteArray,
    public var `_bitfield`: UByte,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_ASF`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_ASF`.Companion.`default`() : `DVD_ASF` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_BCA_DESCRIPTOR` (
    public var `BCAInformation`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_BCA_DESCRIPTOR`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_BCA_DESCRIPTOR`.Companion.`default`() : `DVD_BCA_DESCRIPTOR` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_BD_SPARE_AREA_INFORMATION` (
    public var `Reserved1`: UByteArray,
    public var `NumberOfFreeSpareBlocks`: UByteArray,
    public var `NumberOfAllocatedSpareBlocks`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_BD_SPARE_AREA_INFORMATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_BD_SPARE_AREA_INFORMATION`.Companion.`default`() : `DVD_BD_SPARE_AREA_INFORMATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DVD_CGMS_COPY_ONCE`: UInt = 16u;
public const val `DVD_CGMS_COPY_PERMITTED`: UInt = 0u;
public const val `DVD_CGMS_COPY_PROTECT_MASK`: UInt = 24u;
public const val `DVD_CGMS_NO_COPY`: UInt = 24u;
public const val `DVD_CGMS_RESERVED_MASK`: UInt = 120u;
public const val `DVD_COPYRIGHTED`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_COPYRIGHT_DESCRIPTOR` (
    public var `CopyrightProtectionType`: UByte,
    public var `RegionManagementInformation`: UByte,
    public var `Reserved`: UShort,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR` (
    public var `Anonymous`: `DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0`,
    public var `Reserved0`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR`.Companion.`default`() : `DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 194:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0 {
//     pub Dvdrom: DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_0,
//     pub DvdRecordable_Version1: DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_1,
//     pub Dvdram: DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_2,
//     pub DvdRecordable: DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_3,
//     pub CPR_MAI: u8,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0`.Companion.`default`() : `DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_1` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_3` (
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_2` (
    public var `Reserved0003`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_COPYRIGHT_MANAGEMENT_DESCRIPTOR_0_0` (
    public var `_bitfield`: UByte,
)
public const val `DVD_COPYRIGHT_MASK`: UInt = 64u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_COPY_PROTECT_KEY` (
    public var `KeyLength`: UInt,
    public var `SessionId`: UInt,
    public var `KeyType`: `DVD_KEY_TYPE`,
    public var `KeyFlags`: UInt,
    public var `Parameters`: `DVD_COPY_PROTECT_KEY_0`,
    public var `KeyData`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_COPY_PROTECT_KEY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_COPY_PROTECT_KEY`.Companion.`default`() : `DVD_COPY_PROTECT_KEY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 244:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C, packed(1))]
// #[derive(Clone, Copy)]
// pub union DVD_COPY_PROTECT_KEY_0 {
//     pub FileHandle: super::super::Foundation::HANDLE,
//     pub TitleOffset: i64,
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_COPY_PROTECT_KEY_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_COPY_PROTECT_KEY_0`.Companion.`default`() : `DVD_COPY_PROTECT_KEY_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_DESCRIPTOR_HEADER` (
    public var `Length`: UShort,
    public var `Reserved`: UByteArray,
    public var `Data`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_DESCRIPTOR_HEADER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_DESCRIPTOR_HEADER`.Companion.`default`() : `DVD_DESCRIPTOR_HEADER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_DISC_CONTROL_BLOCK_HEADER` (
    public var `ContentDescriptor`: UByteArray,
    public var `ProhibitedActions`: `DVD_DISC_CONTROL_BLOCK_HEADER_0`,
    public var `VendorId`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_DISC_CONTROL_BLOCK_HEADER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_DISC_CONTROL_BLOCK_HEADER`.Companion.`default`() : `DVD_DISC_CONTROL_BLOCK_HEADER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 279:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DVD_DISC_CONTROL_BLOCK_HEADER_0 {
//     pub Anonymous: DVD_DISC_CONTROL_BLOCK_HEADER_0_0,
//     pub AsByte: [u8; 4],
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_DISC_CONTROL_BLOCK_HEADER_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_DISC_CONTROL_BLOCK_HEADER_0`.Companion.`default`() : `DVD_DISC_CONTROL_BLOCK_HEADER_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_DISC_CONTROL_BLOCK_HEADER_0_0` (
    public var `ReservedDoNotUse_UseAsByteInstead_0`: UByteArray,
    public var `_bitfield`: UByte,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_DISC_CONTROL_BLOCK_HEADER_0_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_DISC_CONTROL_BLOCK_HEADER_0_0`.Companion.`default`() : `DVD_DISC_CONTROL_BLOCK_HEADER_0_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_DISC_CONTROL_BLOCK_LIST` (
    public var `header`: `DVD_DISC_CONTROL_BLOCK_HEADER`,
    public var `Reserved0`: UByte,
    public var `ReadabldDCBs`: UByte,
    public var `Reserved1`: UByte,
    public var `WritableDCBs`: UByte,
    public var `Dcbs`: Array<`DVD_DISC_CONTROL_BLOCK_LIST_DCB`>,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_DISC_CONTROL_BLOCK_LIST`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_DISC_CONTROL_BLOCK_LIST`.Companion.`default`() : `DVD_DISC_CONTROL_BLOCK_LIST` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_DISC_CONTROL_BLOCK_LIST_DCB` (
    public var `DcbIdentifier`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_DISC_CONTROL_BLOCK_LIST_DCB`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_DISC_CONTROL_BLOCK_LIST_DCB`.Companion.`default`() : `DVD_DISC_CONTROL_BLOCK_LIST_DCB` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 22 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 504 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 24576 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_DISC_CONTROL_BLOCK_SESSION` (
    public var `header`: `DVD_DISC_CONTROL_BLOCK_HEADER`,
    public var `SessionNumber`: UByteArray,
    public var `Reserved0`: UByteArray,
    public var `DiscID`: UByteArray,
    public var `Reserved1`: UByteArray,
    public var `SessionItem`: Array<`DVD_DISC_CONTROL_BLOCK_SESSION_ITEM`>,
    public var `Reserved2`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_DISC_CONTROL_BLOCK_SESSION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_DISC_CONTROL_BLOCK_SESSION`.Companion.`default`() : `DVD_DISC_CONTROL_BLOCK_SESSION` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_DISC_CONTROL_BLOCK_SESSION_ITEM` (
    public var `AsByte`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_DISC_CONTROL_BLOCK_SESSION_ITEM`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_DISC_CONTROL_BLOCK_SESSION_ITEM`.Companion.`default`() : `DVD_DISC_CONTROL_BLOCK_SESSION_ITEM` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 16 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 32672 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT` (
    public var `header`: `DVD_DISC_CONTROL_BLOCK_HEADER`,
    public var `UpdateCount`: UByteArray,
    public var `WriteProtectActions`: `DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0`,
    public var `Reserved0`: UByteArray,
    public var `UpdatePassword`: UByteArray,
    public var `Reserved1`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT`.Companion.`default`() : `DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT` {
        return run { `core`.`mem`.`zeroed`() }
    }

// UNSUPPORTED Rust 367:1: declaration Union has no candidate rule; syntax: no per-file syntax rule for Union
// #[repr(C)]
// #[derive(Clone, Copy)]
// pub union DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0 {
//     pub Anonymous: DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0_0,
//     pub AsByte: [u8; 4],
// }

// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0`.Companion.`default`() : `DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0_0` (
    public var `ReservedDoNotUse_UseAsByteInstead_0`: UByteArray,
    public var `_bitfield`: UByte,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0_0`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0_0`.Companion.`default`() : `DVD_DISC_CONTROL_BLOCK_WRITE_INHIBIT_0_0` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2048 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_DISK_KEY_DESCRIPTOR` (
    public var `DiskKeyData`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_DISK_KEY_DESCRIPTOR`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_DISK_KEY_DESCRIPTOR`.Companion.`default`() : `DVD_DISK_KEY_DESCRIPTOR` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_DUAL_LAYER_JUMP_INTERVAL_SIZE` (
    public var `Reserved1`: UByteArray,
    public var `JumpIntervalSize`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_DUAL_LAYER_JUMP_INTERVAL_SIZE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_DUAL_LAYER_JUMP_INTERVAL_SIZE`.Companion.`default`() : `DVD_DUAL_LAYER_JUMP_INTERVAL_SIZE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_DUAL_LAYER_MANUAL_LAYER_JUMP` (
    public var `Reserved1`: UByteArray,
    public var `ManualJumpLayerAddress`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_DUAL_LAYER_MANUAL_LAYER_JUMP`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_DUAL_LAYER_MANUAL_LAYER_JUMP`.Companion.`default`() : `DVD_DUAL_LAYER_MANUAL_LAYER_JUMP` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_DUAL_LAYER_MIDDLE_ZONE_START_ADDRESS` (
    public var `_bitfield`: UByte,
    public var `Reserved1`: UByteArray,
    public var `ShiftedMiddleAreaStartAddress`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_DUAL_LAYER_MIDDLE_ZONE_START_ADDRESS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_DUAL_LAYER_MIDDLE_ZONE_START_ADDRESS`.Companion.`default`() : `DVD_DUAL_LAYER_MIDDLE_ZONE_START_ADDRESS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_DUAL_LAYER_RECORDING_INFORMATION` (
    public var `_bitfield`: UByte,
    public var `Reserved1`: UByteArray,
    public var `Layer0Sectors`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_DUAL_LAYER_RECORDING_INFORMATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_DUAL_LAYER_RECORDING_INFORMATION`.Companion.`default`() : `DVD_DUAL_LAYER_RECORDING_INFORMATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_DUAL_LAYER_REMAPPING_INFORMATION` (
    public var `Reserved1`: UByteArray,
    public var `RemappingAddress`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_DUAL_LAYER_REMAPPING_INFORMATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_DUAL_LAYER_REMAPPING_INFORMATION`.Companion.`default`() : `DVD_DUAL_LAYER_REMAPPING_INFORMATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Rust fixed array length 2031 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_FULL_LAYER_DESCRIPTOR` (
    public var `commonHeader`: `DVD_LAYER_DESCRIPTOR`,
    public var `MediaSpecific`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_FULL_LAYER_DESCRIPTOR`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_FULL_LAYER_DESCRIPTOR`.Companion.`default`() : `DVD_FULL_LAYER_DESCRIPTOR` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `DVD_KEY_TYPE` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_LAYER_DESCRIPTOR` (
    public var `_bitfield1`: UByte,
    public var `_bitfield2`: UByte,
    public var `_bitfield3`: UByte,
    public var `_bitfield4`: UByte,
    public var `StartingDataSector`: UInt,
    public var `EndDataSector`: UInt,
    public var `EndLayerZeroSector`: UInt,
    public var `_bitfield5`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_LIST_OF_RECOGNIZED_FORMAT_LAYERS` (
    public var `TypeCodeOfFormatLayer`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_LIST_OF_RECOGNIZED_FORMAT_LAYERS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_LIST_OF_RECOGNIZED_FORMAT_LAYERS`.Companion.`default`() : `DVD_LIST_OF_RECOGNIZED_FORMAT_LAYERS` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_LIST_OF_RECOGNIZED_FORMAT_LAYERS_TYPE_CODE` (
    public var `NumberOfRecognizedFormatLayers`: UByte,
    public var `_bitfield`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2048 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_MANUFACTURER_DESCRIPTOR` (
    public var `ManufacturingInformation`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_MANUFACTURER_DESCRIPTOR`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_MANUFACTURER_DESCRIPTOR`.Companion.`default`() : `DVD_MANUFACTURER_DESCRIPTOR` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DVD_NOT_COPYRIGHTED`: UInt = 0u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 6 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 24 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_PRERECORDED_INFORMATION` (
    public var `FieldID_1`: UByte,
    public var `DiscApplicationCode`: UByte,
    public var `DiscPhysicalCode`: UByte,
    public var `LastAddressOfDataRecordableArea`: UByteArray,
    public var `_bitfield`: UByte,
    public var `Reserved0`: UByte,
    public var `FieldID_2`: UByte,
    public var `OpcSuggestedCode`: UByte,
    public var `WavelengthCode`: UByte,
    public var `WriteStrategyCode`: UByteArray,
    public var `Reserved2`: UByte,
    public var `FieldID_3`: UByte,
    public var `ManufacturerId_3`: UByteArray,
    public var `Reserved3`: UByte,
    public var `FieldID_4`: UByte,
    public var `ManufacturerId_4`: UByteArray,
    public var `Reserved4`: UByte,
    public var `FieldID_5`: UByte,
    public var `ManufacturerId_5`: UByteArray,
    public var `Reserved5`: UByte,
    public var `Reserved99`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_PRERECORDED_INFORMATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_PRERECORDED_INFORMATION`.Companion.`default`() : `DVD_PRERECORDED_INFORMATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_RAM_MEDIUM_STATUS` (
    public var `_bitfield`: UByte,
    public var `DiscTypeIdentification`: UByte,
    public var `Reserved2`: UByte,
    public var `MediaSpecificWriteInhibitInformation`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_RAM_RECORDING_TYPE` (
    public var `_bitfield`: UByte,
    public var `Reserved2`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_RAM_RECORDING_TYPE`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_RAM_RECORDING_TYPE`.Companion.`default`() : `DVD_RAM_RECORDING_TYPE` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_RAM_SPARE_AREA_INFORMATION` (
    public var `FreePrimarySpareSectors`: UByteArray,
    public var `FreeSupplementalSpareSectors`: UByteArray,
    public var `AllocatedSupplementalSpareSectors`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_RAM_SPARE_AREA_INFORMATION`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_RAM_SPARE_AREA_INFORMATION`.Companion.`default`() : `DVD_RAM_SPARE_AREA_INFORMATION` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_READ_STRUCTURE` (
    public var `BlockByteOffset`: Long,
    public var `Format`: `DVD_STRUCTURE_FORMAT`,
    public var `SessionId`: UInt,
    public var `LayerNumber`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 1 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_RECORDING_MANAGEMENT_AREA_DATA` (
    public var `LastRecordedRMASectorNumber`: UByteArray,
    public var `RMDBytes`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_RECORDING_MANAGEMENT_AREA_DATA`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_RECORDING_MANAGEMENT_AREA_DATA`.Companion.`default`() : `DVD_RECORDING_MANAGEMENT_AREA_DATA` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_REGION` (
    public var `CopySystem`: UByte,
    public var `RegionData`: UByte,
    public var `SystemRegion`: UByte,
    public var `ResetCount`: UByte,
)
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `DVD_RPC_KEY` (
    public var `_bitfield`: UByte,
    public var `RegionMask`: UByte,
    public var `RpcScheme`: UByte,
    public var `Reserved02`: UByte,
)
public const val `DVD_SECTOR_NOT_PROTECTED`: UInt = 0u;
public const val `DVD_SECTOR_PROTECTED`: UInt = 32u;
public const val `DVD_SECTOR_PROTECT_MASK`: UInt = 32u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_SET_RPC_KEY` (
    public var `PreferredDriveRegionCode`: UByte,
    public var `Reserved`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_SET_RPC_KEY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_SET_RPC_KEY`.Companion.`default`() : `DVD_SET_RPC_KEY` {
        return run { `core`.`mem`.`zeroed`() }
    }

public typealias `DVD_STRUCTURE_FORMAT` = Int;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_STRUCTURE_LIST_ENTRY` (
    public var `FormatCode`: UByte,
    public var `_bitfield`: UByte,
    public var `FormatLength`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_STRUCTURE_LIST_ENTRY`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_STRUCTURE_LIST_ENTRY`.Companion.`default`() : `DVD_STRUCTURE_LIST_ENTRY` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Rust fixed array length 4 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_UNIQUE_DISC_IDENTIFIER` (
    public var `Reserved0`: UByteArray,
    public var `RandomNumber`: UByteArray,
    public var `Year`: UByteArray,
    public var `Month`: UByteArray,
    public var `Day`: UByteArray,
    public var `Hour`: UByteArray,
    public var `Minute`: UByteArray,
    public var `Second`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_UNIQUE_DISC_IDENTIFIER`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_UNIQUE_DISC_IDENTIFIER`.Companion.`default`() : `DVD_UNIQUE_DISC_IDENTIFIER` {
        return run { `core`.`mem`.`zeroed`() }
    }

// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 3 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `DVD_WRITE_PROTECTION_STATUS` (
    public var `_bitfield`: UByte,
    public var `Reserved1`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `DVD_WRITE_PROTECTION_STATUS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `DVD_WRITE_PROTECTION_STATUS`.Companion.`default`() : `DVD_WRITE_PROTECTION_STATUS` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `DiscControlBlockList`: `DISC_CONTROL_BLOCK_TYPE` = -1;
public const val `DvdAsf`: `DVD_KEY_TYPE` = 5;
public const val `DvdBCADescriptor`: `DVD_STRUCTURE_FORMAT` = 3;
public const val `DvdBusKey1`: `DVD_KEY_TYPE` = 2;
public const val `DvdBusKey2`: `DVD_KEY_TYPE` = 3;
public const val `DvdChallengeKey`: `DVD_KEY_TYPE` = 1;
public const val `DvdCopyrightDescriptor`: `DVD_STRUCTURE_FORMAT` = 1;
public const val `DvdDiskKey`: `DVD_KEY_TYPE` = 128;
public const val `DvdDiskKeyDescriptor`: `DVD_STRUCTURE_FORMAT` = 2;
public const val `DvdGetRpcKey`: `DVD_KEY_TYPE` = 8;
public const val `DvdInvalidateAGID`: `DVD_KEY_TYPE` = 63;
public const val `DvdManufacturerDescriptor`: `DVD_STRUCTURE_FORMAT` = 4;
public const val `DvdMaxDescriptor`: `DVD_STRUCTURE_FORMAT` = 5;
public const val `DvdPhysicalDescriptor`: `DVD_STRUCTURE_FORMAT` = 0;
public const val `DvdSetRpcKey`: `DVD_KEY_TYPE` = 6;
public const val `DvdTitleKey`: `DVD_KEY_TYPE` = 4;
public const val `FormattingDiscControlBlock`: `DISC_CONTROL_BLOCK_TYPE` = 1178878720;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Rust fixed array length 2 and value/layout semantics require coder integration.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C)]
// Rust attribute (integration required): #[derive(Clone, Copy)]
public class `HD_DVD_R_MEDIUM_STATUS` (
    public var `_bitfield`: UByte,
    public var `NumberOfRemainingRMDsInRDZ`: UByte,
    public var `NumberOfRemainingRMDsInCurrentRMZ`: UByteArray,
) { companion object }
// INTEGRATION REQUIRED: Associated factory syntax only: companion extensions retain source method order. Integrate trait dispatch, cfg, visibility and ownership; collisions between trait methods require disambiguation.
// INTEGRATION REQUIRED: Calls keep their Rust paths and need source-faithful bindings; core::mem::zeroed is not implemented or replaced with a fabricated value.
// INTEGRATION REQUIRED: Rust unsafe blocks become Kotlin run value scopes; their safety obligations remain with the caller/integrator.
// INTEGRATION REQUIRED: Rust trait implementation: `Default` for `HD_DVD_R_MEDIUM_STATUS`; Kotlin companion extension is not a trait implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.

    public fun `HD_DVD_R_MEDIUM_STATUS`.Companion.`default`() : `HD_DVD_R_MEDIUM_STATUS` {
        return run { `core`.`mem`.`zeroed`() }
    }

public const val `IOCTL_AACS_END_SESSION`: UInt = 3363020u;
public const val `IOCTL_AACS_GENERATE_BINDING_NONCE`: UInt = 3395824u;
public const val `IOCTL_AACS_GET_CERTIFICATE`: UInt = 3363028u;
public const val `IOCTL_AACS_GET_CHALLENGE_KEY`: UInt = 3363032u;
public const val `IOCTL_AACS_READ_BINDING_NONCE`: UInt = 3363052u;
public const val `IOCTL_AACS_READ_MEDIA_ID`: UInt = 3363048u;
public const val `IOCTL_AACS_READ_MEDIA_KEY_BLOCK`: UInt = 3363012u;
public const val `IOCTL_AACS_READ_MEDIA_KEY_BLOCK_SIZE`: UInt = 3363008u;
public const val `IOCTL_AACS_READ_SERIAL_NUMBER`: UInt = 3363044u;
public const val `IOCTL_AACS_READ_VOLUME_ID`: UInt = 3363040u;
public const val `IOCTL_AACS_SEND_CERTIFICATE`: UInt = 3363024u;
public const val `IOCTL_AACS_SEND_CHALLENGE_KEY`: UInt = 3363036u;
public const val `IOCTL_AACS_START_SESSION`: UInt = 3363016u;
public const val `IOCTL_DVD_BASE`: Int = 51;
public const val `IOCTL_DVD_END_SESSION`: UInt = 3362828u;
public const val `IOCTL_DVD_GET_REGION`: UInt = 3362836u;
public const val `IOCTL_DVD_READ_KEY`: UInt = 3362820u;
public const val `IOCTL_DVD_READ_STRUCTURE`: UInt = 3363136u;
public const val `IOCTL_DVD_SEND_KEY`: UInt = 3362824u;
public const val `IOCTL_DVD_SEND_KEY2`: UInt = 3395608u;
public const val `IOCTL_DVD_SET_READ_AHEAD`: UInt = 3362832u;
public const val `IOCTL_DVD_START_SESSION`: UInt = 3362816u;
public const val `IOCTL_STORAGE_SET_READ_AHEAD`: UInt = 2966528u;
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
// Rust attribute (integration required): #[repr(C, packed(1))]
// Rust attribute (integration required): #[derive(Clone, Copy, Default)]
public class `STORAGE_SET_READ_AHEAD` (
    public var `TriggerAddress`: Long,
    public var `TargetAddress`: Long,
)
public const val `SessionInfoDiscControlBlock`: `DISC_CONTROL_BLOCK_TYPE` = 1396982528;
public const val `WriteInhibitDiscControlBlock`: `DISC_CONTROL_BLOCK_TYPE` = 1464091392;
