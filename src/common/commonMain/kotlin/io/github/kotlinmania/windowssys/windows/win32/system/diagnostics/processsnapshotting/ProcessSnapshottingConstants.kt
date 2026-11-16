package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.processsnapshotting

public val PSS_CAPTURE_HANDLES: PssCaptureFlags = 4u

public val PSS_CAPTURE_HANDLE_BASIC_INFORMATION: PssCaptureFlags = 16u

public val PSS_CAPTURE_HANDLE_NAME_INFORMATION: PssCaptureFlags = 8u

public val PSS_CAPTURE_HANDLE_TRACE: PssCaptureFlags = 64u

public val PSS_CAPTURE_HANDLE_TYPE_SPECIFIC_INFORMATION: PssCaptureFlags = 32u

public val PSS_CAPTURE_IPT_TRACE: PssCaptureFlags = 8192u

public val PSS_CAPTURE_NONE: PssCaptureFlags = 0u

public val PSS_CAPTURE_RESERVED_00000002: PssCaptureFlags = 2u

public val PSS_CAPTURE_RESERVED_00000400: PssCaptureFlags = 1024u

public val PSS_CAPTURE_RESERVED_00004000: PssCaptureFlags = 16384u

public val PSS_CAPTURE_THREADS: PssCaptureFlags = 128u

public val PSS_CAPTURE_THREAD_CONTEXT: PssCaptureFlags = 256u

public val PSS_CAPTURE_THREAD_CONTEXT_EXTENDED: PssCaptureFlags = 512u

public val PSS_CAPTURE_VA_CLONE: PssCaptureFlags = 1u

public val PSS_CAPTURE_VA_SPACE: PssCaptureFlags = 2048u

public val PSS_CAPTURE_VA_SPACE_SECTION_INFORMATION: PssCaptureFlags = 4096u

public val PSS_CREATE_BREAKAWAY: PssCaptureFlags = 134217728u

public val PSS_CREATE_BREAKAWAY_OPTIONAL: PssCaptureFlags = 67108864u

public val PSS_CREATE_FORCE_BREAKAWAY: PssCaptureFlags = 268435456u

public val PSS_CREATE_MEASURE_PERFORMANCE: PssCaptureFlags = 1073741824u

public val PSS_CREATE_RELEASE_SECTION: PssCaptureFlags = 2147483648u

public val PSS_CREATE_USE_VM_ALLOCATIONS: PssCaptureFlags = 536870912u

public val PSS_DUPLICATE_CLOSE_SOURCE: PssDuplicateFlags = 1

public val PSS_DUPLICATE_NONE: PssDuplicateFlags = 0

public val PSS_HANDLE_HAVE_BASIC_INFORMATION: PssHandleFlags = 4

public val PSS_HANDLE_HAVE_NAME: PssHandleFlags = 2

public val PSS_HANDLE_HAVE_TYPE: PssHandleFlags = 1

public val PSS_HANDLE_HAVE_TYPE_SPECIFIC_INFORMATION: PssHandleFlags = 8

public val PSS_HANDLE_NONE: PssHandleFlags = 0

public val PSS_OBJECT_TYPE_EVENT: PssObjectType = 4

public val PSS_OBJECT_TYPE_MUTANT: PssObjectType = 3

public val PSS_OBJECT_TYPE_PROCESS: PssObjectType = 1

public val PSS_OBJECT_TYPE_SECTION: PssObjectType = 5

public val PSS_OBJECT_TYPE_SEMAPHORE: PssObjectType = 6

public val PSS_OBJECT_TYPE_THREAD: PssObjectType = 2

public val PSS_OBJECT_TYPE_UNKNOWN: PssObjectType = 0

public val PSS_PERF_RESOLUTION: UInt = 1000000u

public val PSS_PROCESS_FLAGS_FROZEN: PssProcessFlags = 16

public val PSS_PROCESS_FLAGS_NONE: PssProcessFlags = 0

public val PSS_PROCESS_FLAGS_PROTECTED: PssProcessFlags = 1

public val PSS_PROCESS_FLAGS_RESERVED_03: PssProcessFlags = 4

public val PSS_PROCESS_FLAGS_RESERVED_04: PssProcessFlags = 8

public val PSS_PROCESS_FLAGS_WOW64: PssProcessFlags = 2

public val PSS_QUERY_AUXILIARY_PAGES_INFORMATION: PssQueryInformationClass = 2

public val PSS_QUERY_HANDLE_INFORMATION: PssQueryInformationClass = 4

public val PSS_QUERY_HANDLE_TRACE_INFORMATION: PssQueryInformationClass = 6

public val PSS_QUERY_PERFORMANCE_COUNTERS: PssQueryInformationClass = 7

public val PSS_QUERY_PROCESS_INFORMATION: PssQueryInformationClass = 0

public val PSS_QUERY_THREAD_INFORMATION: PssQueryInformationClass = 5

public val PSS_QUERY_VA_CLONE_INFORMATION: PssQueryInformationClass = 1

public val PSS_QUERY_VA_SPACE_INFORMATION: PssQueryInformationClass = 3

public val PSS_THREAD_FLAGS_NONE: PssThreadFlags = 0

public val PSS_THREAD_FLAGS_TERMINATED: PssThreadFlags = 1

public val PSS_WALK_AUXILIARY_PAGES: PssWalkInformationClass = 0

public val PSS_WALK_HANDLES: PssWalkInformationClass = 2

public val PSS_WALK_THREADS: PssWalkInformationClass = 3

public val PSS_WALK_VA_SPACE: PssWalkInformationClass = 1
