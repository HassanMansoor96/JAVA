/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package page476_UnderstandingThreads;


public class Summary {
    /*
Understanding Threads

Threads are used to run multiple tasks at once

»»Web browsers can download files while letting you view web pages. When you
download a file in a web browser, the browser starts a separate thread to
handle the download.

»»Email programs don’t make you wait for all your messages to download
before you can read the first message. Instead, these programs use separate
threads to display and download messages.
»»Word processors can print long documents in the background while you
continue to work. These programs start a separate thread to handle print
jobs.

»»Word processors can also check your spelling as you type. Depending on how
the word processor is written, it may run the spell check in a separate thread.
»»Game programs commonly use several threads to handle different parts of
the game to improve the overall responsiveness of the game.

»»All GUI-based programs use at least two threads — one thread to run the
application’s main logic and another thread to monitor mouse and keyboard
events. You find out about creating GUI programs in Java in Book 6.

»»Indeed, the Java Virtual Machine itself uses threading for some of its housekeeping
chores. The garbage collector, for example, runs as a separate thread
so it can constantly monitor the state of the VM’s memory and decide when it
needs to create some free memory by removing objects that are no longer
being used.
     */
}
