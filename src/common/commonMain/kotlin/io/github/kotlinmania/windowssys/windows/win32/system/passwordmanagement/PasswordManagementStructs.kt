@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.passwordmanagement

import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

public data class CypherBlock(
    public var data: ByteArray = ByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CypherBlock) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CypherBlock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CypherBlock> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): CypherBlock =
                    CypherBlock(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (8).toInt())
                        ).readNative(addr).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: CypherBlock) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (8).toInt())
                    ).writeNative(addr, value.data.toList())
                }
            }
    }
}

public data class EncryptedLmOwfPassword(
    public var data: List<CypherBlock> = List(2) { CypherBlock() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EncryptedLmOwfPassword> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EncryptedLmOwfPassword> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): EncryptedLmOwfPassword =
                    EncryptedLmOwfPassword(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(CypherBlock.typeLayout(), (2).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: EncryptedLmOwfPassword) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(CypherBlock.typeLayout(), (2).toInt())
                    ).writeNative(addr, value.data)
                }
            }
    }
}

public data class LmOwfPassword(
    public var data: List<CypherBlock> = List(2) { CypherBlock() },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LmOwfPassword> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LmOwfPassword> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): LmOwfPassword =
                    LmOwfPassword(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(CypherBlock.typeLayout(), (2).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: LmOwfPassword) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(CypherBlock.typeLayout(), (2).toInt())
                    ).writeNative(addr, value.data)
                }
            }
    }
}

public data class SamprEncryptedUserPassword(
    public var buffer: UByteArray = UByteArray(516),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SamprEncryptedUserPassword) return false
        if (!this.buffer.contentEquals(other.buffer)) return false
        return true
    }

    override fun hashCode(): Int = this.buffer.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SamprEncryptedUserPassword> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SamprEncryptedUserPassword> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 516L
                override fun readNative(addr: Long): SamprEncryptedUserPassword =
                    SamprEncryptedUserPassword(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (516).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SamprEncryptedUserPassword) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (516).toInt())
                    ).writeNative(addr, value.buffer.toList())
                }
            }
    }
}
