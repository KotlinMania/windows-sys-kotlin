// DIRECT DECLARATION CANDIDATE: unsupported Rust remains below; not adopted or ABI-validated.
// value 0
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: u128 literal bits use io.github.kotlinmania:bytes-kotlin:0.2.3 U128(high, low); integrate arithmetic/ABI separately. Literal decoding reuses num-bigint-kotlin, not a custom numeric parser.
// INTEGRATION REQUIRED: Initializer call/record syntax retains written evaluation order. Resolve constructors, parameter/field types and Rust const/value semantics; no call implementation is invented.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `V0`:`probe`.`Code`=`probe`.`Code`.`from_bits`(io.github.kotlinmania.bytes.U128(0uL, 0uL));
// value 1
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: u128 literal bits use io.github.kotlinmania:bytes-kotlin:0.2.3 U128(high, low); integrate arithmetic/ABI separately. Literal decoding reuses num-bigint-kotlin, not a custom numeric parser.
// INTEGRATION REQUIRED: Initializer call/record syntax retains written evaluation order. Resolve constructors, parameter/field types and Rust const/value semantics; no call implementation is invented.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `V1`:`probe`.`Code`=`probe`.`Code`.`from_bits`(io.github.kotlinmania.bytes.U128(0uL, 18446744073709551615uL));
// value 2
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: u128 literal bits use io.github.kotlinmania:bytes-kotlin:0.2.3 U128(high, low); integrate arithmetic/ABI separately. Literal decoding reuses num-bigint-kotlin, not a custom numeric parser.
// INTEGRATION REQUIRED: Initializer call/record syntax retains written evaluation order. Resolve constructors, parameter/field types and Rust const/value semantics; no call implementation is invented.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `V2`:`probe`.`Code`=`probe`.`Code`.`from_bits`(io.github.kotlinmania.bytes.U128(1uL, 0uL));
// value 3
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: u128 literal bits use io.github.kotlinmania:bytes-kotlin:0.2.3 U128(high, low); integrate arithmetic/ABI separately. Literal decoding reuses num-bigint-kotlin, not a custom numeric parser.
// INTEGRATION REQUIRED: Initializer call/record syntax retains written evaluation order. Resolve constructors, parameter/field types and Rust const/value semantics; no call implementation is invented.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `V3`:`probe`.`Code`=`probe`.`Code`.`from_bits`(io.github.kotlinmania.bytes.U128(9223372036854775808uL, 0uL));
// value 4
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: u128 literal bits use io.github.kotlinmania:bytes-kotlin:0.2.3 U128(high, low); integrate arithmetic/ABI separately. Literal decoding reuses num-bigint-kotlin, not a custom numeric parser.
// INTEGRATION REQUIRED: Initializer call/record syntax retains written evaluation order. Resolve constructors, parameter/field types and Rust const/value semantics; no call implementation is invented.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `V4`:`probe`.`Code`=`probe`.`Code`.`from_bits`(io.github.kotlinmania.bytes.U128(18446744073709551615uL, 18446744073709551615uL));
// value 5
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: u128 literal bits use io.github.kotlinmania:bytes-kotlin:0.2.3 U128(high, low); integrate arithmetic/ABI separately. Literal decoding reuses num-bigint-kotlin, not a custom numeric parser.
// INTEGRATION REQUIRED: Initializer call/record syntax retains written evaluation order. Resolve constructors, parameter/field types and Rust const/value semantics; no call implementation is invented.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `V5`:`probe`.`Code`=`probe`.`Code`.`from_bits`(io.github.kotlinmania.bytes.U128(1311768467463790320uL, 72623859790382856uL));
// value 6
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: u128 literal bits use io.github.kotlinmania:bytes-kotlin:0.2.3 U128(high, low); integrate arithmetic/ABI separately. Literal decoding reuses num-bigint-kotlin, not a custom numeric parser.
// INTEGRATION REQUIRED: Initializer call/record syntax retains written evaluation order. Resolve constructors, parameter/field types and Rust const/value semantics; no call implementation is invented.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `V6`:`probe`.`Code`=`probe`.`Code`.`from_bits`(io.github.kotlinmania.bytes.U128(0uL, 18446744073709551615uL));
// INTEGRATION REQUIRED: Record syntax only: integrate Rust layout, cfg, Copy/ownership and mutable-borrow restrictions; Kotlin class storage is not a Rust layout implementation.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public class `Key` ( public var `code`:`probe`.`Code`, public var `tag`:UInt )
// INTEGRATION REQUIRED: Rust const use-site value semantics versus Kotlin val initialization must be checked during adapter integration.
// INTEGRATION REQUIRED: u128 literal bits use io.github.kotlinmania:bytes-kotlin:0.2.3 U128(high, low); integrate arithmetic/ABI separately. Literal decoding reuses num-bigint-kotlin, not a custom numeric parser.
// INTEGRATION REQUIRED: Initializer call/record syntax retains written evaluation order. Resolve constructors, parameter/field types and Rust const/value semantics; no call implementation is invented.
// INTEGRATION REQUIRED: Resolve Rust path/import names in the destination module; spelling is preserved, not bound.
// INTEGRATION REQUIRED: Source structure/type spelling emitted; coder integration and semantic validation remain separate.
public val `KEY`:`Key`=`Key` ( /* tag first */ `tag` =7u, /* code second */ `code` =`probe`.`Code`.`from_bits`(io.github.kotlinmania.bytes.U128(0uL, 72623859790382856uL)) );
