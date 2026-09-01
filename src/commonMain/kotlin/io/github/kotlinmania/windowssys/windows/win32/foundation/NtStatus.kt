// port-lint: source Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys.windows.win32.foundation

// Upstream lines 5674–5676 in Windows/Win32/Foundation/mod.rs:
//
//   pub type NTSTATUS = i32;
//   pub type NTSTATUS_FACILITY_CODE = u32;
//   pub type NTSTATUS_SEVERITY_CODE = u32;

public typealias NTSTATUS = Int
public typealias NTSTATUS_FACILITY_CODE = UInt
public typealias NTSTATUS_SEVERITY_CODE = UInt
