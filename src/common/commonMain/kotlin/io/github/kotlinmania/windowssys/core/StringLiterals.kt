package io.github.kotlinmania.windowssys.core

import io.github.kotlinmania.windowssys.Win32LiteralPool

/**
 * Returns a null-terminated UTF-8 string pointer (`PCSTR`) backed by [Win32LiteralPool].
 */
public fun s(literal: String): PCSTR = Win32LiteralPool.utf8Pointer(literal)

/**
 * Returns a null-terminated UTF-16LE wide string pointer (`PCWSTR`) backed by [Win32LiteralPool].
 */
public fun w(literal: String): PCWSTR = Win32LiteralPool.utf16Pointer(literal)
